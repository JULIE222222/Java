package com.section03;

public class Package04 {
	public static void main(String[] args) {

		String str1 = "www.google.com";
		//String str1 = "www0google0com";

		String[] arrStr1;

		arrStr1 = str1.split("\\."); // \\는 .을 문자로 인식하기 위해 적어줌 (메타문자)
		//arrStr1 = str1.split("0"); ->0앞에서 나눠줘
		for (int i = 0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}
	}

}
