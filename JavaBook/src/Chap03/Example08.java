package Chap03;

import java.util.Scanner; //입력한 값을 받을때 꼭 필요!

public class Example08 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // 자료를 입력받을꺼니 in이라고 적어줌, input은 변수명

		System.out.println("당신의 이름을 입력하세요.");// 자료를 출력할꺼니 out이라고 적어줌
		String name = input.nextLine(); // nextLine은 엔터치기 전까지의 내용(String을 받으려면 이 형식으로 써줌)
		System.out.println("당신의 이름 : " + name); // 문자열과 입력한 데이터 출력

	}
}
