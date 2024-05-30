package Chap07;

public class Chain {
//돌아가는 순서 알고 있어야 함
	Chain(){
	 this(10); //같은 클래스 내의 다른 생성자를 호출할때 사용, 초기화 작업을 공유
	 System.out.println("기본 생성자 Chain()호출");
 }
 Chain(int x){ //10의 값을 받아옴
	 this(5,6); //첫번째 생성자를 호출하여 두번째 생성자를 초기화함
	 System.out.println("일반 생성자 Chain(int x)호출");
	 System.out.println("x의 값: "+x);
 }
 Chain(int x, int y){ //5,6의 값을 받아옴
	 System.out.println("일반 생성자 Chain(int x,int y) 호출");
	 System.out.println("x와 Y 값 : "+ x +" "+ y);
 }
}
