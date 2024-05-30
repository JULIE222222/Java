
package Assignment03;

public class ParseInt {

	public static void main(String[] args) {
		String s = "12345"; // 문자열 정의
		int i = Integer.parseInt(s); // 문자열 's'를 정수로 변환
		System.out.printf("문자를 숫자로 %d (%d) \n", i, i + 10);// 변환된 값과 그 값에 10을 더한 값을 출력

		String a; // 정수를 문자열로 변환하여 변수a에 저장
		a = String.format("%d", i);

		System.out.printf("숫자를 문자로 %s (%s) \n", a, a + "abcde");
		// 변환된 문자열을 출력하고, 그 문자열에 "abcde"를 이어붙인 결과도 같이 출력
	}

}
