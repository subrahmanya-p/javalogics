package reverse;

import java.util.Arrays;

public class RevereseTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 5, 6, 4, 3, 4 };
		
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j++] = arr[i];
		}
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		System.out.println("Reverse Array : "+ Arrays.toString(temp));
	

	}

}
