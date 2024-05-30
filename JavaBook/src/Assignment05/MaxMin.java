package Assignment05;
import java.util.Scanner;
public class MaxMin {
	public static void max(int x, int y, int z) {
		int result;
		if (x < y) {
			if (y < z)
				result = z;
			else
				result = y;
		}

		else {
			if (x < z)
				result = z;
			else
				result = x;
		}
		System.out.println(result + "는 가장 큰 정수입니다.");
	}

	public static void min(int x, int y, int z) {
		int result;
		if (x > y) {
			if (y > z)
				result = z;
			else
				result = y;
		}

		else {
			if (x > z)
				result = z;
			else
				result = x;
		}
		System.out.println( result +"는 가장 작은 정수입니다.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("3개의 숫자를 입력하세요.");

		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();

		max(x, y, z);
		min(x, y, z);
	}
}
