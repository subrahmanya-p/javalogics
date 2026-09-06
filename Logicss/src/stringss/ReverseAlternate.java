package stringss;

public class ReverseAlternate {
	public static void main(String[] args) {
		String s = "java is very easy man";
		String[] strarr = s.split(" ");
		for (int i = 0; i <= strarr.length - 1; i++) {
			if (i % 2 == 0) {
				System.out.print(ReverseString1.revrese(strarr[i] )+" ");
			} else {
				System.out.print(strarr[i] + " ");
			}
		}
	}

}
