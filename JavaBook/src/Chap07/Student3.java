package Chap07;
public class Student3 {
	int id;
	String name;
	Student3() { //기본생성자 함수
	       System.out.println("기본 생성자 Student() 호출");
	    }
	Student3(int pram1, String pram2) { 
		//일반생성자 함수(매개변수1,매개변수2...)->매개변수 부분을 명시적으로 정의
	       System.out.println("일반 생성자 Student(...) 호출");	     
	       id = pram1;
	       name = pram2;
	    }
	
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
