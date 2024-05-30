package Chap07;
public class Constructor02 {
	public static void main(String[] args) {
		System.out.println("****학생 주소록****");

		Student3 stObj1 = new Student3(); //기본생성자
		stObj1.insertRecord(20221004, "홍길순");
		//기본생성자는 매개변수의 값을 초기화하기위해 insert메서드로 변수 설정
		stObj1.printInfo(); //객체의 정보를 출력

		Student3 stObj2 = new Student3(20221005, "홍길동"); //일반생성자
		stObj2.printInfo();
		// 일반생성자는 객체 생성시 매개변수도 같이 초기화하므로 따로 메서드로 변수 설정이 필요없음,값을력만 함
	}
}   
