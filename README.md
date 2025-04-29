# 멍냥키친 (MN_Kitchen)
- 개발 기간 : 2023.08.12 ~ 2023.09.22 (약 6주)
- 인원 : FrontEnd 4명 / BackEnd 3명
- 프로젝트 전체 코드 : https://github.com/titlejjk/mn-project
<br/>

## 프로젝트 개요
- **목표** : 반려동물의 건강한 식생활을 위한 레시피 공유 플랫폼 제공
- **주요 기능**
  - 게시글 업로드/수정/삭제 및 카테고리별 분류 기능 
  - 파일 업로드 기능
  - 댓글, 좋아요, 팔로우로 커뮤니티 기능 강화
  - 관리자 권한 전용 공지사항 및 사용자 관리 기능
<br/>

## 기술 스택
### FrontEnd
<div style="display : flex">
    <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" />
    <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white" />
    <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white" />
    <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"/> 
    <img src="https://img.shields.io/badge/reactrouter-CA4245?style=for-the-badge&logo=ReactRouter&logoColor=white" />
    <img src="https://img.shields.io/badge/AXIOS-5A29E4?style=for-the-badge&logo=AXIOS&logoColor=white" />
</div>
<br/>

### BackEnd
<div style="display : flex">
    <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white"/>
    <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/> 
    <img src="https://img.shields.io/badge/springsecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"/>
    <img src="https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=json-web-tokens&logoColor=white"/>
    <img src="https://img.shields.io/badge/mariadb-003545?style=for-the-badge&logo=mariadb&logoColor=white"/>
    <img src="https://img.shields.io/badge/myBatis-181717?style=for-the-badge&logo=myBatis&logoColor=white"/>
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

### 기술 선정 이유
- **React** : 효율적인 UI 업데이트와 사용자 경험 향상을 위해 사용
- **Spring Boot** : 간단한 설정과 빠른 개발을 위해 선택
- **Spring Security + JWT** : API 보안을 강화하고 인증/인가를 효율적으로 처리하기 위해 사용
- **MariaDB** : 대규모 데이터베이스 관리 및 안정성 확보를 위해 사용
- **MyBatis** : 복잡한 SQL 쿼리와 유연한 데이터 처리에 적합
<br/>

## 팀원 및 구현기능   
|조준근|김수정|이준규|백민규|이슬아|정혜영|조새은|
|----|----|----|-----|----|-----|-----|
|![back1](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/79a34f52-78a0-4bf7-81ce-28e6a017be87)|![back3](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/470e1c50-0c0d-4c9a-b440-ac63da1adc85)|![back2](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/26fec934-aa4f-431d-84f1-ba4820e4556c)|![front3](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/f13c6227-22db-4d95-815e-d3520a98ece9) |![front4](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/4f6aad9c-2a8e-4f9d-924c-6664201c5ffa)|![front2](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/d5f7c15f-2d56-4040-8ad3-4fe85e6815d3)|![front1](https://github.com/Saeunnnnni/mn_frontend/assets/108113552/ec9d0788-c13d-4684-a4d1-75fa88a14466)|
<br/>

## 주요 기여
- 레시피 게시판 CRUD API 구현
- 댓글, 좋아요 기능 개발 및 페이징 처리
- 레시피 카테고리 분류 및 검색 기능 구현
- JWT 기반 인증/인가 로직 일부 참여 (20%)
- DB 모델링 및 ERD 설계 참여 (80%)
<br/>

## Git Branch 전략
- `main` : 배포용 브랜치 (배포 준비 완료 후 사용 예정)
- `develop` : 기능 개발 및 테스트가 완료된 후, Feature 브랜치에서 Develop으로 merge 후 최종 통합 진행
- `feature/*` : 각 기능 개발 시 사용. 완료 후 Pull Request 리뷰 및 병합을 통해 Develop 브랜치로 통합
<br/>

## 테스트 및 검증
- **단위 테스트** : JUnit5 기반으로 레시피 CRUD API 및 인증/인가 기능에 대한 단위 테스트를 작성
- **API 검증** : Postman을 활용하여 주요 API 엔드포인트(GET, POST, PUT, DELETE)에 대한 정상 동작을 검증
<br/>

## 설계 문서
- [Flowchart 보기](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/21a55915-d0c0-4e0e-9ade-cacab8155a97)
- [ERD 보기](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/b3f0e462-b369-42bf-a43a-2254a9fa45a6)
- [Use Case Diagram 보기](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/351edbfb-74e7-4036-8658-b2fb234fdbff)
<br/>

## 화면 설계
- [화면 설계 1](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/ea9ff116-eeac-4f3d-8750-9bacf46accd2)
- [화면 설계 2](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/e0444cae-b1ee-4850-a87f-e0d2034bd0e5)
- [화면 설계 3](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/d6f5cf69-8d21-4deb-b385-0e1efa03459d)
- [화면 설계 4](https://github.com/Saeunnnnni/Saeunnnnni/assets/108113552/1e0721af-c878-4306-8364-2504573666cc)

