package stringss;

public class ReverseAlphabets12 {
	public static String reverseAlphabets(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (!Character.isLetter(ch[i])) {
				

			i++;
			} else if (!Character.isLetter(ch[j])) {

//				i++;
				j--;

			}
			else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}

		}
		return new String(ch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseAlphabets("1bvb8v2"));

	}

}
