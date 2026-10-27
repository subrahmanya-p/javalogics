package dsaaa;

import java.util.Stack;

public class ValidBraces {
	public static boolean isBraces(String str) {

		if (str.length() % 2 != 0) {
			return false;

		}
		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);

			} else if (stack.isEmpty()) {
				return false;
			} else {
				char lastchar = stack.pop();
				if ((ch == ')' && lastchar != '(') || (ch == ']' && lastchar != '[')
						|| (ch == '}' && lastchar != '{')) {
					return false;

				}
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		System.out.println(isBraces("{}"));

	}

}
