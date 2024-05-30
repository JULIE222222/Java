package Chap11;

public class Example5 {
	static void check() throws ArithmeticException { //잘못되면 throws 뒤로 보내줘
		System.out.println("내부 메서드");
		int div = 5 / 0;
	}

	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) { //에러가 이쪽으로 와서 메세지가 실행됨
			System.out.println("예외 발생 " + e);
		}

	}

}
