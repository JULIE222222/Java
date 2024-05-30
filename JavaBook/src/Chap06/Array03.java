package Chap06;
import java.util.Scanner;
public class Array03 {
	public static void main(String[] args) {
		double[][] marks = new double[2][3]; //2차원 배열 선언, 초기화함 ->평균을 구할거라 double사용
		Scanner s = new Scanner(System.in); //점수를 입력받음

		for (int i = 0; i < 2; i++) { //두명의 학생의 점수를 입력받음
			System.out.println("학생번호" + (i + 1)); //학생번호를 표시하기위해 +1을 함
			System.out.print("국어점수: ");
			marks[i][0] = s.nextDouble(); //국어점수를 입력받음

			System.out.print("수학점수: "); 
			marks[i][1] = s.nextDouble(); //수학점수를 입력받음
			
			marks[i][2] = (marks[i][0] + marks[i][1]) / 2;//입력받은 점수로 평균을 계산하고 배열에 저장
		}
		System.out.println(); 
		//입력받은 값 출력
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어" + ": " + marks[i][0] + ""); 
			System.out.print(" 수학" + ": " + marks[i][1] + "");
			System.out.println(" 평균" + ": " + marks[i][2] + "");
		}
	}
}
