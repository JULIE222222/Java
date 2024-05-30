package Chap04;

public class Example06 {

	public static void main(String[] args) {
		
		char  grade = 'B'; //변수 선언,초기화
		switch (grade) { //grade변수를 조건으로 넣음
		//각 case에 해당하는 변수이면 문자열 출력 후 switch문 빠져나옴
		case 'A': 
			System.out.println("매우 우수");
			break;
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀 더 열심히");
			break;	
		case 'F':
			System.out.println("미흡");
			break;		
		default:
			System.out.println("잘못된 등급"); //위에 해당하는 문자가 아닌경우
		}

	}

}
