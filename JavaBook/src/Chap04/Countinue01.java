package Chap04;

public class Countinue01 {

	public static void main(String[] args) {
		//중첩 for문
		for (int i = 1; i <= 4; i++) { //1부터 4까지의 숫자를 반복함
		for (int j = 1; j <= 3; j++) { //1부터 3까지의 숫자를 반복함
			if (i==3 && j ==2) { //i가 3이고 j가 2일때 다음 코드 실행하지 않고 다음반복으로 넘어감
				continue; 
			}
			System.out.println(i + "*" + j); //i와 j의 값을 곱하는 형식으로 출력
		}
	}
}
}