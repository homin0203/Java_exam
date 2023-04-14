package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		Student[] sArr = ssm.printStudent();
		sArr = ssm.printStudent();
		//학생 정보 출력과 성적 결과 출력에서 편의성을 위해서 Student를 import 후 
		//ssm.printStudent() 값을 배열에 담아줌
		
		System.out.println("========== 학생 정보 출력 ==========");
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		//ssm.printStudent() == Student자료형의 배열
		
		System.out.println("========== 학생 성적 출력 ==========");
		System.out.println("학생 점수 합계 : " + (int)(ssm.avgScore()[0]));
		//출력 모습에 점수 합계는 정수로 표현되어 있어서 int로 강제 형변환
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);
		//ssm.avgScore() == double자료형의 배열
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].getScore() < 60) {
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}
		}	
	}
}
