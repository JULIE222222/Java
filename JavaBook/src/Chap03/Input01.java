package Chap03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);// s1값 입력받기
		System.out.println("정숫값 입력하기");// 문자열 출력
		int n = s1.nextInt(); // 입력받은 s1 값을 int n에 넣을 것임(자료형 꼭 구분하여서 쓰기)

		System.out.println("실숫값 입력하기");// 문자열 출력
		double db = s1.nextDouble(); // db값 입력받기
		System.out.println("정숫값: " + n); // 문자열과 입력받은 n값 출력
		System.out.println("실숫값: " + db);// 문자열과 입력받은 db값 출력

	}

}
