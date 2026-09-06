package Palidrome;

public class CountPalidrome9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr	="hyy a my name level level subrahmanya".split(" ");
	int count=0;
		for (int i = 0; i < strarr.length; i++) {
			if(CheckPalidrome1.isPalidrome(strarr[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

}
