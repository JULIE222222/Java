package Chap04;

public class Example03 {

	public static void main(String[] args) {
		
		int num = 20; //int형으로 변수 선언,초기화
		
		if( num == 10) { //num의 값이 10일때
			System.out.println("숫자가 10입니다."); //위 조건이 충족되면 출력
		}
		else if (num == 15) { //num의 값이 15일때
			System.out.println("숫자가 15입니다."); //위 조건이 충족되면 출력
		}
		else if ( num == 20) { //num의 값이 15일때
			System.out.println("숫자가 20입니다."); //위 조건이 충족되면 출력
		}
		else { //조건에 모두 충족하지 않을때
			System.out.println("숫자가 존재하지 않습니다."); //위 조건이 충족되면 출력
		}
	}

}
