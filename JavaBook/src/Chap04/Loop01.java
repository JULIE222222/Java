package Chap04;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //변수를 선언하고 초기화 함
		System.out.println("5개의 숫자를 입력하세요."); //문자열 출력하고 다음칸으로 커서 옮기기
		
		for(int n = 1; n <= 5; n++) { //n을 1부터 5까지 증가시키며 반복하기
			Scanner s = new Scanner(System.in); // scanner 객체를 생성하기
			int num = s.nextInt(); // 정수를 입력받아 변수에 저장
			sum += num; // 입력받은 수의 총합을 구하는 수
		}

		System.out.println("합계 : " +sum); //문자열 출력후 sum을 이어서 출력
	}

}
