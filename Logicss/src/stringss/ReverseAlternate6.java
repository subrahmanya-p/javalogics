package stringss;

public class ReverseAlternate6 {

	public static void main(String[] args) {

		String s = "hyy my name is subrahmanyaa";
		String[] strarr = s.split(" ");
		for (int i = 0; i < strarr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(ReverseString1.revrese(strarr[i]) + " ");
			} else {

				System.out.print(strarr[i] + " ");
			}
		}
	}

}
