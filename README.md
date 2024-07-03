# Team Project
<b>Acorn 아카데미 Team Project  "멍냥키친 프로젝트"</b>
- 프로젝트 GitHub : https://github.com/titlejjk/mn-project
- 프로젝트 일정 : 2023/08/12 ~ 2023/09/22
- 프로젝트 참여인원 : FrontEnd 4명 BackEnd 3명
<br/>

## 프로젝트 개요
---
### 목적
- 반려동물 관련 레시피 공유 
- 레시피 댓글 기능을 통한 사용자 간 정보 공유 및 소통 기능 제공
- 반려동물 기념일을 공유할 수 있는 커뮤니티 기능 제공

### 주요 기능
- 레시피 업로드, 수정, 삭제 
- 레시피 검색 및 카테고리 별 분류 
- 관리자의 회원 관리
<br/>

## 기술 스택
---
### FrontEnd
<div style="display : flex">
    <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" />
    <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white" />
    <img src="https://img.shields.io/badge/AXIOS-5A29E4?style=for-the-badge&logo=AXIOS&logoColor=white" />
    <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white" />
    <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"/> 
    <img src="https://img.shields.io/badge/slides-E4637C?style=for-the-badge&logo=SlickSlide&logoColor=white" />
    <img src="https://img.shields.io/badge/reactrouter-CA4245?style=for-the-badge&logo=ReactRouter&logoColor=white" />
    <img src="https://img.shields.io/badge/fontawesome-528DD7?style=for-the-badge&logo=FontAwesome&logoColor=white" />
    <img src="https://img.shields.io/badge/visualstudiocode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white"/> 
    <img src="https://img.shields.io/badge/adobeillustrator-FF9A00?style=for-the-badge&logo=adobeillustrator&logoColor=white"/>
</div>
<br/>

### BackEnd
<div style="display : flex">
    <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white"/>
    <img src="https://img.shields.io/badge/mariadb-003545?style=for-the-badge&logo=mariadb&logoColor=white"/>
    <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/> 
    <img src="https://img.shields.io/badge/springsecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"/> 
    <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"/>
    <img src="https://img.shields.io/badge/myBatis-181717?style=for-the-badge&logo=myBatis&logoColor=white"/> 
    <img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/> 
</div>
<br/>

### Tools
<div style="display : flex">
    <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"/> 
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=gitHub&logoColor=white"/> 
    <img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"/>
    <img src="https://img.shields.io/badge/jirasoftware-0052CC?style=for-the-badge&logo=jirasoftware&logoColor=white"/> 
    <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"/> 
    <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"/>
</div>
<br/>

### Java 11
- 주 프로그래밍 언어로 Java 11을 선택하였습니다.

### React.js
- 사용자 인터페이스를 구성하기 위해 React.js를 사용하였습니다. 
- 컴포넌트 기반의 개발로 빠르고 유지보수가 쉬운 프론트엔드를 구축할 수 있습니다.

### Spring Boot
- 백엔드 개발 프레임워크로 Spring Boot를 사용하였습니다. 
- Spring Boot의 다양한 스타터 패키지와 보안 기능이 이 프로젝트에 유용하다고 판단하였습니다.

### MariaDB와 MyBatis
- 데이터베이스로는 MariaDB를 선택하였고, ORM으로 MyBatis를 사용하였습니다. 
- MariaDB는 MySQL과 호환성이 뛰어나면서도 더 나은 성능을 보여주기에 선택하게 되었습니다. 
- MyBatis는 직관적인 SQL 쿼리 작성이 가능하여 선택하게 되었습니다.

### Gradle
- 빌드 도구로는 Gradle을 사용하였습니다. 
- Gradle은 빠른 빌드 속도와 유연한 설정이 가능하여 이 프로젝트에 적합하다고 판단하였습니다.

### Git, GitHub
- 소스 코드 버전 관리는 Git을 사용하고, 협업은 GitHub를 통해 이루어졌습니다. 
- GitHub의 Pull Request와 Code Review 기능을 활용하여 코드 품질을 높였습니다.
- 버전관리 전략으로는 Git Flow를 이용하여 진행하였습니다.
- 모든 브랜치는 Pull Request에 리뷰를 진행한 후 merge를 진행합니다.
<br/>

## Git Branch 관리 전략
---
- Main : 배포시 사용합니다.
- Develop : 기능 테스트 통과부분에 대해서 Merge를 진행합니다.
- Feature : 기능 개발 시 사용합니다.
<br/>

## 테스트 
---
- JUnit을 활용한 테스트 코드 작성
- Postman을 활용하여 단위 테스트를 진행하였습니다. 
<br/>

## 팀원 및 구현기능   
---
|조준근|김수정|이준규|백민규|이슬아|정혜영|조새은|
|----|----|----|-----|----|-----|-----|
|![back1](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/79a34f52-78a0-4bf7-81ce-28e6a017be87)|![back3](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/470e1c50-0c0d-4c9a-b440-ac63da1adc85)|![back2](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/26fec934-aa4f-431d-84f1-ba4820e4556c)|![front3](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/f13c6227-22db-4d95-815e-d3520a98ece9) |![front4](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/4f6aad9c-2a8e-4f9d-924c-6664201c5ffa)|![front2](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/d5f7c15f-2d56-4040-8ad3-4fe85e6815d3)|![front1](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/ec9d0788-c13d-4684-a4d1-75fa88a14466)|

### [BackEnd]
<b>조준근 (조장)</b> 
- 관리자 및 회원정보 담당
- 팔로우 기능
- 요구사항 정의서 작성
- FlowChart 작성장
- MQTT

<b>김수정</b>
- 레시피/축하파티 게시판
- 이미지 업로드 기능
- 댓글, 좋아요, 페이징처리 기능
- 게시글 카테고리 분류
- 유스케이스 작성
- README.md 작성

<b>이준규</b>
- 공지사항 게시판
- 파일 업로드 기능
- 시퀀스 다이어그램 작성
- 회원관리 기능
<br/>

### [FrontEnd]
<b>백민규</b>
- 공지사항/레시피/축하파티 상세페이지
- MQTT

<b>이슬아</b>
- 프론트엔드 Git 총괄
- 메인페이지 (홈화면)
- 공지사항/레시피/축하파티 글 작성페이지
- PPT 내용정리 

<b>정혜영</b>
- 전체 프로젝트 디자인 담당
- 로그인 및 회원가입 
- 비밀번호 변경
- 마이페이지, 관리자 페이지 
- PPT 디자인

<b>조새은</b>
- 프로젝트 서기
- Jira 정리 총괄
- 공지사항/레시피/축하파티 메인페이지
- 팀 프로젝트 Git 관리
- README 작성
<br/>

## 주요 클래스 및 로직 설명
---
<b>김수정</b>
- `RecipeController`: 레시피 게시글 업로드, 조회, 수정, 삭제 API 처리
- `RecipeBoardMapper`: 레시피 게시판 데이터 CRUD를 SQL 쿼리로 처리하는 MyBatis 매퍼
- `RecipeService`: 레시피 업로드, 수정, 삭제, 조회 비즈니스 로직 처리
- `LikeService`: 레시피 게시판 좋아요 토글, 개수, 순위 조회 비즈니스 로직 처리
- `ReplyService`: 레시피 게시판 댓글 업로드, 수정, 삭제, 조회 비즈니스 로직 처리

<b>이준규</b>
- `NoticeController`: 공지사항 생성, 조회, 수정, 삭제 및 파일 업로드, 삭제 API 처리 
- `NoticeService`: 공지사항 생성, 조회, 업데이트, 삭제 비즈니스 로직 처리 
- `FileApiController`: 파일업로드 리스트 조회 공지사항 파일다운로드 API 처리 
- `FileUtils`: 단일/다중 파일 업로드 처리, 파일 저장명 및 업로드 경로 생성, 삭제  
- `FileService`: 공지사항 파일 저장, 수정, 삭제 비즈니스 로직 처리 

<b>조준근</b>
- `AuthController`: 사용자 인증 관련 (회원가입, 로그인, 이메일 중복 확인) API 처리
- `UserService`: 사용자 생성, 조회, 수정, 삭제 비즈니스 로직을 처리
- `UserMapper`: 사용자 데이터 CRUD를 SQL 쿼리로 처리하는 MyBatis 매퍼
- `WebSecurityConfig`: 스프링 시큐리티 설정, CORS, CSRF, 세션 설정 등을 포함
<br/>


## 프로젝트 설계 문서
---
### [Flowchart]
![KakaoTalk_20230922_130019247](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/21a55915-d0c0-4e0e-9ade-cacab8155a97)
</br>

### [ERD]
![KakaoTalk_20230922_130016120](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/b3f0e462-b369-42bf-a43a-2254a9fa45a6)
</br>

### [Usecase]
![KakaoTalk_20230922_130022030](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/351edbfb-74e7-4036-8658-b2fb234fdbff)
<br/>

## 화면 설계 
---
![KakaoTalk_20230922_130025895](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/ea9ff116-eeac-4f3d-8750-9bacf46accd2)

![KakaoTalk_20230922_130025895_01](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/e0444cae-b1ee-4850-a87f-e0d2034bd0e5)

![KakaoTalk_20230922_130025895_02](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/d6f5cf69-8d21-4deb-b385-0e1efa03459d)

![KakaoTalk_20230922_130025895_03](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/1e0721af-c878-4306-8364-2504573666cc)
