package Chap05;

public class Method05 {
	//반환값은 없고 입력값만 있는 함수
	public static void calculate(int x, double y) { //int형과 double형의 값을 받음
		System.out.println(2 * x * y); //원의 둘레 구하는 공식
	}
	public static void main(String[] args) {
		//변수 선언,초기화
		int a = 4;
		double pi = 3.14; //자료형 꼭 통일!
		
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율");
		//문자열 출력
		System.out.print("2 x " + a + " x " + pi + " = ");
		calculate(a, pi);//calculate함수에 a와 pi값을 입력하여 함수 계산
		//변수가 아닌 상수는 메서드에서 그냥 받아들여서 돌아가긴 함.하지만 사용하기 불편함
	}
}
