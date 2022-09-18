/*
 * This class represents a queue list 
 */
public class Queue {
	
	//queue is an ArrayList that represents a queue list
	private ArrayList queue = new ArrayList();
	
	/**
	 * enqueue this function adds an Object to the queue
	 * 
	 * @param o: Object to be added
	 */
	public void enqueue(Object o) {
		this.queue.insert(o, this.queue.getCount());
	}

	/**
	 * dequeue this function removes an Object from the queue and returns it
	 * 
	 * @return: Object that was removed
	 */
	public Object dequeue() {
		if (this.queue.getCount() == 0) {
			throw new RuntimeException("no more elements in the queue");
		}
		return this.queue.remove(0);
	}

	/**
	 * size
	 * 
	 * @return : number of elements in queue
	 */
	public int size() {
		return this.queue.getCount();
	}

	/**
	 * toString
	 * 
	 * @return: String representation of elements in the queue
	 */
	public String toString() {
		return this.queue.toString();
	}

	/**
	 * isEmpty
	 * 
	 * @return: true if Stack is empty
	 */
	public boolean isEmpty() {
		return this.queue.getCount() == 0;
	}

	/**
	 * equals 
	 * this function compares two Queues
	 * 
	 * @return : true if they are the same and false if not
	 */
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}

		Queue that = (Queue) other;

		if (this.queue.getCount() != that.queue.getCount()) {
			return false;
		}
		for (int i = 0; i < this.queue.getCount(); i++) {
			if (!(this.queue.get(i).equals(that.queue.get(i)))) {
				return false;
			}
		}
		return true;
	}
}