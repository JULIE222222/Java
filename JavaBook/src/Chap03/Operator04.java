package Chap03;

public class Operator04 {
	
	public static void main(String[] args) {
		
		  //정수형 a,b,c를 선언하고 a,b는 초기화까지 함
		  int a = 10; 
		  int b = 20;
		  int c;
		  
		  System.out.println(c = a); //c에 a값을 넣어 출력(10)
		  System.out.println(b += a); // b+a한 값을 b에 넣어 출력(30)
		  System.out.println(b -= a); // b-a한 값을 b에 넣어 출력(20)
		  System.out.println(b *= a); // b*a한 값을 b에 넣어 출력(200)
		  System.out.println(b /= a); // b/a한 값을 b에 넣어 출력(20)
		  System.out.println(b %= a); // b%a한 값을 b에 넣어 출력(0)
	}

}
