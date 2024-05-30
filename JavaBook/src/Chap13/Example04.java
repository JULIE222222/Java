package Chap13;

import java.util.HashSet; //순서 상관없이 값의 중복이 되지 않게 하기위해서 HashSet을 사용

public class Example04 {
	public static void main(String[] args) {
		HashSet<String> cats = new HashSet<String>();
		cats.add("페르시안");
		cats.add("샴");
		System.out.println(cats);
		cats.add("러시안블루");
		System.out.println(cats);
		cats.remove("페르시안");
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.contains("샴"));
	}

}
