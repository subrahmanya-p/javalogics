package stringss;

public class ReverseSentence {

	public static void main(String[] args) {
		String string = "I Love Java";
		String[] strArr = string.split(" ");
		for (int i = strArr.length-1; i>=0; i--) {
			
			System.out.print(ReverseString1.revrese(strArr[i])+" ");
		}
		// TODO Auto-generated method stub

	}

}
