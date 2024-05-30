package Chap09;

public class Pig implements Animal02 { //상속받아 Animal내의 메소드를 구현함

	public void animalSound() {
		System.out.println("꿀꿀하고 소리내다");
	}

	public void animalWalk() {
		System.out.println("네발로 걷다");
	}
}
