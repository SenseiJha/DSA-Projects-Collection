package Elevator;

@SuppressWarnings("serial")
public class EmptyQueueException extends Exception {
	public EmptyQueueException() {
		System.out.println("Queue is Empty");
	}
}
