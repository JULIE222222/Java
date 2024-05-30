package Chap08;

public class SubKitten2 extends SuperCat2 {

	String name;
	String age = "2살";

	public SubKitten2(String n1, String n2) {
		super(n1); //super 부모의 생성자를 불러올때 사용->자식클래스 생성자 첫 줄에 와있어야함
		this.name = n2;
		System.out.println("아기 고양이입니다." + " 이름은 " + name);
	}
}
