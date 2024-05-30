package Chap04_2;

import java.time.LocalDateTime; //ctrl를 누르면 (implementation을 누름)어떻게 코딩이 되었는지 볼 수 있음
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class receipt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("금액을 입력하세요: ");
		int price = s.nextInt();
		System.out.println();

		System.out.println("\t" + "매출전표 (카드회사용)");
		System.out.println("맛꼬방치킨" + "\t\t\t " + "하순희");
		System.out.println("124-25-54620" + "\t " + "063-632-6614");
		System.out.println("전북 남원시 농고길 11 (도통동)");
		System.out.println();
		System.out.println("하나기업카드  " + " \t " + "    신용승인(I)");

		LocalDateTime now = LocalDateTime.now(); 
		// System.out.println(now);
		String formatedNow = now.format(DateTimeFormatter.ofPattern("거래일시: " + "yyyy/MM/dd " + "HH:mm:ss"));
		//MM과 HH는 규칙이라 꼭 대문자로 사용해야함
		System.out.println(formatedNow);

		System.out.println("4336-9200-****-982*" + "\t " + "일시불");
		System.out.println("TID:" + "***13440 " + "230964317368(0001)");
		System.out.println("가맹점No " + "00921293692");
		System.out.println("매  입  사  " + "하나카드(다우데이타)");
		System.out.println("승 인 번 호 " + " 40860059");

		System.out.println("-------------------------------");
	
		
		int tax_a = (int) (price / 11); // tax_a를 사용하기 전에 계산합니다.
		double tax = price / 11.0; // tax를 계산합니다.
		int sale_price = price - tax_a; // sale_price를 계산합니다. tax_a가 계산된 후에 계산합니다.
		System.out.println("판매금액:" + "\t\t\t" + sale_price + "원"); //price*0.9
		System.out.println("부 가 세:" + "\t\t\t " + tax_a + "원"); //price*0.1
		System.out.println("합   계:" + "\t\t\t" + price + "원");
		
		System.out.println("-------------------------------");
			
	}
}


/*import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class receipt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        int price = s.nextInt();
        System.out.println();

        System.out.println("\t" + "매출전표 (카드회사용)");
        System.out.println("맛꼬방치킨" + "\t\t\t " + "하순희");
        System.out.println("124-25-54620" + "\t " + "063-632-6614");
        System.out.println("전북 남원시 농고길 11 (도통동)");
        System.out.println();
        System.out.println("하나기업카드  " + " \t " + "    신용승인(I)");

        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("거래일시: " + "yyyy/MM/dd " + "HH:mm:ss"));
        System.out.println(formatedNow);

        System.out.println("4336-9200-****-982*" + "\t " + "일시불");
        System.out.println("TID:" + "***13440 " + "230964317368(0001)");
        System.out.println("가맹점No " + "00921293692");
        System.out.println("매  입  사  " + "하나카드(다우데이타)");
        System.out.println("승 인 번 호 " + " 40860059");

        System.out.println("-------------------------------");

        // 세금 및 판매금액 계산
        int tax_a = (int) (price / 11); // 부가세 계산
        double tax = price / 11.0; // 세금 계산
        int sale_price = price - tax_a; // 판매금액 계산

        // DecimalFormat을 사용하여 숫자를 형식화하고 쉼표를 추가합니다.
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        String formattedPrice = decimalFormat.format(price);
        String formattedSalePrice = decimalFormat.format(sale_price);
        String formattedTaxA = decimalFormat.format(tax_a);

        System.out.println("판매금액:" + "\t\t\t" + formattedSalePrice + "원");
        System.out.println("부 가 세:" + "\t\t\t " + formattedTaxA + "원");
        System.out.println("합   계:" + "\t\t\t" + formattedPrice + "원");
    }
}*/



