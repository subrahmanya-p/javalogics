package SiddeshSir;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class countchar {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String s = "ccccddddeeee";
		char repeated = s.charAt(0);
		int arr[] = new int[127];

		for (char ch : s.toCharArray()) {
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && (arr[i] > arr[repeated] )) {
				repeated = (char) i;
				
			}

	
	}
		System.out.println(repeated);

}
}