package Chap09;

public abstract class Animal {
	public abstract void printSound(); //추상화 메서드를 쓸거면 상위 클래스 이름에도 abstract 써줘야함
	//->상속받은곳에서 무조건 구현해야 함
	
	public void displayInfo() {
	 System.out.println("나는 동물입니다.");}

}
