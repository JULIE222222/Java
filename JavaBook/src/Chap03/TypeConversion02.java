package Chap03;

public class TypeConversion02 {

	public static void main(String[] args) {

		int x = 10;
		double y = 3.0;

		System.out.println(x / y);
		System.out.println(x / (int) y); // y를 강제로 int형으로 변환해서 몫을 구한 값을 출력
		System.out.println((int) (x / y)); // 몫을 구한 값을 강제로 int형으로 변환하여 출력

	}

}
