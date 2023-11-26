package Elevator;

public class Simulator {

	private static Elevator[] elevate;
	private static BooleanSource booleanSource;
	private static int requests;
	private static int totalWait;
	private static int time;
	private static boolean debug = true;

	public static void simulate(double probablity, int numberoffloors, 
									int numberofelevators, int length)
			throws IllegalArgumentException, SimulationException, EmptyQueueException {

		booleanSource = new BooleanSource(probablity);
		elevate = new Elevator[numberofelevators];

		// Iterate the loop
		int k = 0;
		while (k < numberofelevators) {
			elevate[k] = new Elevator();
			k++;
		}

		time = 0;

		RequestQueue queueOfRequests = new RequestQueue();

		while (time < length) {

			if (booleanSource.reqArrived()) {

				Request newRequest = new Request(numberoffloors);

				newRequest.setTime(time);
				
				queueOfRequests.enqueue(newRequest);

				if (debug) {

					System.out.println("A request arrives from Floor " + 
							newRequest.getSource() + " to Floor " + 
							newRequest.getDestination());
				}
			}

			// check queueOfRequests is empty or not
			if (!queueOfRequests.isEmpty())
			{
				int i = 0;
				
				while (i < elevate.length) {
					
					if (elevate[i].getElevatorState() == Elevator.IDLE) {
						if (!queueOfRequests.isEmpty()) {

							if (debug)
							{
								System.out.println("Elevator " + (i + 1) + " took a request");
							}

							elevate[i].setRequest(queueOfRequests.dequeue());
							elevate[i].setElevatorState(Elevator.TOWARDS_SOURCE);
						}
					}

					i++;
				}
			}

			int j = 0;

			while (j < elevate.length)
			{
				if (elevate[j].getElevatorState() == Elevator.TOWARDS_SOURCE)
				{
					towardsSourceFloor(j);
				} else if (elevate[j].getElevatorState() == Elevator.TOWARDS_DESTINATION) {
					towardsDestinationFloor(j);
				}

				j++;
			}

			time = time + 1;
		}

		// check requests is not equal to 0
		if (requests != 0) {

			// Declare averageWait as type of double
			double averageWait = (int) (((double) totalWait / (double) requests * 100));

			// Display statement
			System.out.println("Total Wait Time:" + totalWait);
			System.out.println("Total requests:" + requests);
			System.out.println("Averave Wait Time:" + (averageWait / 100));
			
		} 
		else {
			// Declare avgWait as a type of string and assign "Infinite".
			String averageWait = "Infinite";

			// Display statement
			System.out.println("Total Wait Time:" + totalWait);
			System.out.println("Total requests:" + requests);
			System.out.println("Averave Wait Time:" + averageWait);
		}	
	}

	// Implementation of towardsDestinationFloor method
	public static void towardsDestinationFloor(int i) {

		if (elevate[i].getCurrentFloor() < elevate[i].getRequest().getDestination()) {

			elevate[i].setCurrentFloor(elevate[i].getCurrentFloor() + 1);

			if (debug)
			{
				System.out.println("Elevator " + (i + 1) + " going up to " + elevate[i].getCurrentFloor());
			}
		}

		if (elevate[i].getCurrentFloor() > elevate[i].getRequest().getDestination())
		{
			// call setCurrentFloor method
			elevate[i].setCurrentFloor(elevate[i].getCurrentFloor() - 1);

			if (debug)
			{
				System.out.println("Elevator " + (i + 1) + " going down to " + elevate[i].getCurrentFloor());
			}
		}

		if (elevate[i].getCurrentFloor() == elevate[i].getRequest().getDestination()) {

			elevate[i].setElevatorState(Elevator.IDLE);

			if (debug) {
				System.out.println("Elevator " + (i + 1) + " reached destination");
			}
		}
	}

	// Implementation of towardsSourceFloor method
	public static void towardsSourceFloor(int i) {

		// check elevate[i].getCurrentFloor() is less than the value of
		// elevate[i].getRequest().getSourceFloor()

		if (elevate[i].getCurrentFloor() < elevate[i].getRequest().getSource()) {

			// call setCurrentFloor method
			elevate[i].setCurrentFloor(elevate[i].getCurrentFloor() + 1);

			if (debug) {
				// Display statement
				System.out.println("Elevator " + (i + 1) + " going up to " + elevate[i].getCurrentFloor());
			}
		}

		if (elevate[i].getCurrentFloor() > elevate[i].getRequest().getSource()) {

			// call setCurrentFloor method
			elevate[i].setCurrentFloor(elevate[i].getCurrentFloor() - 1);

			if (debug) {
				// Display statement
				System.out.println("Elevator " + (i + 1) + " going down to " + elevate[i].getCurrentFloor());
			}
		}

		// check elevate[i].getCurrentFloor() is equal to
		// elevate[i].getRequest().getSourceFloor() or not

		if (elevate[i].getCurrentFloor() == elevate[i].getRequest().getSource()) {
			
			elevate[i].setElevatorState(Elevator.TOWARDS_DESTINATION);

			// call setDestinationFloor method
			//elevate[i].setDestinationFloor(elevate[i].getRequest().getDestinationFloor());
			

			// increment requests by 1
			requests = requests + 1;

			// calculate totalWait
			totalWait = totalWait + (time - elevate[i].getRequest().getTime());

			if (debug) {
				// Display statement
				System.out.println("Elevator " + (i + 1) + " reached source");
			}
		}
	}
}