package Chap06;
public class Example07 {
	public static void main(String[] args) {
		//문자열 선언,초기화함
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		String s4 = s2 + s3; //s2문자열과 s3의 문자열을 연속으로 출력하는 것으로 초기화
		
		System.out.println(s1 == s2); //각 문자열이 같으면 true출력
		System.out.println(s1 != s2); //각 문자열이 다르면 true출력

		System.out.println(s2 == s3); //각 문자열이 같으면 true출력
		System.out.println(s2 != s3); //각 문자열이 다르면 true출력
		
		System.out.println(s4); //문자열 출력

	}

}
