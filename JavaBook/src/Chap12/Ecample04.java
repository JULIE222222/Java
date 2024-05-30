package Chap12;

import java.io.File;
import java.io.FileInputStream;

public class Ecample04 {
	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if (!file.exists())
				file.createNewFile();

			FileInputStream fis = new FileInputStream(file); //파일 읽어오는 방법
			int i = 0;

			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

