package Chap07;

public class Example01 {

	public static void main(String[] args) {
		Cat catObj = new Cat(); //클래스명 객체명 = new 클래스명(); -> 객체생성
		//멤버변수 초기화
		catObj.breed = "페르시안 고양이"; 
		catObj.color = "흰색";
		//품종과 색상 출력 
		System.out.println("품종: " + catObj.breed);
		System.out.println("색상: " + catObj.color);
	}
}
