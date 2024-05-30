package Assignment06;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 로또 번호 생성
        List<Integer> lottoNumbers = generateLottoNumbers();
  
        
        // 사용자로부터 번호 입력 받기
        List<Integer> userNumbers = getUserNumbers(scanner);
        
        // 번호 비교하여 결과 출력
        int rank = compareNumbers(lottoNumbers, userNumbers);
        printResult(lottoNumbers, userNumbers, rank);
        
        scanner.close();
    }
    
    // 로또 번호 생성 메서드
    public static List<Integer> generateLottoNumbers() {
        Random random = new Random();
        List<Integer> lottoNumbers = new ArrayList<>();
        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            if (!lottoNumbers.contains(randomNumber)) {
                lottoNumbers.add(randomNumber);
            }
        }
        Collections.sort(lottoNumbers); // 번호를 정렬하여 반환
        return lottoNumbers;
    }
    
    // 사용자로부터 번호 입력 받는 메서드
    public static List<Integer> getUserNumbers(Scanner scanner) {
        List<Integer> userNumbers = new ArrayList<>();
        System.out.println("1부터 45 사이의 6개의 숫자를 입력하세요:");
        while (userNumbers.size() < 6) {
            int number = scanner.nextInt();
            if (number < 1 || number > 45) {
                System.out.println("1부터 45 사이의 숫자를 입력해야 합니다.");
                continue;
            }
            if (!userNumbers.contains(number)) {
                userNumbers.add(number);
            } else {
                System.out.println("이미 입력한 숫자입니다. 다른 숫자를 입력하세요.");
            }
        }
        Collections.sort(userNumbers); // 번호를 정렬하여 반환
        return userNumbers;
    }
    
    // 번호 비교하여 등수 결정하는 메서드
    public static int compareNumbers(List<Integer> lottoNumbers, List<Integer> userNumbers) {
        int matchedNumbers = 0;
        for (int number : userNumbers) {
            if (lottoNumbers.contains(number)) {
                matchedNumbers++;
            }
        }
        
        int rank;
        if (matchedNumbers == 6) {
            rank = 1;
        } else if (matchedNumbers == 5 && userNumbers.containsAll(lottoNumbers)) {
            rank = 2;
        } else if (matchedNumbers == 5) {
            rank = 3;
        } else if (matchedNumbers == 4) {
            rank = 4;
        } else if (matchedNumbers == 3) {
            rank = 5;
        } else {
            rank = -1; // 꽝
        }
        return rank;
    }
    
    // 결과 출력 메서드
    public static void printResult(List<Integer> lottoNumbers, List<Integer> userNumbers, int rank) {
        System.out.println("로또 번호: " + lottoNumbers);
        System.out.println("사용자 입력 번호: " + userNumbers);
        if (rank == -1) {
            System.out.println("아쉽지만 꽝입니다.");
        } else {
            System.out.println("축하합니다! " + rank + "등입니다!");
        }
    }
}