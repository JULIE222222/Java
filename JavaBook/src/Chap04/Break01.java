package Chap04;

public class Break01 {

	public static void main(String[] args) {

		//출력코드가 if문보다 뒤에 있기때문에 i는 4까지만 출력함
		for( int i = 0; i<10; i++) { //i가 0에서 9까지 1씩 증가하면서 내부코드를 반복
			if(i == 5) //i가 5가 되었을때
				break; //구문을 종료함
			System.out.println("i: " + i); //문자열출력 이어서 i의 값출력
		}

	}

}
