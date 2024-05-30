package Chap06;

public class Array07 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = s1;
		//if문을 이용하여 조건이 만족하면 해당 문자열 출력 아니면 else안에 있는 문자열 출력
		if (s1 == s2)
			System.out.println("s1과 s2는 같다");
		else
			System.out.println("s1과 s2는 같지 않다");

		if (s1 == s3)
			System.out.println("s1과 s3은 같다");
		else
			System.out.println("s1과 s3은 같지 않다");

		if (s1.equals(s2))
			System.out.println("s1과 s2의 값은 같다");
		else
			System.out.println("s1과 s2의 값은 같지 않다");

	}
}
