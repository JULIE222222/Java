package Chap11;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = s.nextInt();

		int arr[] = new int[5];

		try {//숫자가 제대로 들어가면 숫자출력
			
			
			arr[num] = 10 / num;
			System.out.println(arr[num]);
			
			//다른 문구를 넣으면 catch문 실행됨
		} catch (ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력하세요.");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 배열 인덱스를 입력하세요.");
			System.out.println(e.getMessage());
		}
	}

}
