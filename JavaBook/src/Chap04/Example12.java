package Chap04;

public class Example12 {
	public static void main(String[] args) {
		
		for( int i=0 ; i<=10; i++) { //i가 0에서 10까지 1씩 증가하며 반복되는 구문
			
			//i가 3또는 6또는 9일때 if문을 들어가 continue를 실행하여 건너뛰고 반복되기때문에 
			if(i == 3 || i==6||i == 9) { 
				continue;
			}
			System.out.print(i + " "); //3,6,9를 제외한 i의 숫자들을 출력하고 빈칸 출력 
		}
	}
}
