package Chap06;
public class Array02 {
	public static void main(String[] args) {
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5,89.7};
		double sum = 0.0;
		
		for (int i = 0; i < gradeArr.length; i++) { //배열 초기값을 for문을 통해 값을 출력하여 합계를 구함
			sum += gradeArr[i];
		}		
		double average = sum / gradeArr.length;
		System.out.println("합계: "+sum);
		System.out.println("average: "+average);
		System.out.format("평균: %.2f", average);//두자리수까지만 표현하고 싶을때, 
		System.out.println();
	//	System.out.printf("평균: %.2f", average);//format과 같음
		System.out.println();
		System.out.println("평균: "+String.format("%.2f", average));
	//	System.out.println(Math.round(average*100)/100.0); //소수점자리까지 보고싶을때
	}
}
