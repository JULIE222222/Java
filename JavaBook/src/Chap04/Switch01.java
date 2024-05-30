package Chap04;

import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in); //scanner의 객체 생성
		int num = s.nextInt(); // 정수를 입력받아 변수에 저장
		
		switch (num / 10) { //점수를 10으로 나눈 몫에 따라 switch문을 실행 
		case 10:
		case 9:
		    System.out.println("A 학점"); //몫이 10,9인경우 문자열 출력
		    break;
		case 8:
			System.out.println("B 학점"); //몫이 8인경우 문자열 출력
			break;
		case 7:
			System.out.println("C 학점"); //몫이 7인경우 문자열 출력
			break;
		case 6:
			System.out.println("D 학점"); //몫이 6인경우 문자열 출력
			break; 
		default:
			System.out.println("F 학점"); //조건문 이외의 점수일때 출력
			break; 
			
		}

	}

}
