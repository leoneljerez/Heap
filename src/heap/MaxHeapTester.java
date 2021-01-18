package heap;

public class MaxHeapTester {
	 public void runTests(){
		 MaxHeap<String> heap = new MaxHeap<String>();
		 heap.addElement("John");
		 heap.addElement("Paul");
		 heap.addElement("George");
		 heap.addElement("Ringo");
		 heap.addElement("Elmer");
		 heap.addElement("Zorro");
		 System.out.println(heap);
		 heap.removeMax();
		 System.out.println(heap);
	 }

	public static void main(String[] args) {
		MaxHeapTester mht = new MaxHeapTester();
		mht.runTests();

	}

}
