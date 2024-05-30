package Chap05;

public class Method03 {
	//max메소드를 사용자정의메소드로 만듬
	public static int max(int x, int y) {
		int result; // result 선언
		if (x > y) // if-else를 사용하여 최대값을 구함
			result = x;
		else
			result = y;
		return result;
	}
	public static void main(String[] args) {
		int a = 5, b = 6; //변수 선언, 초기화
		int num = max(a, b); //max함수에 a,b값을 넣어 값을 도출한 뒤 num변수에 넣어줌
		System.out.println(a + "(와)과 " + b + "의 수 중 " + num + "이 큽니다.");
		//a,b,num의 값과 문자열 출력
	}
}
