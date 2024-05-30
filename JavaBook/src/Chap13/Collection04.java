package Chap13;

import java.util.HashSet;

public class Collection04 {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();

		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);

		System.out.print("HashSet 요소: ");
		for (String elements : str) //elements 배열에 str의 값을 하나씩 넣어서 보겠다
			System.out.print(elements + " ");

		String[] array = new String[str.size()];
		str.toArray(array); //자료를 간단하게 옮기기 위한 수단

		System.out.println();
		System.out.print("Array 요소: ");
		for (int i = 0; i < array.length; i++) //인덱스를 부여해서 돌아가게끔 배열을 부여함
			System.out.print(array[i] + " ");

	}

}
