package Palidrome;

//import java.sql.Struct;

public class LongestPalidromeWord12 {
	public static String longestPalidrome(String s) {
		String[] str = s.split(" ");
		String res = "";
		for (int i = 0; i <= str.length-1; i++) {
			if (CheckPalidrome1.isPalidrome(str[i])) {
				if (res.length() < str[i].length()) {
					
					res=str[i];
				}
			}
		
		}
		return res;
//		return "";

	}

	public static void main(String[] args) {
System.out.println(longestPalidrome("level a a java aaaaa"));
	}

}
