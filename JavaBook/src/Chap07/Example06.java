package Chap07;

public class Example06 {
	public static void main(String[] args) {
		Cat5 cat1 = new Cat5(); //품종과 색상의 값을 주지않았기때문에 결과가 null으로 뜸
		Cat5 cat2 = new Cat5("샴");//색상의 값을 주지않아 결과가 null으로 뜸
		Cat5 cat3 = new Cat5("러시안블루", "회색"); //값이 2개인 일반생성자
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed + " \t색상 : " + cat1.color);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed + " \t색상 : " + cat2.color);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed + " \t색상 : " + cat3.color);
	}

}
