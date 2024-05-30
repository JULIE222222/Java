package Assignment03;

public class IntChar {

	public static void main(String[] args) {

		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65

		// 비트 연산자인 <<를 사용하여 연산을 수행, 1 + x는 3이 되고, 3을 33비트 왼쪽으로 시프트하면 6이 됨, int : 4byte = 32bit
		System.out.println(1 + x << 33);

		// 논리 연산자와 관계 연산자를 함께 사용하여 조건식을 듬, y는 5 이상이므로 true를 반환함
		System.out.println(y >= 5 || x < 0 && x > 2);

		// 10-x++를 먼저 계산함 10-(2+1) , 5+7 = 13
		System.out.println(y += 10 - x++);

		// 논리 부정 연산자를 사용하여 조건식을 만듬, 'A'는 'Z'보다 작거나 같으므로 조건식은 false를 반환함
		System.out.println(!('A' <= c && c <= 'Z'));

		// 문자 간의 산술 연산을 수행, 'C' (67)에서 'A'를 빼면 2가 됨
		System.out.println('C' - c);

		// 문자에 숫자를 더하면 해당 문자의 아스키코드에 숫자를 더함, 'A'의 아스키 코드인 65에 1을 더하면 66이 됨
		System.out.println(c + 1);

		// 후위 증가 연산자를 사용하여 c를 출력하고, 그 후에 c를 1만큼 증가, 따라서 출력 결과는 'A'가 됨
		System.out.println(c++);

		// 후위 증가 연산자로 인해 c가 증가되어 'B'가 됨
		System.out.println(c);

		// 전위 증가 연산자를 사용하여 c를 1만큼 증가, 따라서 출력 결과는 'C'가 됨
		System.out.println(++c);
	}

}

