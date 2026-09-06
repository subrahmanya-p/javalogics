package stringss;

public class ReverseString1 {
public	static String revrese(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i <= j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;

		}
		return new String(ch);
	}

	public static void main(String[] args) {
		
System.out.println(revrese("levelll"));
	}

}
