package Assignment06;

public class Comparison_2 {

	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) {
			System.out.println(i + "월 => ");
			for (int j = 1; j < 32; j++) {
				System.out.print(j + ",");
				if (i == 4 || i == 6 || i == 9 || i == 11) 
				{
					if (j == 30)
						break;
				}
				if (i == 2) 
				{
					if (j == 28)
						break;
				}

			}
			System.out.println();
		}

	}
}
