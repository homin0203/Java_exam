# 프로그래밍 언어 활용 및 응용
- 프로그래밍 언어 활용 및 응용 교육과목 실습문제 및 과제 기록

<details>
<summary><h3>:one: 변수(펼쳐보기 🖱️) </h3></summary>
<div markdown="1">
  
[→ 변수 소스코드로 ](https://github.com/homin0203/Java_exam/blob/main/javaExam/src/com/kh/practice1/func)  
  
#### 문제1
Class Name : com.kh.practice1.func.VariablePractice1

실행 클래스 : com.kh.practice1.run.Run

이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

#### 예시
이름을 입력하세요 : 아무개

성별을 입력하세요(남/여) : 남

나이를 입력하세요 : 20

키를 입력하세요(cm) : 180.5

키 180.5cm인 20살 남자 아무개님 반갑습니다^^

#### 내 코드
![변수1번](https://user-images.githubusercontent.com/116356234/232367842-4ce5b993-6ea7-41ce-a0e0-5e9d92ccf407.png)

<hr>

#### 문제2
Class Name : com.kh.practice1.func.VariablePractice2

실행 클래스 : com.kh.practice1.run.Run

키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

#### 예시
첫 번째 정수 : 23

두 번째 정수 : 7

<br>

더하기 결과 : 30

빼기 결과 : 16

곱하기 결과 : 161

나누기 몫 결과 : 3

#### 내 코드
![변수2](https://user-images.githubusercontent.com/116356234/232367847-d40002ac-1173-400b-ae98-50710d524c90.png)

<hr>

#### 문제3
Class Name : com.kh.practice1.func.VariablePractice3

실행 클래스 : com.kh.practice1.run.Run

키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.

계산 공식 ) 면적 : 가로 * 세로, 둘레 : (가로 + 세로) * 2

#### 예시
가로 : 13.5

세로 : 41.7

<br>

면적 : 562.95

둘레 : 110.4

#### 내 코드
![변수3](https://user-images.githubusercontent.com/116356234/232367850-70cf45a3-2a9c-4620-9e06-e954ab49cb07.png)
  
<hr>

#### 문제4
Class Name : com.kh.practice1.func.VariablePractice4

실행 클래스 : com.kh.practice1.run.Run

영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.

#### 예시
문자열을 입력하세요 : apple

<br>

첫 번째 문자 : a

두 번째 문자 : p

세 번째 문자 : p

#### 내 코드
![변수4](https://user-images.githubusercontent.com/116356234/232367851-bbf856ac-f4ed-4cf5-b483-afa75dde6cee.png)

</div>
</details>

<details>
<summary><h3>:two: 형변환(펼쳐보기 🖱️) </h3></summary>
<div markdown="1">
  
[→ 형변환 소스코드로 이동](https://github.com/homin0203/Java_exam/blob/main/javaExam/src/com/kh/practice2/func)

#### 문제1
Class Name : com.kh.practice2.func.CastingPractice1
  
실행 클래스 : com.kh.practice2.run.Run

키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.

#### 예시
문자 : A

A unicode : 65

#### 내 코드
![형변환1](https://user-images.githubusercontent.com/116356234/232371311-26d22cdd-b54f-4f2b-9577-96adccb074bb.png)

<hr>

#### 문제2
Class Name : com.kh.practice2.func.CastingPractice2
  
실행 클래스 : com.kh.practice2.run.Run

실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
  
이 때 총점과 평균은 정수형으로 처리하세요.

#### 예시
국어 : 90.0
  
영어 : 90.0
  
수학 : 90.0
  
<br>

총점 : 270
  
평균 : 90

#### 내 코드
![형변환2](https://user-images.githubusercontent.com/116356234/232371314-53e01b6a-fe7c-4b76-b122-32940e7bcaaa.png)

<hr>

#### 문제3
Class Name : com.kh.practice2.func.CastingPractice3

실행 클래스 : com.kh.practice2.run.Run

선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.

#### 예시
![형변환3문제](https://user-images.githubusercontent.com/116356234/232371666-0647dacd-745c-44d8-ad70-a4ee7d1cda91.png)

#### 내 코드
![형변환3](https://user-images.githubusercontent.com/116356234/232371319-e4c0cc14-9cb6-46ff-a7ca-875ce92fdb4c.png)

</div>
</details>

<details>
<summary><h3>:three: 연산자(펼쳐보기 🖱️) </h3></summary>
<div markdown="1">
  
[→ 연산자 소스코드로 이동](https://github.com/homin0203/Java_exam/blob/main/javaExam/src/com/kh/practice/func/OperatorPractice.java)

#### 문제1
메소드 명 : public void practice1(){}
  
키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.

#### 예시
정수 : -9
  
양수가 아니다

#### 내 코드
![연산자1](https://user-images.githubusercontent.com/116356234/232373068-5c230146-b60c-4123-96c0-5d7caed564c9.png)

<hr>

#### 문제2
메소드 명 : public void practice2(){}
  
키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.

#### 예시
정수 : -9

음수다

#### 내 코드
![연산자2](https://user-images.githubusercontent.com/116356234/232373066-c259f04c-bf50-4592-880c-865f0592bbe4.png)

<hr>

#### 문제3
메소드 명 : public void practice3(){}
  
키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

#### 예시
정수 : 5
  
홀수다

#### 내 코드
![연산자3](https://user-images.githubusercontent.com/116356234/232373065-15c7585e-1883-4200-bb49-e8a542919c2b.png)
  
<hr>

#### 문제4
메소드 명 : public void practice4(){}
  
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

#### 예시
인원 수 : 29
  
사탕 개수 : 100
  
1인당 사탕 개수 : 3
  
남는 사탕 개수 : 13

#### 내 코드
![연산자4](https://user-images.githubusercontent.com/116356234/232373063-298ba1c1-04d1-4e2d-8a27-e0e50bc0f23b.png)
  
<hr>

#### 문제5
메소드 명 : public void practice5(){}
  
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
  
이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.

#### 예시
이름 : 박신우
  
학년(숫자만) : 3
  
반(숫자만) : 4
  
번호(숫자만) : 15
  
성별(M/F) : F
  
성적(소수점 아래 둘째자리까지) : 85.75
  
3학년 4반 15번 박신우 여학생의 성적은 85.75이다.

#### 내 코드
![연산자5](https://user-images.githubusercontent.com/116356234/232373062-32a926f7-7920-4797-b323-ff28c23fe7a3.png)
  
<hr>

#### 문제6
메소드 명 : public void practice6(){}
  
나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.

#### 예시
나이 : 19
  
청소년

#### 내 코드
![연산자6](https://user-images.githubusercontent.com/116356234/232373061-b19611e7-06d2-4304-bda4-f9b8080ca78c.png)
  
<hr>

#### 문제7
국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.

#### 예시
국어 : 60
  
영어 : 80
  
수학 : 40
  
  <br>
  
합계 : 180
  
평균 : 60.0
  
합격

#### 내 코드
![연산자7](https://user-images.githubusercontent.com/116356234/232373059-7c7dfb46-099b-49aa-a774-afe903759a4a.png)
  
<hr>

#### 문제8
메소드 명 : public void practice8(){}
  
주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.

#### 예시
주민번호를 입력하세요(- 포함) : 132456-2123456
  
여자
  
#### 내 코드
![연산자8](https://user-images.githubusercontent.com/116356234/232373058-a890efcb-f2da-45ee-815f-3db67912b287.png)
  
<hr>

#### 문제9
메소드 명 : public void practice9(){}
  
키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
  
그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
  
(단, num1은 num2보다 작아야 함)

#### 예시
정수1 : 4
  
정수2 : 11
  
입력 : 13
  
  <br>

true

#### 내 코드
![연산자9](https://user-images.githubusercontent.com/116356234/232373056-efe6429a-fc16-48d7-adad-15d2c357c1ba.png)
  
<hr>

#### 문제10
메소드 명 : public void practice10(){}
  
3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.

#### 예시
입력1 : 5
  
입력2 : -8
  
입력3 : 5
  
  <br>

false

#### 내 코드
![연산자10](https://user-images.githubusercontent.com/116356234/232373053-9b978914-3410-4cb4-bced-aaca30f28880.png)
  
<hr>

#### 문제11
메소드 명 : public void practice11(){}
  
A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
  
인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
  
(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)

#### 예시
A사원의 연봉 : 2500
  
B사원의 연봉 : 2900
  
C사원의 연봉 : 2600
  
  <br>
  
A사원 연봉/연봉+a : 2500/3500.0
  
3000 이상
  
B사원 연봉/연봉+a : 2900/2900.0
  
3000 미만
  
C사원 연봉/연봉+a : 2600/2989.9999999999995
  
3000 미만

#### 내 코드
![연산자11](https://user-images.githubusercontent.com/116356234/232373050-406def40-205e-425f-acd9-8a3d0184ae5f.png)
  
</div>
</details>

<details>
<summary><h3>:four: 조건문(펼쳐보기 🖱️) </h3></summary>
<div markdown="1">
  
[→ 조건문 소스코드로 이동](https://github.com/homin0203/Java_exam/blob/main/javaExam/src/com/kh/practice/chap01/ControlPractice.java)

#### 문제1
메소드 명 : public void practice1(){}
  
아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.

#### 예시
1. 입력
  
2. 수정
  
3. 조회
  
4. 삭제
  
7. 종료
  
메뉴 번호를 입력하세요 : 3
  
조회 메뉴입니다.

#### 내 코드
![조건문1](https://user-images.githubusercontent.com/116356234/232375221-5c841e5f-e40a-42f9-bf31-1ce4ba28ba4c.png)

<hr>

#### 문제2
메소드 명 : public void practice2(){}
  
키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
  
짝수가 아니면 “홀수다“를 출력하세요.
  
양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

#### 예시
숫자를 한 개 입력하세요 : -8
양수만 입력해주세요.

#### 내 코드
![조건문2](https://user-images.githubusercontent.com/116356234/232375220-b9de6ef3-74da-4a1d-8a0b-ae2e9d3e5715.png)

<hr>

#### 문제3
메소드 명 : public void practice3(){}
  
국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
  
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
  
합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.

#### 예시1
국어점수 : 88
  
수학점수 : 50 
  
영어점수 : 40 
  
불합격입니다. 
  
#### 예시2
국어점수 : 88
  
수학점수 : 50
  
영어점수 : 45
  
국어 : 88
  
수학 : 50
  
영어 : 45
  
합계 : 183
  
평균 : 61.0
  
축하합니다, 합격입니다!

#### 내 코드
![조건문3](https://user-images.githubusercontent.com/116356234/232375217-90cae58e-ec6d-4315-86a0-a8ad4a044d74.png)
  
<hr>

#### 문제4
메소드 명 : public void practice4(){}
  
수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

#### 예시1
1~12 사이의 정수 입력 : 8
  
8월은 여름입니다.
  
#### 예시1
1~12 사이의 정수 입력 : 99
  
99월은 잘못 입력된 달입니다.

#### 내 코드
![조건문4](https://user-images.githubusercontent.com/116356234/232375215-5c5bc802-4184-4465-b740-457976b8d6ac.png)
  
<hr>

#### 문제5
메소드 명 : public void practice5(){}
  
아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
  
로그인 성공 시 “로그인 성공”, 
  
아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
  
비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

#### 예시1
아이디 : myId 
  
비밀번호 : myPassword12 
  
로그인 성공 
  
#### 예시2
아이디 : myId 
  
비밀번호 : myPassword
  
비밀번호가 틀렸습니다.
  
#### 예시3
아이디 : my
  
비밀번호 : myPassword12
  
아이디가 틀렸습니다.

#### 내 코드
![조건문5](https://user-images.githubusercontent.com/116356234/232375212-a77ca4ec-e923-47b0-82c3-50a416743ab0.png)
  
<hr>

#### 문제6
메소드 명 : public void practice6(){}
  
사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
  
단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
  
회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
  
비회원은 게시글 조회만 가능합니다.

#### 예시
권한을 확인하고자 하는 회원 등급 : 관리자
  
회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회

#### 내 코드
![조건문6](https://user-images.githubusercontent.com/116356234/232375211-e5898ac7-7ea7-4614-9485-c44fbc093f54.png)
  
<hr>

#### 문제7
메소드 명 : public void practice7(){}
  
키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
  
BMI = 몸무게 / (키(m) * 키(m))
  
BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
  
BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
  
BMI가 30이상일 경우 고도 비만
  
#### 예시
키(m)를 입력해 주세요 : 1.65
  
몸무게(kg)를 입력해 주세요 : 58.4
  
BMI 지수 : 21.45087235996327
  
정상체중

#### 내 코드
![조건문7](https://user-images.githubusercontent.com/116356234/232375208-322be6c8-1367-4d7a-bf4e-761940108aa1.png)
  
<hr>

#### 문제8
메소드 명 : public void practice8(){}
  
키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
  
(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

#### 예시
피연산자1 입력 : 15
  
피연산자2 입력 : 4
  
연산자를 입력(+,-,*,/,%) : /
  
15 / 4 = 3.750000
  
#### 내 코드
![조건문8](https://user-images.githubusercontent.com/116356234/232375206-c12fa5f6-5597-4182-8a4f-86e4c680cdbc.png)
  
<hr>

#### 문제9
메소드 명 : public void practice9(){}
  
중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
  
평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
  
이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
  
70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

#### 예시1
중간 고사 점수 : 80
  
기말 고사 점수 : 30
  
과제 점수 : 60
  
출석 회수 : 18
  
================= 결과 =================
  
중간 고사 점수(20) : 16.0
  
기말 고사 점수(30) : 9.0
  
과제 점수 (30) : 18.0
  
출석 점수 (20) : 18.0
  
총점 : 61.0
  
Fail [점수 미달]
  
#### 예시2
중간 고사 점수 : 80
  
기말 고사 점수 : 90
  
과제 점수 : 50
  
출석 회수 : 15
  
================= 결과 =================
  
중간 고사 점수(20) : 16.0
  
기말 고사 점수(30) : 27.0
  
과제 점수 (30) : 15.0
  
출석 점수 (20) : 15.0
  
총점 : 73.0
  
PASS
  
#### 예시3
중간 고사 점수 : 100
  
기말 고사 점수 : 80
  
과제 점수 : 40
  
출석 회수 : 10
  
================= 결과 =================
  
Fail [출석 회수 부족 (10/20)]

#### 내 코드
![조건문9](https://user-images.githubusercontent.com/116356234/232375205-55a4a951-f814-4345-bf74-6499e2ced10f.png)
  
##### 실행 결과1
  
<img src="https://user-images.githubusercontent.com/116356234/232375202-2877eaa0-59ed-4755-a7c2-3aa935a624e8.png" width="150">
  
##### 실행 결과2
  
<img src="https://user-images.githubusercontent.com/116356234/232375199-3e0bdc3d-f45b-4005-a6b1-e4bbc512c7a3.png" width="150">
  
##### 실행 결과3
  
<img src="https://user-images.githubusercontent.com/116356234/232375195-bc093bdc-5f67-440d-9248-a4045d1ef945.png" width="150">
  
<hr>

#### 문제10
메소드 명 : public void practice10(){}

앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.

#### 예시
실행할 기능을 선택하세요.
  
1. 메뉴 출력
  
2. 짝수/홀수
  
3. 합격/불합격
  
4. 계절
  
5. 로그인
  
6. 권한 확인
  
7. BMI
  
8. 계산기
  
9. P/F
  
선택 : 4 (실습문제4 실행)

#### 내 코드
![조건문10](https://user-images.githubusercontent.com/116356234/232375193-2e85886d-cf7c-4d98-b999-fd2d15cd6aea.png)
  
##### 실행 결과1
  
<img src="https://user-images.githubusercontent.com/116356234/232375192-36c3cf88-56ad-4e1d-a53e-88d0eee80d1a.png" width="150">
  
##### 실행 결과2
  
<img src="https://user-images.githubusercontent.com/116356234/232375191-22d3e89f-df01-4f8a-a5e1-8755b3f6b78c.png" width="150">
  
##### 실행 결과3
  
<img src="https://user-images.githubusercontent.com/116356234/232375189-118e59a9-9c34-4466-8fa1-b5ad8a561641.png" width="150">
  
</div>
</details>

















<details>
<summary><h3>:three: 템플릿(펼쳐보기 🖱️) </h3></summary>
<div markdown="1">
  
[→ 연산자 소스코드로 이동]()

#### 문제1


#### 예시


#### 내 코드


<hr>

#### 문제2


#### 예시


#### 내 코드


<hr>

#### 문제3


#### 예시


#### 내 코드

  
<hr>

#### 문제4


#### 예시


#### 내 코드

  
<hr>

#### 문제5


#### 예시


#### 내 코드

  
<hr>

#### 문제6


#### 예시


#### 내 코드
  
<hr>

#### 문제7

#### 예시

#### 내 코드
  
<hr>

#### 문제8

#### 예시
  
#### 내 코드
  
<hr>

#### 문제9


#### 예시

#### 내 코드

<hr>

#### 문제10


#### 예시


#### 내 코드

  
<hr>

#### 문제11


#### 예시

#### 내 코드
  
</div>
</details>
