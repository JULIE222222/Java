package Chap12;

import java.io.File;
import java.io.FileReader;

public class FileHandling05 {
	public static void main(String[] args) {

		File file = new File("member.txt");
		try {
			if (!file.exists())
				file.createNewFile();

			FileReader fis = new FileReader(file);
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i); //byte로 가져오지 않고 문자로 가져옴
			}
			
			fis.close();
			System.out.print("파일 읽기 성공");
			
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
