package Assignment04;
public class Hw492 {
	public static void main(String[] args) {
		//중첩 for문을 이용하여 구구단 출력

		for( int i = 1; i < 10; i++) {  //i가 1에서 9까지 1씩 증가하면서 반복문이 돔,단수 표현
			System.out.println("**********");
			System.out.println("구구단 " + i + " 단");//몇단인지 i값과 문자열을 넣어 출력
			System.out.println("**********");
			for(int j = 1; j < 10; j++) { //j가 1에서 9까지 1씩 증가하면서 반복문이 돔, 곱셈식 표현
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
