package Chap06;

public class Example05 {

	public static void main(String[] args) {
		
		//미리 만들어진 스트링풀 메모리에 저장, 경우의 수가 다 들어있음
		String s1 = "Java";
		String s2 = "Java";
		//새로운 스트링을 따로 만들어 저장(메모리를 따로 만들어 저장)
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		//각 문자열 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
