package Assignment07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScoreOutput_test {

	public static void main(String[] args) {

		int startperson = 0;
		int allPerson = 200;
		int pagePerPerson = 30;
		int totalPages = (allPerson + pagePerPerson - 1) / pagePerPerson;
		// int totalPages = (int) Math.ceil((double) allPerson / pagePerPerson);

		for (int j = 0; j < totalPages; j++) {
			System.out.println("\t\t" + "   성적집계표");

			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
			System.out.println("PAGE: " + (j + 1) + "\t\t\t" + "출력일자: " + formatedNow);
			System.out.println("=====================================================");
			System.out.println("번호" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + ""
					+ "\t" + "총점" + "\t" + "평균");
			System.out.println("=====================================================");

			// 페이지당 출력할 학생 수 계산
			int studentsPerPage = Math.min(pagePerPerson, allPerson - j * pagePerPerson);
			//pagePerPerson: 정해진 페이지당 학생수를 나타냄
			//allPerson - j * pagePerPerson: 현재 페이지에서 출력되어야 하는 남은 학생수를 나타냄
			

			InputData inData = new InputData(pagePerPerson);

			for (int i = 0; i < studentsPerPage; i++) {
				String name = "홍길" + (j * pagePerPerson + i + 1); // 페이지와 루프 변수를 사용하여 학생 번호를 계산
				int kor = (int) (Math.random() * 101);
				int eng = (int) (Math.random() * 101);
				int mat = (int) (Math.random() * 101);
				inData.setData(i, name, kor, eng, mat);

				System.out.println((i + 1) + "\t" + inData.name[i] + "\t" + inData.kor[i] + "\t" + inData.eng[i] + "\t"
						+ inData.mat[i] + "\t" + inData.sum[i] + "\t" + inData.avg[i]);
			}

			System.out.println("=====================================================");
			System.out.println("현재페이지");
			System.out.println("=====================================================");
			System.out.println("누적페이지");
			System.out.println();
		}
	}
}