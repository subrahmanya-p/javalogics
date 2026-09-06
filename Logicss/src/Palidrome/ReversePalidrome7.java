package Palidrome;

import stringss.ReverseString1;

public class ReversePalidrome7 {

	public static void main(String[] args) {
		String s ="Level";
		System.out.println("reverse of the String:"+ReverseString1.revrese(s));
		if (CheckPalidrome1.isPalidrome(s)) {
			System.out.println("Yes it is a Palidrome ");
			
		}
		else {
			System.out.println("No it is not a palidrome");
		}
		// TODO Auto-generated method stub

	}

}
