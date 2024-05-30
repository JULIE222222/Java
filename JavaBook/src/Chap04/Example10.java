package Chap04;

public class Example10 {
	public static void main(String[] args) {
		
		for ( int i = 2; i <= 4;i++) { // 2부터 4까지의 숫자를 i에 대입하면서 반복함
			System.out.println("구구단 "+ i + "단"); // 현재의 i값에 해당하는 구구단 단수를 출력함
			
			for(int j=1; j <= 10; j++) {// 1부터 10까지의 숫자를 j에 대입하면서 반복함
				System.out.println(i + "*"+ j + " = " + (i*j)); //구구단의 계산식을 출력함
			}
		}
	}

}
