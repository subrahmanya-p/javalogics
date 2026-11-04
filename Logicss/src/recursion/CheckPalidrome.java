package recursion;

public class CheckPalidrome {
	public static boolean isPalidrome(String s, int left, int right) {
		if (left >= right) {

			return true;
		}
		if (s.charAt(left) != s.charAt(right)) {
			return false;
		}
		return isPalidrome(s, left + 1, right - 1);

	}

	public static void main(String[] args) {
		if (isPalidrome("level", 0, 4)) {
			System.out.println("it is palidrome ");

		} else {
			System.out.print("It is Not a paliDrome ");
		}
	}

}
