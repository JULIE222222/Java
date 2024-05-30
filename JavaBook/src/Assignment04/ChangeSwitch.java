package Assignment04;
import java.util.Scanner;
public class ChangeSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //scanner의 객체 생성

        int choice = 1; //변수 선언, 초기화 함
        
        while (choice == 1) { //choice가 1이면 while반복문 실행
            int a; //변수 a선언

            System.out.println("숫자를 입력하세요.");
            a = s.nextInt(); // 정수를 입력받아 변수에 저장

            switch (a % 2) { // 입력된 숫자를 2로 나눈 나머지
                case 0: // 나머지가 0인 경우 (짝수)
                    System.out.println("짝수입니다."); // 짝수임을 출력
                    break; // switch 문을 빠져나감
                case 1: // 나머지가 1인 경우 (홀수)
                    System.out.println("홀수입니다."); // 홀수임을 출력
                    break; // switch 문을 빠져나감
            }

            System.out.println("계속하고 싶다면 예1, 그만하고 싶다면 아니요 0을 입력하세요.");

            choice = s.nextInt(); //입력한 상수 값을 변수에 넣음
        }
        
      //while 조건문에 해당하지 않는 1이외의 숫자를 입력하면 반복문 빠져나옴
        System.out.println("모든 숫자를 확인했습니다."); 
    }
}
