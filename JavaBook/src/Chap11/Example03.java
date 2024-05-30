package Chap11;

public class Example03 {
	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			System.out.println("잘못된 요소에 접근" + a[3]);
		} catch (Exception e) {
			System.out.println("예외 발생 ArrayIndexOutOfBoundException " + e);
		} finally { // 이 안의 문구등은 오류가 생겨도 항상 실행됨
			System.out.println("finally는 항상 실행됩니다.");
		}
	}
}


