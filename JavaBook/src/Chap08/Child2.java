package Chap08;

public class Child2 extends Parent2 {

	String name = "홍길동";

	Child2() {
		super(); //부모의 생성자를 호출
		System.out.println("자식이름: " + name);

	}
}
