package Assignment06;

public class NumRead {

	public static void main(String[] args) {
		String[] units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };

		for (int i = 0; i < 101; i++) {
			if (i >= 0 && i < 10) {
				System.out.println(" 일의자리: " + units[i]);
			} else if (i >= 10 && i < 100) {
				int i10, i0;
				i10 = i / 10;
				i0 = i % 10;

				if (i0 == 0) {
					System.out.println(" 십의자리: " + units[i10] + "십");
				} else {
					System.out.println(" 십의자리: " + units[i10] + "십" + units[i0]);
				}
			} else
				System.out.println("==> " + i);
		}

	}

}
