package Chap07;

public class Object01 {

	public static void main(String[] args) {
		
		Student stObj1 = new Student();//객체생성-> 클래스명 객체명 = new 클래스명();
		//객체 생성 후 멤버변수를 직접 값을 할당함
		stObj1.id = 20221004;
		stObj1.name = "홍길순";
		stObj1.printInfo();
		
		Student stObj2 = new Student();//객체생성-> 클래스명 객체명 = new 클래스명();
		stObj2.insertRecord(20221005,"홍길동"); 
		//개체생성을 하는 동시에 값을 할당->인자로 전달된 값을 멤버변수에 입력
		stObj2.printInfo();//Student클래스의 메서드를 가져와서 출력
		//insert로 객체의 정보를 설정한 후, Info로 정보를 출력

	}

}
