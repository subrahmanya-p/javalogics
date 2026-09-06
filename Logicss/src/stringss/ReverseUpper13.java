package stringss;

public class ReverseUpper13 {
//	public static Boolean isLowerCase(char ch) {
//		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//				|| ch == 'O' || ch == 'U';
//	}

	public static String reverseUpper(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				i++;

			} else if (ch[j] >= 'a' && ch[j] <= 'z') {
				j--;

			} else {

				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;

			}

		}
//		System.out.println(ch);
		return new String(ch);
	}

	public static void main(String[] args) {
//		System.out.println("dfghjk");

		System.out.println(reverseUpper("AbCdE"));

		// TODO Auto-generated method stub

	}

}
