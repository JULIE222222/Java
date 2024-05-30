package Chap07;

public class Example04 {

	public static void main(String[] args) {
		
		//=의 오른쪽이 생성자, new는 연산자 -> 새로운 객체를 만들 때 그 객체의 특성을 설정하는 역할
		Cat3 cat1 = new Cat3(); //cat1 객체 생성
		cat1.breed = "페르시안"; //cat1의 멤버변수 선언,초기화
		Cat3 cat2 = new Cat3(); //cat2 객체 생성
		cat2.breed = "샴"; //cat3의 멤버변수 선언,초기화
		Cat3 cat3 = new Cat3(); //cat3 객체 생성
		cat3.breed = "러시안 블루"; //cat3의 멤버변수 선언,초기화
		
		//문자열과 선언된 멤버변수의 값을 출력
		System.out.println("첫 번째 고양이 품종: "+ cat1.breed);
		System.out.println("두 번째 고양이 품종: "+ cat2.breed);
		System.out.println("세 번째 고양이 품종: "+ cat3.breed);

	}

}
