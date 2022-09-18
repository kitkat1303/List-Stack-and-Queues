/**
 *  Driver for ArrayList(ObjectList), Stack and Queue
 *  
 * @author Katarina McGaughy 
 * @version (ArrayBasedDataStructures HW#3)
 * 
 */

public class ArrayBasedDataStructuresDriver {

	public static void main(String[] args) {
	
		arrayListTests();
		System.out.println("End of arraylist test.");
		System.out.println();
		stackTests();
		System.out.println("End of stack test.");
		System.out.println();
		queueTests();
		System.out.println("End of queue test.");
		System.out.println();

	}

	/**
	 * arrayListTests
	 * this function performs various tests on all methods within the ArrayList class
	 */
	private static void arrayListTests() {
		System.out.println("Testing arraylist.");
		
		ArrayList a = new ArrayList();
		
		a.insert('B', 0);
		a.insert('a',0);
		a.insert('t',1);
		
		Test("a.size() == 3", a.size() == 3);
		Test("a.isEmpty() == false", a.isEmpty() == false);
		Test("a.equals(a) == true", a.equals(a) == true);
		Test("a.indexOf('B'", a.indexOf('B') == 2);
		Test("a.get(1).equals('t')", a.get(1).equals('t'));
		
		System.out.println("Printing a.toString()");
		System.out.println(a.toString());
		
		while(a.isEmpty() == false) {
			System.out.println(a.remove(0));
		}
		Test("a.size() == 0", a.size() == 0);
		
	}

	/**
	 * queueTests
	 * this function performs various tests on all methods within the Queue class
	 */
	private static void queueTests() {
		System.out.println("Testing queue.");
		Queue a = new Queue();
		Queue b = new Queue();
		
		
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');
		
		b.enqueue('K');
		b.enqueue('A');
		b.enqueue('T');
		
		Test("b.dequeue().equals('K')", b.dequeue().equals('K'));
		Test("b.size() == 2", b.size() == 2);
		Test("a.size() == 3", a.size() == 3);
		Test("a.isEmpty() == false", a.isEmpty() == false);
		Test("a.equals(b) == false", a.equals(b) == false);
		
		System.out.println("Printing b.toString().");
		System.out.println(b.toString());
		
		System.out.println("Printing a.toString().");
		System.out.println(a.toString());
		
		while(a.isEmpty() == false) {
			System.out.println(a.dequeue());
		}
		
		Test("a.size() == 0", a.size() == 0);

	}

	/**
	 * stackTests 
	 * this function performs various tests on all methods within the Stack class
	 */
	private static void stackTests() {
		
		System.out.println("Testing stack.");
		Stack a = new Stack();
		
		a.push('B');
		a.push('a');
		a.push('t');
		
		Stack b = new Stack();
		
		for (int i = 0; i<100; i++) {
			b.push('M');
		}
		
		Test("b.size() == 100", b.size() == 100);
		
		Test("a.size() == 3", a.size() == 3);
		
		Test("a.isEmpty == false", a.isEmpty() == false);
		
		Test("a.equals(b) == false", a.equals(b) == false);
		
		Test("a.equals(a) == true", a.equals(a) == true);
		
		System.out.println(a.toString());
		
		while(a.isEmpty() == false) {
			System.out.println(a.pop());
		}
		Test("a.size() == 0", a.size() == 0);
	}
	
	 /**
     * Test
     * ----
     * This is just a function to make testing things easier.
     * @param testDescription : A string representing what you're going to test
     * @param testPasses: the test itself. When you call this method, 
     *                    you'll put some expression here that will evaluate
     *                    to true if your test passes.
     * PRE: none
     * POST: will print to the console the testDescription and either
     *       "Test PASSED" or "Test FAILED", depending on whether the test
     *       passed or failed.
     */
    public static void Test(String testDescription, boolean testPasses){
        if (testPasses) 
            System.out.println("Test PASSED: " + testDescription);
        else 
            System.out.println("Test FAILED: " + testDescription);
    }
	

}
