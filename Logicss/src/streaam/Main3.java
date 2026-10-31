package streaam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 344, 332, 33, 33, 21));
		int sum = (int) list.stream().reduce(1, (acc, currEle) -> {
			return acc * currEle;
		});
		System.out.println(sum);
	}
}
