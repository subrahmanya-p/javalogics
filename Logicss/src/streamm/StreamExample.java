package streamm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample {
	public static void main(String[] args) {
//		List<Integer> nums = List.of(10, 20, 10, 30, 20, 40, 30);
//		List<Integer> list = nums.stream().filter(num -> num % 10 == 0).toList();
//		list.forEach(num -> {
//			System.out.println(num);
//		});
		List.of(10, 20, 10, 30, 20, 40, 30).stream().distinct().forEach(System.out::println);
//		List<String> names = List.of("subbu", "rahul", "kiran", "arun");
//		names.stream().map(value -> value.toUpperCase()).forEach(System.out::println);

		List<Integer> nums = List.of(10, 50, 30, 90, 70, 90, 80);
		Optional<Integer> first = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(first);

	}
}
