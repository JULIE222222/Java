package Chap04;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner의 객체 생성
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt(); //입력받은 정수를 변수로 설정
		int sum = 0; //변수 선언,초기화 함
		
		do { //do안의 코드 실행
			sum += x; // sum = sum + x : sum변수에 x를 더한값을 넣음
			x--;//x를 1씩 감소시킴
		}while(x >= 10); // x가 10이상일때까지 반복함
		System.out.println("합계 : " + sum); // 문자열 출력과 sum의 값을 출력
	}
}
