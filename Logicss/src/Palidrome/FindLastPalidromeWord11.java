package Palidrome;

//import java.sql.Struct;

public class FindLastPalidromeWord11 {

	public static String findFirstPalidrome(String s) {
		String[] strarr = s.split(" ");
		for (int i = strarr.length-1; i >=0; i--) {
			if (CheckPalidrome1.isPalidrome(strarr[i])) {
				return strarr[i];
			}
		}
//		return "There is no Palidrome word";
		return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java level  af levfffel aff  a ";
		System.out.println(findFirstPalidrome(str));

	} 

}
