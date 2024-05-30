package Chap07;

public class MemberChain {
	//매개변수 선언
	String firstName;
	String country;
	int age;

	public MemberChain() { //기본생성자
		this("홍길순"); //this로 mName을 호출
	}

	public MemberChain(String mName) { //일반생성자
		this(mName, 20); //this로 mName,age을 호출
	}

	public MemberChain(String mName, int mAge) { //일반생성자
		this(mName, mAge, "대한민국"); //this로 mName,age,mcountry 을 호출
	}

	public MemberChain(String mName, int mAge, String mCountry) { //일반생성자
		//누적된 초기화 값으로 매개변수의 값을 각 변수에 넣음
		firstName = mName;
		age = mAge;
		country = mCountry;
	}
	
	void printInfo() {
		System.out.println("이름 : " + firstName);
		System.out.println("국적 : " + country);
		System.out.println("나이 : " + age);
	}
}
