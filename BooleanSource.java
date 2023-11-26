package Elevator;

public class BooleanSource {
	private double probability;
	
	public BooleanSource(double prob) {
		if(prob  < 0.0 || prob > 1.0) {
			throw new IllegalArgumentException("Invalid Probability");
		}
		probability = prob;
	}
	
	public boolean reqArrived() {
		boolean flag = false;
		
		if(Math.random() <= probability) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
}
