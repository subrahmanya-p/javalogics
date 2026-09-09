package arrayy;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] a1 = { 2, 3, 4 };
		int[] a2 = { 7, 1, 3 };
		int[] a12 = new int[a1.length + a2.length];
		System.arraycopy(a1, 0, a12, 0, a1.length);
//		System.arrayopy(Object src,int srcPos,Object dest,int destPos,int length)
				
		System.arraycopy(a2, 0, a12, a1.length, a2.length);
		Arrays.sort(a12);

		System.out.println(Arrays.toString(a12));

	}

}
