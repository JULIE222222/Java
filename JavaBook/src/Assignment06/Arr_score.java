package Assignment06;

import java.util.Scanner;

public class Arr_score {
	public static void main(String[] args) {

		int sum = 0;
		int average = 0;
		int[] myArr;
		myArr = new int[5];

		Scanner s = new Scanner(System.in);
		System.out.println("학생의 국어 점수를 입력하세요: ");

		for (int i = 0; i < 5; i++) {
			myArr[i] = s.nextInt();
			sum += myArr[i];
		}
		average = sum / 5;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
	}
}
