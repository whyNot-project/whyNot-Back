# 🤔 Why Not?
<br />

## 💻 프로젝트 소개
개인 성향을 기반으로 액티비티 추천 및 크루를 모집하는 웹사이트입니다.

## ⏱ 개발 기간
2023.11.13 ~ 2023.11.24

## 👩🏻‍🤝‍👩🏻 팀원 소개
|이예원|최유진|
|:-:|:-:|
|<img src="https://avatars.githubusercontent.com/u/139411481?v=4" width="200px" />|<img src="https://avatars.githubusercontent.com/u/99077953?v=4" width="200px" />|
|[@yeyeah1](https://github.com/yeyeah1)|[@choichoijin](https://github.com/choichoijin)|

### 🍕역할 분담 - FRONT🍕
- **이예원**
  - 프로젝트 초기 세팅
  - CREW
    - 전체 크루 / 내 크루 / 크루 검색
  - ARTICLE
    - 목록 불러오기

- **최유진**
  - 프로젝트 초기 세팅
  - USER
    - 회원 가입 / 로그인
  - 검사지
  - Navigation Bar
  - 액티비티
  - 공간 예약

### 🍕역할 분담 - BACK🍕
- **이예원**
  - 프로젝트 RESTful API 초기 세팅
  - CREW
    - 목록 / 검색 / 상세
  - USER-CREW
    - 가입 / 목록 / 검색
  - ARTICLE
  - REPLY
    - 목록 / 등록
   
- **최유진**
  - 프로젝트 DB 초기 세팅
  - CREW
    - 등록 / 수정 / 삭제
  - USER
    - 회원 가입 / 로그인(JWT) / 파일 업로드
  - Open API
    - 카카오
    - 공공 데이터 포털

## ⚙ 개발 환경
- `Java 8`
- `JDK 1.8.0`
- IDE : STS 3.9
- Framework : Springboot(2.x)
- Database : mySQL
- ORM : Mybatis
- Open Api : Kakao, 공공데이터포털

## 📌 주요 기능
### 🌟메인 화면
- **Navigation Bar**
  - 각 페이지로 이동할 수 있는 탭, 로그인 안했을 시 접근 불가
  - 사이드 바를 통해 로그인, 로그아웃, 캘린더로 일정 관리 가능
![메인 화면](https://github.com/whyNot-project/whyNot-Back/assets/139411481/fc285bfc-7729-467d-abc6-dbaeef13c1ee)
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/9e9f3c40-a574-4a08-a81c-009df20b1c2d)


### 🌟액티비티
- **유형에 따른 영상 제공**
  - 사용자의 유형을 키워드로 검색된 운동 관련 영상 제공
  - 항목 별로 클릭하여 영상 링크로 이동
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/ea6461ed-0ea5-4882-888e-2010de153c9d)
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/668f7628-713f-4f59-8015-987a0e047a70)

### 🌟공간예약
- **운동 장소 예약**
  - 원하는 운동에 대한 예약 가능한 장소 제공
  - 항목 별로 클릭하여 예약 페이지로 이동 가능
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/b76d22ce-e835-4dc3-bab3-042b4c309d21)


### 🌟크루
- **전체 크루**
  - 스위치를 이용, 각 조건에 맞는 크루가 필터링 되어 목록이 생성됨
  - 전체 목록 조회 시 스위치 비활성화
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/68c932b0-1fe4-47bc-b68c-268fa65db5f3)
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/04aad98b-d08f-4a37-84e1-a6ccc9502b23)

- **내 크루**
  - 내가 가입한 크루 목록 제공
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/df18b67f-9763-4fb4-b548-05c6d0cbe6f1)

- **크루 상세**
  - 크루에 대한 상세 내용 및 가입 기능
  - 이미 가입한 크루라면 가입할 수 없음
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/a857e066-1ecc-45e6-b25f-4287ca239cb1)

- **크루 만들기**
  - 조건 입력 후 크루 생성 가능
  - 조건을 키워드로 소개글 자동완성 가능
  - 크루 생성 후 내 크루에 자동 추가
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/9c5d3462-fa3a-428e-ad8b-5d3d8e6febfe)


### 🌟아티클
- **유용한 정보 제공**
  - 운동, 건강 관련 컨텐츠 제공하는 정적 페이지
![image](https://github.com/whyNot-project/whyNot-Back/assets/139411481/04b0db3b-fdfc-4976-a73f-5ce2f793d9f7)

