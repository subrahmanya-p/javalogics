package Palidrome;

public class IgnoreSpace4 {

	public static void main(String[] args) {

		String s = "leve l                         ";
		if (CheckPalidrome1.isPalidrome(s.replaceAll("\\s", ""))) {
			System.err.println("it is palidrome");
		} else {
			System.out.println("Not a palidrome");
		}
	}

}
