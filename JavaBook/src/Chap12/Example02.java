package Chap12;

import java.io.File;
import java.io.FileOutputStream;

public class Example02 {
	public static void main(String[] args) {

		String str = "Hello! Java Programming ";
		try {
			File file = new File("example02.txt");
			if (!file.exists()) //파일이 없으면 만들기
				file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file); //파일작성하는 것을 생성하는 것

			byte[] b = str.getBytes(); //바이트로 쪼개서 넣음
			fos.write(b);
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
