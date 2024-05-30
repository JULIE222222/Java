package Chap03;

public class Operator03 {

	public static void main(String[] args) {


		int a = 5, b = 10; // 정수형으로 a,b를 선언하고 초기화함
		
		System.out.println(a > b); //a가 b보다 작을때
		System.out.println(!(a > b));//a가 b보다 작은 조건이 거짓일 때
		System.out.println((a == b) && (a == 5));//a랑b가 같고 a가 5일때
		System.out.println((a != b) && (a == 5));//a랑b가 다르고 a가 5일때
		System.out.println(!(a != b) && (a == 5));//a랑b가 다르고 a가 5인 조건이 거짓일 때

	}

}
