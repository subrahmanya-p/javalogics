package stack;

public class Stack_Operation {
	int[] stack;
	int top;

	public Stack_Operation(int size) {
		stack = new int[size];
		top = -1;

	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == stack.length - 1;

	}

	public void push(int v) {
		if (isFull()) {
			System.out.println("Stack is Full!");
		} else {
			stack[++top] = v;
			System.out.println("The Value " + v + "is Inserted !");

		}

	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty!");
		} else {
			System.out.println("the Value : " + stack[top] + "Removed from  the Stack !");
			top--;
		}

	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("The Stack is Empty!");
		} else {
			System.out.println("the Value is  : " + stack[top]);

		}

	}

	public void delete() {
		stack = null;
		System.out.println("The Stack has been deleted  ! ");
	}

	public static void main(String[] args) {
		Stack_Operation stack = new Stack_Operation(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		stack.peek();
		stack.pop();
		stack.peek();
		stack.delete();
		System.out.println(stack.isEmpty());
		

	}
}
