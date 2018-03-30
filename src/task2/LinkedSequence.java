package task2;

public class LinkedSequence<T> extends java.lang.Object implements java.lang.Cloneable{
	
	private T value;
	private LinkedSequence<T> next;
	private int size =0;

    // Add a new element to this sequence, after the current element.
    void addAfter(T element) {
    	
    	LinkedSequence<T> node = new LinkedSequence<T>();
    	node.value = element; //create the node and add the element
    	node.next = this.next;
    	this.next = node; //here is where we add after the current element.
    	this.value = node.value;// also take the value 
    	size+=1; 
    	
    }

    //Place the contents of another sequence 
    //at the end of this sequence.
    
    void addAll(LinkedSequence<T> seq) throws java.lang.NullPointerException {
    	
    	if(seq == null) {
    		throw new java.lang.NullPointerException("the sequence provided is null ");

    	}
    	
    	while(seq.next != null) {
    		this.addAfter(seq.next.value);
    		seq = seq.next;
    	}
    	
    }

    // Add a new element to this sequence, 
    //before the current element.
    
    void addBefore(T element) {
    	
    	LinkedSequence<T> node = new LinkedSequence<T>();
  
    	node.value = this.value; //create the node and add the element
    	
    	this.next.value = element;
    	
    	this.addAfter(node.value); //here is where we add after the current element.
    	size+=1; 
    }

    //Move forward, so that the current element 
    //is now the next element in this sequence.
    
    void advance() throws java.lang.IllegalStateException{
    	
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	this.value = this.next.value;
    }

     //Generate a copy of this sequence.
    public T clone() {
    	
    	T a = null;
    	return a;
    }

//    // Create a new sequence that contains all the elements from one sequence followed by another.
//    LinkedSequence<T> concatenaton(LinkedSequence<T> s1, LinkedSequence<T> s2)
//    {
//    	
//    }

    // Accessory method to get the current element of this sequence.
    
    T getCurrent() throws java.lang.IllegalStateException {
    	
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	
    	return this.value;
    }

    /* Accessory method to determine whether this sequence has a specified current element that can be retrieved with
       the getCurrent method. */
    boolean isCurrent() {
    	
    	if (getCurrent()== null) {
    		return false;
    	}
    	
    	return true;
    }

    // Remove the current element from this sequence.
    void removeCurrent() throws java.lang.IllegalStateException{
    	
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	
    	this.value = null;
    }

    // Determine the number of elements in this sequence.
    int size() {
    	return this.size;
    }

    // Set the current element at the front of this sequence.
    void start() {
    	
    	while(this.next != null) {
    		
    		System.out.println(this.next);
    		System.out.println(this.next.next);
    		this.next.next = this.next; 
    	}
    }
    
    public String toString() {
		LinkedSequence<T> a = next;
		String s = "[";
		while (a != null) {
			s = s + a.value.toString() + " ";
			a = a.next;
		}
		return s + "]";
	}

}


