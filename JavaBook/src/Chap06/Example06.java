package Chap06;

public class Example06 {

	public static void main(String[] args) {

		String s = " Java Programming ";
		System.out.println("s.length() : " + s.length()); //문자열 길이 반환
		System.out.println("s.charAt(1) : " + s.charAt(1)); // 특정 인덱스에 대한 char 값을 반환
		System.out.println("s.substring(6) : " + s.substring(6)); //주어진 시작 인덱스에 대한 부분 문자열 반환
		System.out.println("s.substring(5,13) : " + s.substring(5, 13));//주어진 시작과 끝 인덱스에 대한 문자열 반환 ->5부터 13전까지 출력
		System.out.println("s.indexOf('P') : " + s.indexOf("P"));//지정된 문자의 인덱스 반환
		System.out.println("s.toLowerCase() : " + s.toLowerCase());//소문자로 반환
		System.out.println("s.toUpperCase() : " + s.toUpperCase());//대문자로 반환

	}
}