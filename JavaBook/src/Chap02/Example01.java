package Chap02;

public class Example01 {
	public static void main(String[] args) {
		//final int SPEED = 20; final이 붙으면 상수가 됨->값이 변경이 안된다.(final을 지우거나 SPEED를 지우거나)
		int SPEED = 20; //변수 선언과 초기화
		int count = 10;
		
		SPEED = 40; //변수 값을 넣어줌
		count = 11;
		
		System.out.print("상수 SPPED 값은 ");
		//println은 촐력하고 엔터실행
		System.out.println(SPEED); //SPEED값을 출력함
		System.out.print("변수 count 값은 ");
		System.out.println(count); //count값을 출력함
	}

}
