package Chap04;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in); //Scanner 클래스의 객체를 생성
		//정수를 입력받아 변수에 저장
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if(x > y) //x가 y보다 클때 if문안의 if문에 들어감
		 { 
			if(x > z) 
			{ //x가 z보다 클때
			 System.out.println(x + "는 가장 큰 정수입니다."); //조건문이 참일때 출력
			}
			else 
			{
			 System.out.println(x + "는 가장 큰 정수가 아닙니다."); //조건문이 거짓일때 출력
			}
		 }
		else
		{
		 System.out.println(x + "는 가장 큰 정수가 아닙니다."); //x > y의 조건문이 거짓일때 출력
		}

	}

}
