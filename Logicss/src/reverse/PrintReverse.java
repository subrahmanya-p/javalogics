package reverse;

public class PrintReverse {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 4, 3, 4 };
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}
}
