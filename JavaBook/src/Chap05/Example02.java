package Chap05;

public class Example02 {
	//return값이 있는 함수 만듬
	public static String greeting() {
		return "Hi!";
	}

	public static void main(String[] args) {
		
		String str = greeting(); //출력하기위해 변수str으로 함수의 값을 받아줌
		System.out.println(str + " JAVA"); //변수의 str값과 문자열 출력
	}
}
