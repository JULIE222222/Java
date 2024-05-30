package Assignment03;

public class FloatDouble {

	public static void main(String[] args) {

		float f = 9.123456789f;
		double d = 9.123456789;
		double d2 = (double) f;// double형 d2에 f를 double형으로 강제 변환하여 넣음

		System.out.println("f = " + f); // 문자열과 float형 값과 함께 출력
		System.out.println("d = " + d); // 문자열과 double형 값과 함께 출력
		System.out.println("d2 = " + d2); // 문자열과 double형으로 바꾼 f값과 함께 출력,f값이 9.123457이므로 형변환이 일어나면서 0자리에 6이후의 값은 의미없는 값이 들어감 9.123456954956055
	}

}
