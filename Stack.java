/*
 * This class represents a stack list 
 */
public class Stack {

	//stack is an ArrayList that represents a stack list
	private ArrayList stack = new ArrayList();
	
	/**
	 * push this function adds an object to the top of the Stack
	 * 
	 * @param o: Object to be added PRE: none POST: Stack with Object o added to it
	 */
	public void push(Object o) {
		this.stack.insert(o, this.stack.getCount());
	}

	/**
	 * pop this function removes an object from the top of the stack and returns
	 * that object PRE: none POST: Stack without last object added
	 */
	public Object pop() {
		return this.stack.remove(this.stack.getCount()-1);
	}

	/**
	 * size
	 * 
	 * @return : number of elements in Stack
	 */
	public int size() {
		return this.stack.getCount();
	}

	/**
	 * toString
	 * 
	 * @return: String representation of elements in the Stack
	 */
	public String toString() {
		String string = "";
		for (int i = 0; i < this.stack.getCount(); i++) {
			string = " [" + (this.stack.get(i) == null ? "null" : this.stack.get(i)) + "] " + string;
		}
		return string;

	}

	/**
	 * isEmpty
	 * 
	 * @return: true if Stack is empty
	 */
	public boolean isEmpty() {
		return this.stack.getCount() == 0;
	}

	/**
	 * equals this function compares two Stacks
	 * 
	 * @return : true if they are the same and false if not
	 */
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}

		Stack that = (Stack) other;

		if (this.stack.getCount() != that.stack.getCount()) {
			return false;
		}
		for (int i = 0; i < this.stack.getCount(); i++) {

			if (!(this.stack.get(i).equals(that.stack.get(i)))) {
				return false;
			}
		}

		return true;

	}
}
