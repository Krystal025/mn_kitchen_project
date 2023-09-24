package com.project.user.service;

import com.project.exception.CustomException.NicknameAlreadyExistsException;
import com.project.exception.CustomException.UserNotFoundException;
import com.project.file_service.FileUploadService;
import com.project.security.TokenProvider;
import com.project.user.dao.PetMapper;
import com.project.user.dao.UserMapper;
import com.project.user.dto.UserDto;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Service
@Builder
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    //UserMapper 의존성추가
    private final UserMapper userMapper;
    //PetMapper 의존성추가
    private final PetMapper petMapper;
    //FileUploadService 의존성추가
    private final FileUploadService fileUploadService;
    //TokenProvider 의존성추가
    private final TokenProvider tokenProvider;
    //비밀번호 암호화
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<UserDto> getAllUsers() {
        return userMapper.getAllUsers();
    }

    //사용자 프로필을 업데이트하는 메서드
    @Override
    public String updateUser(UserDto userDto) throws NicknameAlreadyExistsException {
        log.info("Initial UserDto : {}", userDto);
        //기존 회원 정보 가져오기
        UserDto existingUser = userMapper.findByEmail(userDto.getUserEmail());
        //닉네임이 변경되었을 경우에만 중복 확인
        if(!existingUser.getUserNickname().equals(userDto.getUserNickname())){
            validateUserNickname(userDto.getUserNickname());
        }

        // 이미지가 있는 경우에만 업로드
        if (userDto.getUserImage() != null && !userDto.getUserImage().isEmpty()) {
            userDto = uploadImageAndUpdateProfile(userDto);
        } else {
            userDto.setUserImage(existingUser.getUserImage()); // or set to some default image
        }

        UserDto updatedUserDto = UserDto.builder()
                .userNum(userDto.getUserNum())
                .userEmail(userDto.getUserEmail())
                .userNickname(userDto.getUserNickname())
                .userGender(userDto.getUserGender())
                .userBirthday(userDto.getUserBirthday() != null ? userDto.getUserBirthday() : existingUser.getUserBirthday())
                .userProfile(userDto.getUserProfile())
                .userIntroduction(userDto.getUserIntroduction() != null ? userDto.getUserIntroduction() : existingUser.getUserIntroduction())
                .build();

        //DB에 회원 정보 업데이트
        userMapper.updateUser(updatedUserDto);

        //업데이트된 회원 정보 다시 가져오기(userEmail로 사용하여 조회)
        UserDto refreshedUser = userMapper.findByEmail(updatedUserDto.getUserEmail());
        log.info("Initial UserDto : {}", userDto);
        //회원정보 수정 후 새로운 토큰 생성
        return generateNewToken(updatedUserDto);
    }

    // 닉네임 중복 검사
    private void validateUserNickname(String userNickname) {
        int count = userMapper.findUserByNickname(userNickname);
        if(count > 0) {
            throw new IllegalArgumentException("Duplicate nickname");
        }
    }

    // 이미지 업로드 및 프로필 경로 업데이트
    private UserDto uploadImageAndUpdateProfile(UserDto userDto) {
        String imagePath = fileUploadService.uploadFile(userDto.getUserImage());
        return userDto.toBuilder().userProfile(imagePath).build();
    }

    // 새 토큰 생성
    private String generateNewToken(UserDto updatedUserDto) {
        System.out.println(updatedUserDto);
        return tokenProvider.create(updatedUserDto);
    }

    //회원탈퇴 메서드(Update Status)
    @Override
    public void deactivateUser(int userNum) {
        //사용자의 Status를 'INACTIVE'로 변경
        userMapper.updateUserStatus("INACTIVE", userNum);
    }
    @Override
    public void userActive(int userNum) {
        //사용자의 Status를 'INACTIVE'로 변경
        userMapper.userActive("ACTIVE", userNum);
    }

    @Override
    public String updatePassword(UserDto userDto) {
// 새 비밀번호를 BCrypt 알고리즘을 사용하여 암호화합니다.
        String encryptedPassword = passwordEncoder.encode(userDto.getUserNewPassword());

        // 암호화된 새 비밀번호를 DTO에 설정합니다.
        userDto.setUserNewPassword(encryptedPassword);

        // 암호화된 새 비밀번호를 데이터베이스에 업데이트합니다.
        userMapper.updatePassword(userDto);

        return "Password updated successfully";
    }
    //회원의 사진과 한줄소개를 조회
    @Override
    public UserDto getUserProfileAndIntroduction(String userEmail) {
        System.out.println(userEmail);
        UserDto dto=userMapper.findProfileAndIntroduction(userEmail);
        System.out.println(dto);
        return dto;
    }


}