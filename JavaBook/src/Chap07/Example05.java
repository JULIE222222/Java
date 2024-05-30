package Chap07;

public class Example05 {

	public static void main(String[] args) {
		 Cat4 cat1 = new Cat4("페르시안") ; //일반생성자
		 Cat4 cat2 = new Cat4("샴") ; //일반생성자
		 
		 Cat4 cat3 = new Cat4() ; // 기본생성자를 통해 객체를 생성하고 
		 cat3.breed = "러시안블루"; //거기에 값을 넣겠다
		 System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		 System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		 System.out.println("세 번째 고양이 품종 : " + cat3.breed);
		 }
		 
	}


