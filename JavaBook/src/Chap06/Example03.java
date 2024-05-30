package Chap06;
public class Example03 {
	public static void main(String[] args) {
		int[][] myArr = new int[2][4]; //행,열을 배열로 표현
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		int sum1 = 0, sum2 = 0; //sum을 선언,초기화함
		for (int i = 0; i < 4; i++) { //for문으로 배열을 이용하여 첫번째 행의 합계를 구함
			sum1 += myArr[0][i];
		}
		System.out.println("첫 번째 행의 합계: " + sum1);

		for (int i = 0; i < 4; i++) {//for문으로 배열을 이용하여 두번째 행의 합계를 구함
			sum2 += myArr[1][i];
		}
		System.out.println("두 번째 행의 합계: " + sum2);
	}
}
