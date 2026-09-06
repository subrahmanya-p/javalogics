package stringss;

public class ReverseEven15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is very easy man";
		String[] strarr = s.split(" ");
		for (int i = 0; i <= strarr.length - 1; i++) {
		if (strarr[i].length() % 2 == 0) {
				System.out.print(ReverseString1.revrese(strarr[i]) + " ");
			} else {
				System.out.print(strarr[i] + " ");
			}
		}
	}

}
