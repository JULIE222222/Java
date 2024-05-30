package Chap03;

public class Example03 {

	public static void main(String[] args) {
		
		  int x = 10; //정수형으로 x값을 선언하고 초기화함
		  
		  System.out.println(x < 10 && x < 20); //x가 10보다 작고 20보다 작음에 만족해야함 (AND연산자)
		  System.out.println(x < 10 || x < 20); //x가 10보다 작거나 20보다 작음에 만족해야함(OR연산자)
		  System.out.println(!(x < 10 && x < 20)); //x가 10보다 작고 20보다 작음에 만족하지 않음(NOT연산자)
	}
}
