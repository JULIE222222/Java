package Chap04;

import java.util.Scanner;
public class If02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
        int num = s.nextInt(); //int형 변수에 입력한 값 넣음
        
        if( num % 2 == 0) {
        	System.out.println(num + "은 짝수입니다."); //num을 2로 나눈 나머지 값이 0일때 출력됨
        }
        	else {
        		System.out.println(num + "은 홀수입니다."); //if문 조건이 거짓일때 출력됨
        	}
        	System.out.println("이 문장은 if문 외부에 있습니다."); //조건문 밖에 있기때문에 무조건 출력됨
     
	}

}
