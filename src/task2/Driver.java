package task2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedSequence<String> L1 = new LinkedSequence<String>();
//		System.out.println("Original List L: " + L.getCurrent());
		L1.addAfter("2");
		L1.addAfter("3");
//		L1.addAfter("4");

		LinkedSequence<String> L2 = new LinkedSequence<String>();

		L2.addAfter("5");
		L2.addAfter("6");
		L2.addAfter("7");
        L2.addBefore("4");

//		L.start();
		
		System.out.println("Original List L1: " + L1.toString());
        System.out.println("Original List L2: " + L2.toString());

        System.out.println(LinkedSequence.concatenation(L1, L2));

	}

}
