package Chap07;

public class Student02 {
	int id;
	String name;
	
	Student02(){ //생성자 함수
		System.out.println("기본 생성자 Student() 호출");
	}
	
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	
	void printInfo() {
		System.out.println("아이디: "+id);
		System.out.println("이름: "+name);
	}
}
