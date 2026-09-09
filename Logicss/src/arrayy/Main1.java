package arrayy;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 42, 388, 41 };
		int[] a2 = { 7, 41, 3 };
		int[] a3 = { 47, 14, 3 };
		int[] temp = new int[a1.length + a2.length + a3.length];
		System.arraycopy(a1, 0, temp, 0, a1.length);
		System.arraycopy(a2, 0, temp, a1.length, a2.length);
		System.arraycopy(a3, 0, temp, a2.length + a2.length, a3.length);
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));

	}

}
