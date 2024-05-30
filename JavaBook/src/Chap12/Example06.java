package Chap12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example06 {
	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");

			if (!file.exists()) // 한줄씩 끝까지 읽어오게끔
				file.createNewFile();
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			String str;

			while ((str = br.readLine()) != null) { // 읽어올것이 없으면 끝
				System.out.println(str);
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
