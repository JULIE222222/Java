package Chap07;

public class Example02 {
	static void myMethod1() { 
	//클래스 내에서 어디든 사용할 수 있도록 만들어져서-> 메서드를 클래스 수준으로 만들어주는 역할을 함
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() { //public 은 다른부분에서 사용할 수 있게끔 허용하는 것
		System.out.println("인스턴스 메서드 호출");
	}
	public static void main(String[] args) {
		myMethod1(); //static 키워드를 선언해서 객체생성 필요 없음
		 // myMethod2(); //static 키워드를 선언하지 않았기때문에 객체생성필요함,그냥은 실행 안됨
		 Example02 myObj = new Example02();// 클래스명 객체명 = new 클래스명
		 myObj.myMethod2(); //생성한 객체를 불러와서 사용(많이 사용)
	}

}
