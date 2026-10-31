package streaam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,8,9,9,10));
		List<Integer> data = list.stream().map((ele) -> ele *2).collect(Collectors.toList());
		data.forEach((element) -> {
			System.out.println(element);
		});
	}
}
