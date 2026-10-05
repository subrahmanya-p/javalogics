package arraywithcollection;

public class printMissigElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
		int n = arr[arr.length - 1];
		int res = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int missingEle = res - sum;
		System.out.println(missingEle);
	}

}
