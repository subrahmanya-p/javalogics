package streaam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 344, 332, 33, 33, 21));
	  Stream<Integer> stream = list.stream();
	  stream.forEach((ele)->System.out.println(ele));
	}
}
