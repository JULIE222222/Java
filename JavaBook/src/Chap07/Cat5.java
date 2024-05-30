package Chap07;
public class Cat5 {
	String breed;
	String color;
	Cat5() { //기본생성자 함수
	 System.out.println("Cat() 생성자 호출합니다.");
	 }
	//오버로딩
	Cat5(String pBreed) { //일반생성자 함수,값이 1개인 것은 여기로
	 System.out.println("Cat(...) 생성자 호출합니다.");
	 breed = pBreed;
	 }
	
	Cat5(String pBreed, String pColor) { //일반생성자 함수,값이 2개인 것은 여기로
	 System.out.println("Cat(..., ...) 생성자 호출합니다.");
	 //각 변수에 값을 넣어줌
	 breed = pBreed; 
	 color = pColor;
	 }
	
	void eat() {
		System.out.println("먹이를 먹다.");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다.");
	}
	void meow() {
		System.out.println("야옹하고 울다.");
	}
}
