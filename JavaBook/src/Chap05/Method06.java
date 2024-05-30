package Chap05;

public class Method06 {
	//반환값과 입력값이 있는 함수
	public static int sum(int x, int y) { 
		//int형 변수를 2개를 받아 계산 후 int형으로 반환
		return (x + y);
	}
	public static int sum(int x, int y, int z) {
		//int형 변수 3개를 받아 계산 후 int형으로 반환
		return (x + y + z);
	}
	public static double sum(double x, double y) {
		//double형 변수 2개를 받아 계산 후 double형으로 반환
		return (x + y);
	}

	public static void main(String[] args) {
		// 문자열 출력과 각 함수의 결과값을 출력
		System.out.println("sum(10, 20)의 값: " + sum(10, 20));
		System.out.println("sum(10, 20, 30)의 값: " + sum(10, 20, 30));
		System.out.println("sum(10.5, 20.5)의 값: " + sum(10.5, 20.5));
	}
}
