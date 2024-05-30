package Chap07;
//이런식으로 사용은 안함
public class Add {
	Add() {
		System.out.println("기본 생성자 Add() 호출");
	}

	//오버로딩
	Add(int a, int b) { //int형 2개의 값을 매개변수로 받음
		System.out.println("일반 생성자 Add(int a, int b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b)); //a,b의 값을 받아 연산한 값을 출력
	}
	Add(double a, double b) {//double형 2개의 값을 매개변수로 받음
		System.out.println("일반 생성자 Add(double a, double b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	Add(int a, double b) { //int형, double형 의 값을 매개변수로 받음
		System.out.println("일반 생성자 Add(int a, double b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
