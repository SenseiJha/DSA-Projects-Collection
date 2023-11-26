package Elevator;

public class Elevator {
	public static final int IDLE = 1;
	public static final int TOWARDS_SOURCE = 2;
	public static final int TOWARDS_DESTINATION = 2;
	
	private int currentFloor;
	private int elevatorState;
	private Request request;
	
	public Elevator() {
		request = null;
		elevatorState = IDLE;
		currentFloor = 1;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getElevatorState() {
		return elevatorState;
	}

	public void setElevatorState(int elevatorState) {
		this.elevatorState = elevatorState;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	@Override
	public String toString() {
		String s = "";
		
		s += "[";
		s += "Floor :" + currentFloor +", ";
		s += getElevatorState() + ", ";
		
		if(request == null) {
			s += "---";
		}
		else {
			s += request;
		}
		
		s += "]";
		return s;
	}
}
