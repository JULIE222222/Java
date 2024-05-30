package Chap11;

public class Exception05 {
	void check(int weight) throws InvalidException {
		if (weight < 100) { //넣어준 값이 100보다 작으면 에러가 나게 설정
			throw new InvalidException("InvalidException 클래스 호출립니다.");
		}
	}

	public static void main(String[] args) {
		
		Exception05 obj = new Exception05();
		
		try {
			obj.check(60); //값을 넣어줌
		} catch (InvalidException ex) { //에러나오면 아래부분 출력
			System.out.println("예외 처리입니다. ");
			System.out.println(ex.getMessage());
		}
	}
}
