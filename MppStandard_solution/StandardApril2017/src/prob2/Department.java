package prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public abstract String getName();
	public void addMessage(String msg)  {
		//to do
		queue.enqueue(msg);
	
	}
	public String nextMessage() throws EmptyQueueException {
		// todo		
			return queue.dequeue();
		
	}
}
