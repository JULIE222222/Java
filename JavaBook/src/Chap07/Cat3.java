package Chap07;

public class Cat3 {
 String breed;
 String color;
 

 Cat3(){ //생성자 함수-> 새로운 객체가 생성될 때마다 자동으로 실행되는 함수
	 System.out.println("Cat3() 생성자 호출합니다.");//새로운 객체가 만들어질 때마다 만들어졌다는 것을 알려주기 위함
 }
 void eat() {
	 System.out.println("발톱으로 할퀴다.");
 }
 void meow() {
	 System.out.println("야옹하고 울다.");
 }
}
