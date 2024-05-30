package Chap06;

public class Example04 {

	public static void main(String[] args) {

		int myArr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } }; //3개의 배열 값 초기화
		for (int i = 0; i < 3; i++) { //표형식으로 행과 열로 출력하는 반복문
			for (int j = 0; j < 5; j++) {
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();// 처음 배열 출력 후 커서 아래로 이동

		}
		System.out.println("myArr[0][1] 값: " + myArr[0][1]); //0,1의 위치에 있는 값 출력
	}
}
