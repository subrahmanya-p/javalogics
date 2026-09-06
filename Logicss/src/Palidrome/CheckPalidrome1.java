package Palidrome;

//import stringss.ReverseString1;

public class CheckPalidrome1 {
	public static boolean isPalidrome(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (ch[i] != ch[j]) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isPalidrome("leveL")) {

			System.out.println("Yess it is Palidrome");
		} else {
			System.out.println("No it is not");
		}
	}

}
