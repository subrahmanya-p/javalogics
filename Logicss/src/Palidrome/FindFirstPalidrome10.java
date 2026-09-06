package Palidrome;

//import java.sql.Struct;

public class FindFirstPalidrome10 {

	public static String findFirstPalidrome(String s) {
		String[] strarr = s.split(" ");
		for (int i = 0; i < strarr.length; i++) {
			if (CheckPalidrome1.isPalidrome(strarr[i])) {
				return strarr[i];
			}
		}
//		return "There is no Palidrome word";
		return "";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java a af levfffel  b aff ";
		System.out.println(findFirstPalidrome(str));

	}

}
