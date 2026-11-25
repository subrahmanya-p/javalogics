package stack;

import java.util.Stack;

public class NotePad {
	private Stack<String> undo;
	private Stack<String> redo;
	private String currenttext;

	public NotePad() {
		undo = new Stack();
		redo = new Stack();
		currenttext = "Empty";

		System.out.println("You are text in " + currenttext);
	}

	public void inserttext(String typetext) {
		undo.push(currenttext);
		currenttext = typetext;
		redo.clear();
		System.out.println(currenttext);
	}

	public void undo() {
		if (!undo.isEmpty()) {
			redo.push(currenttext);
			currenttext = undo.pop();
			System.out.println(currenttext);
		} else {
			System.out.println("Text something");
		}
	}

	public void redo() {
		if (!redo.isEmpty()) {
			undo.push(currenttext);
			currenttext = redo.pop();
			System.out.println(currenttext);
		} else {
			System.out.println("There are nothing to redo");
		}
	}

	public void currentPageView() {
		System.out.println("The page you are currently in is " + currenttext);
	}

	public void destroyPage() {
		undo.clear();
		redo.clear();
		System.out.println("The file is closed");
	}

	public static void main(String[] args) {
		NotePad h = new NotePad();
		h.inserttext("Aura Farming");
		h.undo();
		h.redo();

		h.inserttext("Coding");
		h.inserttext(" gaming");
		h.redo();
		h.undo();
		h.redo();
		h.undo();
		h.undo();
		h.destroyPage();
	}

}