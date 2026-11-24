package stack;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.Stack;

public class Web_History {
	private Stack<String> backward_stack;
	private Stack<String> forward_stack;
	private String currentPage;

	public Web_History() {
		backward_stack = new Stack<String>();
		forward_stack = new Stack<String>();
		currentPage = "Home Page";
		System.out.println("You  are in :" + currentPage);
	}

	public void visitPage(String page) {
		backward_stack.push(currentPage);
		currentPage = page;
		System.out.println("You  are in :" + currentPage);
		forward_stack.clear();

	}

	public void goBack() {
		if (!backward_stack.isEmpty()) {
			forward_stack.push(currentPage);
			currentPage = backward_stack.pop();
			System.out.println("You  are in :" + currentPage);

		} else {
			System.out.println("U Reached the Home page!");

		}

	}

	public void goForward() {
		if (!forward_stack.isEmpty()) {
			backward_stack.push(currentPage);
			currentPage = forward_stack.pop();
			System.out.println("You  are in :" + currentPage);

		} else {
			System.out.println("Now new Pages!");

		}

	}

	public void currentPage() {
		System.out.println("You  are in :" + currentPage);
	}

	public void clear() {
		forward_stack.clear();
		backward_stack.clear();
		System.out.println("History Has been deleted !");

	}

	public static void main(String[] args) {
		Web_History history = new Web_History();
		history.visitPage("Amazon");
		history.visitPage("Flipcart");
		history.visitPage("DeadShot ");
		history.goBack();
		history.goForward();
		history.visitPage("gooole");
		history.currentPage();
		history.clear();

	}
}
