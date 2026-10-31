package streaam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,2,2,4,26, 344, 332, 33, 33, 21));
	  Stream<Integer> stream = list.stream().filter((ele)->ele%2==0);
	  stream.forEach((ele)->System.out.println(ele));
	}
}
