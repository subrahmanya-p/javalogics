package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheElement {

	public static void main(String[] args) {
		
		Comparator<Integer> element = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;

			}
		};
		List<Integer> list = new ArrayList<>(Arrays.asList(12,34 , 1, 111, 222, 1222));
		Collections.sort(list, element);
		list.forEach((ele)->{System.out.print(ele +" ");});
	}
}
