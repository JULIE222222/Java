package Chap06;

public class Example01 {

	public static void main(String[] args) {
		int[] myArr = new int[5]; //배열 선언, 초기화
		//각 자리에 값을 넣어줌
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		
		
		for (int i = 0; i < myArr.length; i++) //myArr.length는 5와 같음
			//System.out.println("myArr.length : " +  myArr.length);
			System.out.println(i + "번째 요소값 : " + myArr[i]); //i의 값과 문자열과 배열의 값을 출력
	}

}
