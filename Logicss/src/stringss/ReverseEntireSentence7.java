package stringss;

public class ReverseEntireSentence7 {
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
		
String s="Hyy My name is Subrahmanya";
String[] strarr=s.split(" ");
for (int i = strarr.length-1; i>=0; i--) {
	System.out.print(revrese(strarr[i])+" ");
	
}
	}

}
