public class IO {

	private Queue ioQueue;
	private Statistics statistics;

	public IO(Queue ioQueue, Statistics statistics) {
		this.ioQueue = ioQueue;
		this.statistics = statistics;
	}

	public void insert(Object o) {
		ioQueue.insert(o);

	}

	public Process remove() {
		return (Process) ioQueue.removeNext();
	}

}
