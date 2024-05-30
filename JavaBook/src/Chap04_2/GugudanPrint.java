package Chap04_2;

import java.util.Scanner;

public class GugudanPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요: ");
		int a = s.nextInt();
		s.nextLine(); // 버퍼 비우기
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op = s.nextLine(); // nextLine()으로 변경
		System.out.print("두번째 숫자를 입력하세요: ");
		
		int b = s.nextInt();

		// 연산자에 따라 결과를 출력
		switch (op) {
		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case "*":
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case "/":
			// 나눗셈의 경우 0으로 나누는 오류를 방지하기 위해 예외 처리 추가
			if (b != 0) {
				System.out.println(a + " / " + b + " = " + (a / b));
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}
}

//if문으로 사용할때
/* if(op.equals("+"){
 System.out.println(a + "+" + b + "=" + (a + b));
  } 
*/