package Chap04;

import java.util.Scanner; //문자를 입력받기 위한 Library

public class If01 {

	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요."); 
		Scanner s = new Scanner(System.in);
		int age = s.nextInt(); //입력받은 숫자를 age에 넣어줌
		
		if( age >= 18) {
			// if 조건문이 만족하면 아래 문자열 출력
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다."); //무조건 문자열 출력
	}

}
