package Chap05;

public class Example06 {
	//메서드 오버로딩-> 반환값은 없고 입력값을 다양하게 받는 메서드
	public static void calculate(int x, int y) { //int형 변수를 2개 받음
		System.out.println(x * y);
	}
	public static void calculate(int x) { //int형 변수를 1개 받음
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) {//int,double형의 변수를 받음
		System.out.println(x * y);
	}
	public static void calculate(double x) { //double형의 변수를 받음
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		//해당하는 메서드로 들어가서 입력된 값을 처리해줌
		calculate(2,3);
		calculate(2,3.14);
		calculate(2);
		calculate(2.5);
	}
}

//메서드 이름만 같고 형태가 다르거나, input의 값이 다르면 여러개 만들어서 사용하는 것을 오버로딩이라고 한다!