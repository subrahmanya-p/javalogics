package SiddeshSir;

public class CountLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Subrahmayaa";
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if(ch>='a'&&ch<='z') {
				arr[ch-97]++;
			}
		}
			

			
		
		for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0) {
			System.out.println((char)(i+97)+"-"+arr[i]);
		}
		}
	}

}
