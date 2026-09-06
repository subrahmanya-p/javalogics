package SiddeshSir;

//import jdk.internal.jshell.tool.resources.l10n;//

public class Anagram {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "vaja";
		int arr[] = new int[127];
		for (char c : s1.toCharArray()) {
			System.err.print(c);
			arr[c]++;
		}
		System.out.println();
		for (char c : s2.toCharArray()) {
			System.out.print(c);
			arr[c]--;

		}
		System.out.println();
		for (int i : arr) {
			if(i!=0) {
				System.out.println("Not a Anagram");
				return;
			}
		}
		System.out.println("Yes it is Anagram");
	}

}
