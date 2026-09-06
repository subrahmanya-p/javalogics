package stringss;

public class ReverseEachWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="Hyy My name is Subrahmanyaa";
String [] strarr= s.split(" ");
for (int i = 0; i < strarr.length; i++) {
	System.out.print(ReverseString1.revrese(strarr[i])+" ");
}
	}

}
