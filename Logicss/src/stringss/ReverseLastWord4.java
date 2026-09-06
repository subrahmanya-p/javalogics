package stringss;
//import java.sql.Struct;

public class ReverseLastWord4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hyy my name is Subrahmanya ";
		String[] strarr = s.split(" ");
		for (int i = 0; i < strarr.length-1; i++) {
			System.out.print(strarr[i] + " ");
		}
		System.out.print(ReverseString1.revrese(strarr[strarr.length-1]) + " ");
	}

}
