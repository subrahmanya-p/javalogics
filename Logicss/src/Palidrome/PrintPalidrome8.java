package Palidrome;

public class PrintPalidrome8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java is aa level code ";
String[] strarr =s.split(" ");
for (int i = 0; i < strarr.length; i++) {
	if(CheckPalidrome1.isPalidrome(strarr[i])) {
		System.out.println(strarr[i]);
	}
}
	}

}
