package Chap05;

public class Example05 {
	// 출력값이 없고 입력값만 있는 함수
	public static void add(int x, int y) {
		System.out.println(x + "와(과) " + y + "의 합은 " + (x + y) + "입니다.");
		// 함수 내에서 출력까지 해줌
	}

	public static void main(String[] args) {
		int a = 5, b = 6; // a,b를 선언/초기화함
		
		add(a, b); // add함수에 a,b값을 넣어 출력함
		
	}
}

/*
 * public static void add(int x, String y) {
 * System.out.println(x + "와(과) " + y + "의 합은 " + (x + y) + "입니다."); }
 * 
 * public static void main(String[] args) {
 * int a = 5, String c = "6";
 *  add(a, c);
 *  }
 */
