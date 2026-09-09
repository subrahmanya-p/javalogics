package arrayy;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//merg withou inbuit\

		int[] a1 = { 42, 388, 41 };
		int[] a2 = { 7, 41, 3 };
		int[] temp = new int[a1.length + a2.length];
		int j = 0;
		for (int i : a1) {
			temp[j++] = i;
		}
		for (int i : a2) {
			temp[j++] = i;
		}
		Arrays.sort(temp);

		System.out.println(Arrays.toString(temp));
	}

}
