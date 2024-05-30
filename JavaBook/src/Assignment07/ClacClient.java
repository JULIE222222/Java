package Assignment07;

public class ClacClient {

	public static void main(String[] args) {

		Calc c = new Calc();

		System.out.println("2개의 덧셈이 호출됨: " + c.sum(1, 2));
		System.out.println("3개의 덧셈이 호출됨: " + c.sum(1, 2, 3));
		System.out.println("4개의 덧셈이 호출됨: " + c.sum(1, 2, 3, 4));
		System.out.println("더블형 덧셈이 호출됨: "+ c.sum(1.3, 2.4));

	}

}
