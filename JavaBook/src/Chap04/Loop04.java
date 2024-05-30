package Chap04;
import java.util.Scanner;
public class Loop04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //scanner객체 생성
		System.out.print("길이 : ");
		
		int len = s.nextInt(); //입력받은 정수값은 변수에 넣음
		
		for(int i = 0; i < len; i++) { //i의 값이 len의 변수보다 작아질때까지 반복(행을 나타냄)
			for(int j= 0; j<i; j++) //j가 i보다 작으면 반복함(빈칸을 출력하는 열을 나타냄)
			  {
			   System.out.print(" "); //빈칸을 먼저출력 후 
			  }
			
			//j가(2*len)-1-(i*2)의 값보다 작으면 반복 (*을 출력하는 열을 나타냄)
		    for(int j = 0; j < (2*len)-1-(i*2);j++) { 
				System.out.print("*"); //*을 이어서 출력
			}
			System.out.println(""); //ln으로 출력하여 줄바꾸기
		}
	}

}
