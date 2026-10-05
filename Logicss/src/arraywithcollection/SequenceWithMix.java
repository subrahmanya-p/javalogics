package arraywithcollection;

import java.util.ArrayList;
import java.util.List;

public class SequenceWithMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 6,  7778,7, 8, 9, 12, 34, 55 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		List list = new ArrayList();
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if (i<min) {
				min=i;
				
			}
			list.add(i);
		}
		for (int i = min; i <= max; i++) {
			if (!list.contains(i)) {
				System.out.println(i);

			}

		}
	}

}
