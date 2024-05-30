package Assignment04;

public class Hw491 {

	public static void main(String[] args) {
		
		int sum = 0; //변수 선언, 초기화
		
		for(int i = 0; i < 10; i++) { //i를 0에서 9까지 1씩 증가시키며 반복문을 돔
			sum = sum + i; //sum에 각 for문에서 출력된 i값을 더해 0~9까지의 합을 구한다.
	}
		System.out.println("sum: " + sum); //문자열 출력과 0~9까지의 합의 값을 출력한다.

 }
}
