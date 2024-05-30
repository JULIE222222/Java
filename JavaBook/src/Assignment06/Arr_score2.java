package Assignment06;
import java.util.Scanner;
public class Arr_score2 {
	public static void main(String[] args) {
		int[][] marks = new int[5][3]; // 1. 배열 크기를 [5][3]으로 수정
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) { // 2. 루프를 0부터 4까지 총 5번 반복
			System.out.println("학생번호" + (i + 1));

			System.out.print("국어점수 : ");
			marks[i][0] = s.nextInt();

			System.out.print("영어점수 : ");
			marks[i][1] = s.nextInt();

			System.out.print("수학점수 : ");
			marks[i][2] = s.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			marks[i][2] = (marks[i][0] + marks[i][1] + marks[i][2]);
			double average = (double) marks[i][2] / 3; // 평균 계산 시에도 과목이 3개이므로 3으로 나누어야 함
			System.out.println((i + 1) + "번 학생의 총점: " + marks[i][2] + ", " + (i + 1) + "번 학생의 평균: " + average);
		}
	}

}
