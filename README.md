#  2022 동국대학교 가을축제 사이트 (BE)


## 서비스 소개

2022년 동국대학교 가을 축제 사이트입니다. <br>
3년만에 개최되는 축제인만큼 학우분들이 한눈에, 더 빠르게 정보를 모아볼 수 있도록 사이트를 구현했습니다. <br>
실제 배포를 진행하여 3일간 약 1.2만명의 사용자를 확보하였습니다 :)

<br><br><br><br>

## 개발 내용 

### 백엔드 스택
- Spring Boot(Java)
- AWS RDS(MySQL)
- AWS EC2 
- Docker

### 프론트엔드 레포지토리
https://github.com/LikeLion-at-DGU/2022_autumn_festival_front

### 시스템 구조도


### API 명세서
![image](https://user-images.githubusercontent.com/81295661/197403494-0f980290-1128-4948-b8db-20d5ee47219e.png)


<br><br><br><br>


## 서비스 내용
<br><br>
### 랜딩 페이지
![KakaoTalk_20221024_005340899](https://user-images.githubusercontent.com/81295661/197403930-48ca42cb-39db-4adb-b9cd-b9b4f72d38ba.png)

<br><br>

### 공지사항
![image](https://user-images.githubusercontent.com/81295661/197403184-3a999fd5-c841-4c7f-aba6-68eea10b66c6.png)

<br><br>

### 좋아요 top 부스
![KakaoTalk_20221024_005428124](https://user-images.githubusercontent.com/81295661/197402861-b7d1cadc-62d8-4da7-8855-7af334a1db42.png)=
해당 날짜에 진행되는 부스 중 가장 많은 좋아요를 받은 5개의 부스를 노출하였습니다.

<br><br>

### 부스 리스트
![KakaoTalk_20221024_005428124_01](https://user-images.githubusercontent.com/81295661/197402966-cfd0177d-e788-47d7-a841-f4a8b213efd4.png)
지도를 기반으로 해당 위치에서 해당 날짜에 진행하는 부스를 확인할 수 있도록 구현하였습니다.

<br><br>

### 부스 검색
![KakaoTalk_20221024_005428124_02](https://user-images.githubusercontent.com/81295661/197404031-3fd231f8-a723-4d0a-b425-57d74e386d52.jpg)

위치, 부스명, 부스 메뉴명 을 기반으로 부스를 검색할 수 있도록 구현하였습니다.

<br><br>

### 부스 상세 페이지
![image](https://user-images.githubusercontent.com/81295661/197403199-6e256833-779b-410e-bfe0-4bda47473403.png)
![image](https://user-images.githubusercontent.com/81295661/197403228-421fb5f0-3376-4096-b83c-3c97ead32ab2.png)

부스 소개 이미지, 부스명, 부스 설명, 메뉴판을 확인할 수 있고 좋아요를 누를 수 있는 페이지입니다.
<br> 보다 원활한 사용을 위해 회원가입이 아닌 작성자명과 비밀번호를 활용한 방명록 작성을 구현하였으며
<br> 방명록마다 IP를 저장하여 욕설 및 성희롱 댓글을 사전에 방지하고자 하였습니다. 
<br> 삭제시에도 해당 댓글이 삭제되는 것이 아닌  hidden 되는 형식으로 구현하였습니다.

<br><br>

### 타임테이블
![KakaoTalk_20221024_005340899_01](https://user-images.githubusercontent.com/81295661/197403323-68b88f7b-4406-4a4d-87b4-d1412ac64445.png)


<br><br>

### 소개

![KakaoTalk_20221024_005340899_03](https://user-images.githubusercontent.com/81295661/197403350-e22a985f-fcd1-4a2c-91f9-d91955578f96.png)


<br><br>

<br><br><br><br>


## 개발 외적인 홍보

__외부 배너 설치__
![KakaoTalk_20221024_005428124_05](https://user-images.githubusercontent.com/81295661/197403705-d7997e9a-823a-4c90-b606-d9ebd915d73a.png)

__학교 홈페이지 공지사항__
![KakaoTalk_20221024_005428124_04](https://user-images.githubusercontent.com/81295661/197403715-17812ec7-c12f-4830-b229-8a3625f37f07.png)
__GA__
![image](https://user-images.githubusercontent.com/81295661/197403425-149d1f9d-3567-47f0-b332-211998fa2735.png)





