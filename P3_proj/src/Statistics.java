/**
 * This class contains a lot of public variables that can be updated by other
 * classes during a simulation, to collect information about the run.
 */
public class Statistics {
	/** The number of processes that have exited the system */
	public long nofCompletedProcesses = 0;
	/** The number of processes that have entered the system */
	public long nofCreatedProcesses = 0;
	/**
	 * The total time that all completed processes have spent waiting for memory
	 */
	public long totalTimeSpentWaitingForMemory = 0;
	/**
	 * The time-weighted length of the memory queue, divide this number by the
	 * total time to get average queue length
	 */
	public long memoryQueueLengthTime = 0;
	/** The largest memory queue length that has occured */
	public long memoryQueueLargestLength = 0;

	public long nofForcedProcessSwitches = 0;
	public long nofIOoperations = 0;

	public long timeCPUspentProcessing = 0;
	public long timeCPUspentWaiting = 0;

	//Disse er ferdige
	public long biggestIOque = 0;
	public long biggestCPUque = 0;

	public long placedInMemque = 0;
	public long placedinCPUque = 0;
	public long placedinIOque = 0;

	public long timeSpentInSystem = 0;

	public long timeWaitingInCpuQue = 0;
	public long timeWaitingInMemQue = 0;
	public long timeWaitingInIOQue = 0;

	public long timeSpentDoingIO = 0;

	/**
	 * Prints out a report summarizing all collected data about the simulation.
	 * 
	 * @param simulationLength
	 *            The number of milliseconds that the simulation covered.
	 */
	public void printReport(long simulationLength) {
		System.out.println();
		System.out.println("Simulation statistics:");
		System.out.println();
		System.out
				.println("Number of completed processes:                                "
						+ nofCompletedProcesses);
		System.out
				.println("Number of created processes:                                  "
						+ nofCreatedProcesses);
		System.out.println();
		System.out
				.println("Largest occuring memory queue length:                         "
						+ memoryQueueLargestLength);
		System.out
				.println("Largest occuring IO queue length:                                     "
						+ biggestIOque);
		System.out
				.println("Largest occuring CPU queue length:                                    "
						+ biggestCPUque);
		System.out
				.println("Average memory queue length:                                  "
						+ (float) memoryQueueLengthTime / simulationLength);
		if (nofCompletedProcesses > 0) {
			System.out
					.println("Average # of times a process has been placed in memory queue: " + 1);
			System.out
					.println("Average time spent waiting for memory per process:            "
							+ totalTimeSpentWaitingForMemory
							/ nofCompletedProcesses + " ms");
		}
	}
}
