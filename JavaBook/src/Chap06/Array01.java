package Chap06;
import java.util.Scanner;
public class Array01 {

	public static void main(String[] args) {
		String[] myArr; // 배열 선언
		myArr = new String[3];// 메모리 할당

		Scanner s = new Scanner(System.in);
		System.out.println("3개 문자열을 입력하세요.");

		for (int i = 0; i < 3; i++) { //입력값을 배열로 지정후 for문으로 3번돌림
			myArr[i] = s.nextLine();
		}

		for (int i = 0; i < 3; i++)
			System.out.print(myArr[i] + " "); //배열을 이용하여 입력값을 이어서 출력
	}
}
