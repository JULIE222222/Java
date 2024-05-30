package Chap03;

public class Operator02 {
	
	public static void main(String[] args) {
		
		  int a = 10, b = 25; //정수형으로 선언하고 초기화 함
		  
		  //관계연산자 조건이 맞을시 true출력
		  System.out.println("a == b = " + (a == b)); //a와 b가 같을때
		  System.out.println("a != b = " + (a != b)); //a와 b가 반대일때
		  System.out.println("a > b = " + (a > b)); //a가 b보다 클때
		  System.out.println("a < b = " + (a < b)); //a가 b보다 작을때
		  System.out.println("b >= a = " + (b >= a)); //b가 a랑 같거나 클때
		  System.out.println("b <= a = " + (b <= a)); //b가 a랑 같거나 작을때
	}
	
}
