package Chap04_2;

import java.util.Scanner;

public class Multiple3Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int a = s.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int b = s.nextInt();
		int sum = 0;
		
		for(int i = a + 2; i < b; i += 3) {
		System.out.print(i + " ");
		sum += i;
		
		}
		System.out.println("");
		System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);

	}

}
