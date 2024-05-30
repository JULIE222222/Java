package Chap06;

public class Array04 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		//각배열 선언, 초기화함
		int[][] firstMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };
		//int sum에 new int값을 넣음
		int[][] sum = new int[rows][columns];
		//반복문으로 firstMatrix,secondMatrix 두행렬의 합계를 구함
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; //각 행의 합계를 sum[i][j] 배열에 넣음 
			}
		}
		//반복문으로 각 배열의 합계를 구한 값 출력
		System.out.println("두 행렬의 합: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
