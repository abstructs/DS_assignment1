package task2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedSequence<String> L = new LinkedSequence<String>();
		L.addAfter("2");
		L.addAfter("3");
		L.addAfter("4");
		LinkedSequence<String> L2 = new LinkedSequence<String>();
		
		L2.addAfter("5");
		L2.addAfter("6");
		L2.addAfter("7");
		
		L.addAll(L2);
		
		System.out.println("Original List L: " + L.toString());
	}

}
