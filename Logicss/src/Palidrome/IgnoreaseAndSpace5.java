package Palidrome;

public class IgnoreaseAndSpace5 {
	public static void main(String[] args) {
		if (CheckPalidrome1.isPalidrome("leve                           L".replaceAll("\\s", "").toLowerCase())) {
			System.out.println("It is palidrome");
		} else {
			System.out.println("Not a palidrome");
		}
	}
}
