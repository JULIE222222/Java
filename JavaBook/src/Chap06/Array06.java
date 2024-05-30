package Chap06;

public class Array06 {

	public static void main(String[] args) {

		String s = " Java Programming "; 
		String s1 = "Java";
		String s2 = " Programming";
		String s3 = s1.concat(s2); // s1값에 s2를 붙여줌
		//String s5 = s1 + s2; 이렇게도 씀
		String s4 = s.trim(); //선행 및 후행 공백을 생략
		
		
		System.out.println("s3 " + s3); 
		System.out.println("s4 " + s4); 
		System.out.println("s3.equals(s4) " + s3.equals(s4)); // 두문자열이 같으면 true를 반환

	}
}
