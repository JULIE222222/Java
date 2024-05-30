package Chap05;

public class Method04 {
    //출력값과 입력값이 없는 함수 : 함수 안에서 sum을 호출함
	public static void sum() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) { //1부터 10까지 의 합을 for문을 통해 구함
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.print("1부터 10의 합계 : ");
		sum();
		//문자열을 출력하고 함수를 출력함
	}
}
