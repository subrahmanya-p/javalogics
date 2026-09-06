package stringss;

public class ReverseLower14 {
//	public static Boolean isLowerCase(char ch) {
//		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//				|| ch == 'O' || ch == 'U';
//	}

	public static String reverseLower(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				i++;

			} else if (ch[j] >= 'A' && ch[j] <= 'Z') {
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
		
		System.out.println(reverseLower("AbCdE"));
		
		// TODO Auto-generated method stub

	}

}
