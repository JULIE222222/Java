package Chap07;

public class AccessMofier {

	public static void main(String[] args) {

		Dog dogObj = new Dog();
		//변수
		dogObj.breed = "포메라니언";
		dogObj.color = "갈색";

		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		//메서드
		dogObj.bowwow();
	}

}
