package Chap05;

public class Example01 {
    //method안에 method는 사용 불가능
	//반환값과 입력값이 없는 함수
    public static void method() { //input값이 없어서 반환값이 void
        System.out.println("static 메서드입니다.");
        System.out.println(5 + 6);
    }

    public static void main(String[] args) {
        method(); // 문자열과 계산식을 출력만하는 메서드
    }
}
