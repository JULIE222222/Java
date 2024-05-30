package Chap07;

public class AccessModifier03 {
	  public static void main(String[] args) { 
	 Dog obj = new Dog();
	
	        obj.breed= "포메라이언";
	        obj.color= "갈색";
	
	        System.out.println("강아지 품종 : " + obj.breed);
	        System.out.println("강아지 색상 : " + obj.color);
	        obj.bowwow();
	        obj.age= 10;
	        System.out.println("강아지 나이 : " + obj.age);
	        obj.run();
	
	        obj.name = "다운"; //private으로 선언해서 변경 불가능
	        System.out.println("강아지 이름 : " + obj.name);
	        obj.sleep();
	    }
}