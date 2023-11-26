package Elevator;

public class Request {
	private int source;
	private int destination;
	private int time;
	
	public Request(int numOfFloors) {
		int a = 1;
		int b = numOfFloors;
		
		source = (int) (a + Math.random() * b);
		destination = (int) (a + Math.random() * b);
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getDestination() {
		return destination;
	}

	public int getTime() {
		return time;
	}
}
