package Chap05;

public class Example03 {
	//int형으로 값을 반환하고 int형으로 x와 y의 값을 받는 메서드
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int a = 5, b = 6; // 변수 a,b 선언/초기화 함
		int num = add(a, b); //a,b를 add함수에 넣어 값을 출력함
		System.out.println(a + "와(과) " + b + "의 합은 " + num + "입니다.");
		// a,b,num의 값과 문자열을 출력
	}
}
