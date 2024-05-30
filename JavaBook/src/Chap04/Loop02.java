package Chap04;
import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //scanner의 객체 생성
		
		int choice = 1; //변수 선언, 초기화 함
		while(choice == 1) { //choice가 1이면 while반복문 실행
			int a; //변수 a선언
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt(); // 정수를 입력받아 변수에 저장
			
			if (a % 2 == 0) { //a를 2로 나눈 나머지가 0이면
				System.out.println("짝수입니다."); // 문자열 출력
			}
			else{
				System.out.println("홀수입니다."); //if문의 조건이 아니면 esle내 문자열 출력
			}
			System.out.println("계속하고 싶다면 예1, 그만하고 싶다면 아니요 0을 입력하세요.");
			
			choice = s.nextInt(); //문자로 받은 변수를 숫자로 변환
		}
		System.out.println("모든 숫자를 확인했습니다."); //while 조건문에 해당하지 않는 1이외의 숫자를 입력하면 반복문 빠져나옴

	}

}
