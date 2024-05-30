package Chap04_2;

public class Gugudan01 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 3) {

			System.out.println("*******************************************");
			System.out.println(" 구구단 " + i + "단" + "\t" + " 구구단 " + (i + 1) + "단" + "\t" + " 구구단 " + (i + 2) + "단");
			System.out.println("*******************************************");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j + "\t" 
			                      +(i + 1) + " * " + j + " = " + (i + 1) * j+ "\t" 
						          + (i + 2) + " * " + j + " = " + (i + 2) * j);
			}

			System.out.println("");
		}

	}

}
