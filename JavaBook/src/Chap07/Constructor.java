package Chap07;

public class Constructor {

	public static void main(String[] args) {
		
		System.out.println("****학생 주소록****");
		Student02 stObj = new Student02();
		
		stObj.insertRecord(20221004,"홍길순");
		stObj.printInfo();
	}

}
