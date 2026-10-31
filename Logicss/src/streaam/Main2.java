package streaam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 344, 332, 33, 33, 21));
		List<Integer> data = list.stream().filter((ele) -> ele % 2 == 0).collect(Collectors.toList());
		data.forEach((element) -> {
			System.out.println(element);
		});
	}
}
