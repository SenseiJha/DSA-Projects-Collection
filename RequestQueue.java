package Elevator;

import java.util.ArrayList;

public class RequestQueue {
	ArrayList<Request> requestList;
	
	public RequestQueue() {
		requestList = new ArrayList<Request>();
	}
	
	public void enqueue(Request req) {
		requestList.add(req);
	}
	
	public Request dequeue() {
		return null;
	}
	
	public int size() {
		return requestList.size();
	}
	
	public boolean isEmpty() {
		if(requestList == null) {
			return true;
		}
		else if(requestList.size() == 0) {
			return true;
		}
		return false;
	}
}
