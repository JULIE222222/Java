package Chap07;

public class Example03 {
	public static void main(String[] args) { 
		Cat2 catObj = new Cat2(); //클래스명 객체명 = new 클래스명(); ->객체생성
		
		 System.out.println("페르시안 고양이"); //문자열 출력

		 catObj.meow(); //객체명.메서드명; -> Cat2클래스에서 메서드 호출시 사용 구조
		 
		 catObj.color = "갈색";
		 //오버라이딩(Ex3클래스에서 color가 갈색임) -> Cat2의 color가 바뀌는 것이 아님
	}
		 }
