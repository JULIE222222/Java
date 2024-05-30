package Assignment03;

public class YearAge {

	public static void main(String[] args) {

		int k01_year = 0; // 년도 선언,초기화
		int k01_age = 14; // 나이 선언,초기화

		System.out.println("결과1: " + k01_year); // 문자열과 연도 출력
		System.out.println("결과2: " + k01_age); // 문자열과 나이 출력

		k01_year = k01_age + 2000; // k01_age에 2000을 더해 year에 넣음
		k01_age = k01_age + 1; // k01_age에 1을 더해 값을 덮어씌움

		System.out.println("결과3: " + k01_year); // 문자열과 연도 출력
		System.out.println("결과4: " + k01_age); // 문자열과 나이 출력

	}

}
