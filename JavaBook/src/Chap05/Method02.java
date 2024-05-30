package Chap05;

public class Method02 {
	// int형으로 값을 반환하고 입력값은 없는 함수
	public static int div() {
		int a = 10, b = 5;
		int result = a / b;

		return result;
	}

	public static void main(String[] args) {
		int num = div();   //결과를 재사용하거나, 코드의 가독성을 높이기 위해 변수에 값을 넣어줌
		System.out.println(num); // 변수 num의 값을 출력
	}
}
