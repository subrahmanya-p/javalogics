package arraywithcollection;

import java.util.ArrayList;
import java.util.List;

public class MissingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 6, 7, 8, 9, 12, 34, 55 };
		List list = new ArrayList();
		for (int i : arr) {
			list.add(i);
		}
for (int i = arr[0]; i <=arr[arr.length-1]; i++) {
	if ( ! list.contains(i)) {
		System.out.println(i);
		
	}
	
}
	}

}
