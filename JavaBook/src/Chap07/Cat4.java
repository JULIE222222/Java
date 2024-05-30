package Chap07;

public class Cat4 {
	 String breed;
	 String color;
	 Cat4() { //기본생성자
	 System.out.println("Cat4() 생성자 호출합니다.");
	 }
	 
	 Cat4(String pBreed) { //매개변수를 받으면 일반생성자임
	 System.out.println("Cat4(...) 생성자 호출합니다.");
	 breed = pBreed; //받아온 값(러시안 블루)을 넣기 위해서 정의 -> 위에 cat3.breed로 값이 들어감
 	 }
	 
	 void eat() {
	 System.out.println("먹이를 먹다.");
	 }
	 void scratch() {
	 System.out.println("발톱으로 할퀴다.");
	 }
	 void meow() {
	 System.out.println("야옹 하고 울다.");
	 }
}
