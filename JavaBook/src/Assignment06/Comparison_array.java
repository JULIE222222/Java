package Assignment06;

public class Comparison_array {

	public static void main(String[] args) {

		int[] iday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i < 13; i++) {
			System.out.println(i + "월 => ");

			for (int j = 1; j < 32; j++) {
				System.out.print(j);

				if (iday[i - 1] == j)
					break;
				System.out.print(",");
			}
			System.out.println();
		}
	}

}
