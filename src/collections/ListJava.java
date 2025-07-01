package collections;

import java.util.Arrays;
import java.util.List;

public class ListJava {
	public static void main(String[] args) {
		final List<Integer> numbers = Arrays.asList(100, 200);

		// 하나 가져오기
		System.out.println(numbers.get(0));

		// for each
		for (int number : numbers) {
			System.out.println(number);
		}

		// for
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
