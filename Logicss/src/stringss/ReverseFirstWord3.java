package stringss;
//import java.sql.Struct;

public class ReverseFirstWord3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hyy my name is Subrahmanya ";
		String[] strarr = s.split(" ");
		System.out.print(ReverseString1.revrese(strarr[0]) + " ");
		for (int i = 1; i < strarr.length; i++) {
			System.out.print(strarr[i] + " ");
		}
	}

}
