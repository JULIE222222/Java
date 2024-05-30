package Chap06;

public class Example02 {

	public static void main(String[] args) {
		
		int[] myArr = {10,20,30,40,50}; //배열 선언, 초기화
		for(int i = 0 ; i< myArr.length; i++) { //for문으로 myArr.length을 이용하여 배열의 값 출력
			System.out.println(i + "번째 요소값: "+ myArr[i]);
		}
	}

}

