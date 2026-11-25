package stack;

public class QueuedData {
	int[] queue;
	int toq;
	int boq;

	public QueuedData(int size) {
		queue = new int[size];
		boq = toq = -1;
	}

	public boolean isFull() {
		return toq == queue.length - 1;
	}

	public boolean isEmpty() {
		return boq == queue.length - 1 || toq == -1;
	}

	public void equeue(int value) {
		if (isFull()) {
			System.out.println("the Queue is Full");

		} else if (boq == -1) {
			boq++;
			queue[++toq] = value;

		} else {
			queue[++toq] = value;
			System.out.println("the value  is Inserted  :" + value);

		}

	}

	public void deque() {
		if (isEmpty()) {
			System.out.println("the Queue is Empty!");

		} else {
			int value = queue[boq++];
			System.out.println("the value is :" + value);

		}
		if (boq > toq) {
			boq = toq = -1;
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("The Queue is Empty!");

		} else {
			System.out.println("The  value is :" + queue[boq++]);

		}
	}

	public void clear() {
		queue = null;
		System.out.println("The Queue is Cleared !");
	}

	public static void main(String[] args) {
		QueuedData queue = new QueuedData(5);
		System.out.println("Is the queue is Empty : " + queue.isEmpty());
		System.out.println("Is the queue is Full : " + queue.isFull());
		queue.equeue(130);
		queue.equeue(10);
		queue.equeue(199);
		queue.equeue(197);
		queue.equeue(109);
		queue.equeue(1999);
		queue.deque();
		queue.deque();
		queue.peek();
		queue.clear();
	}

}
