package Palidrome;

public class IgnoreCase3 {

	public static void main(String[] args) {

		String s = "leveL";
		if (CheckPalidrome1.isPalidrome(s.toLowerCase())) {
			System.err.println("it is palidrome");
		} else {
			System.out.println("Not a palidrome");
		}
	}

}
