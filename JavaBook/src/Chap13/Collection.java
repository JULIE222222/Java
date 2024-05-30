package Chap13;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 10; i >= 1; i--)
			num.add(i);

		System.out.println(num); //값을 가져와서 뿌려줌
		System.out.print("정렬 전: ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		num.sort(Comparator.naturalOrder()); //정렬하는 메서드 방법중 하나

		System.out.println();
		System.out.print("정렬 후: ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");

	}

}
