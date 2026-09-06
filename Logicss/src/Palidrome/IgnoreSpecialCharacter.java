package Palidrome;

public class IgnoreSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (CheckPalidrome1.isPalidrome("lev!@#$@el!".replaceAll("[^a-bAA-Z0-9]", ""))) {
			System.err.println("it is palidrome");
		} else {
			System.out.println("Not a palidrome");
		}

	}

}
