package Assignment05;

import java.util.Scanner;

public class SwitchMethod_change4_7 {

	public static void Loop() {
		Scanner s = new Scanner(System.in); // scanner의 객체 생성
		int choice = 1; // 변수 선언, 초기화 함

		while (choice == 1) {
			int a;
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();

			switch (a % 2) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
				break;
			}	
			System.out.println("계속하고 싶다면 예1, 그만하고 싶다면 아니요 0을 입력하세요.");
			choice = s.nextInt();
			
			while(choice >= 2) { 		
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				choice = s.nextInt();
				if (choice == 0) break;
			}
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}
	
	public static void main(String[] args) {
		Loop();
	}
}