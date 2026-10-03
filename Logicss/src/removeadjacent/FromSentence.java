package removeadjacent;

public class FromSentence {
	public static void main(String[] args) {
		String[] strr = "hey my name is subrahmnya hh hh and im a developer hh yy hh hh".split(" ");
		for (int i = 0; i < strr.length - 1; i++) {

			if (strr[i] != strr[i + 1]) {
				System.out.println(strr[i]);
			}

		}
		System.out.println(strr[strr.length - 1]);
	}

}
