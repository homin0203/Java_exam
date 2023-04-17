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
