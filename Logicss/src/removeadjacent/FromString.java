package removeadjacent;

public class FromString {
	public static void main(String[] args) {

		char[] charr = "asdfghjuytttwedfghjkwdfgbhn".toCharArray();
		for (int i = 0; i < charr.length-1; i++) {
			if (charr[i]!=charr[i+1]) {
				System.out.println(charr[i]);
			}
			
		}
	System.out.println(charr[charr.length-1]);	
	}
}
