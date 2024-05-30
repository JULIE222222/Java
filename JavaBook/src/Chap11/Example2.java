package Chap11;

public class Example2 {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 5 / a;
		} catch (ArithmeticException e) { // 예외클래스 e(수학적으로 잘못 된 것이 있으면 이쪽으로 들어옴)
			System.out.println("0으로 나눕니다."); // ->try블록에서 예외 발생시 실행
		} catch (Exception e) {
			System.out.println("그 밖의 예외 사황");
		}
		System.out.println("try~catch문의 외부 문장입니다.");
	}
}
