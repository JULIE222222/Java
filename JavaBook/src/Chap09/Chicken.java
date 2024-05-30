package Chap09;

public class Chicken implements Fly, Walk {

	//interface라 여러개 상속받아 구현 가능
	public void fly() {
		System.out.println("닭은 날 수 있다.");
	}
	
	public void walk() {
		System.out.println("닭은 걸을 수 있다.");
	}
}
