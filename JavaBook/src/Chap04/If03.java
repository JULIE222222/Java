package Chap04;

import java.util.Scanner;
public class If03 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in); //Scanner 클래스의 객체를 생성
		int grade = s.nextInt(); // 정수를 입력받아 변수에 저장
		
		if(grade >= 90) { //점수가 90이상일때
			System.out.println("A 학점"); //문자열 출력
		}
		else if ( grade >= 80) { //점수가 80이상일때
			System.out.println("B 학점"); //문자열 출력
		}
		else if ( grade >= 70) { //점수가 70이상일때
			System.out.println("C 학점"); //문자열 출력
		}
		else if ( grade >= 60) { //점수가 60이상일때
			System.out.println("D 학점"); //문자열 출력
		}
		else { //위 조건 모두 만족하지 못하는 값일때
			System.out.println("F 학점"); //문자열 출력
		}
	}

}
