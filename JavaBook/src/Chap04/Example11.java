package Chap04;

public class Example11 {

	public static void main(String[] args) {
		// 출력하는 구문이 if문보다 먼저 있어서 *이 두번찍히고 if문의 조건이 만족함으로 인해 for문 종료
		for(int n =1;n <= 5; n++) //n을 1에서 5까지 한번씩 증가시키며 내부코드를 반복함
		{
		  System.out.println("*"); //문자 *을 출력
			if(n==2) //n이 2일때
			{
			  break; //반복문을 종료해줌
			}
		}

	}
}
