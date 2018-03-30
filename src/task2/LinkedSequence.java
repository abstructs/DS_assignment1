package task2;

import sun.awt.image.ImageWatched;

public class LinkedSequence<T> extends java.lang.Object implements java.lang.Cloneable{
	
	private T value;
	private LinkedSequence<T> next;
	private int size = 0;

    // Add a new element to this sequence, before the current element.
    public void addBefore(T element) {
    	LinkedSequence<T> temp = this.next;
        LinkedSequence<T> nodeToAdd = new LinkedSequence<T>();
        nodeToAdd.value = element;
        nodeToAdd.next = temp;
        this.next = nodeToAdd;
        size+=1;
    }

    //Place the contents of another sequence 
    //at the end of this sequence.
    
    public void addAll(LinkedSequence<T> seq) throws java.lang.NullPointerException {
    	
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
    
    public void addAfter(T element) {
    	LinkedSequence<T> nodeToAdd = new LinkedSequence<T>();
    	LinkedSequence<T> temp = this;
        nodeToAdd.value = element;

    	while(temp.next != null) {
    	    temp = temp.next;
        }

        temp.next = nodeToAdd;
    	size+=1; 
    }

    //Move forward, so that the current element 
    //is now the next element in this sequence.
    
    public void advance() throws java.lang.IllegalStateException{
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	this.value = this.next.value;
    }

     //Generate a copy of this sequence.
    public T clone() { //4

    	T a = null;
    	return a;
    }

    // Create a new sequence that contains all the elements from one sequence followed by another.
    public static LinkedSequence concatenation(LinkedSequence s1, LinkedSequence s2) {
    	LinkedSequence temp = s1;
    	
    	while (temp.next != null) //add all from s1 to node
    	{
    		temp = temp.next;
		}

		temp.next = s2.next;
    	
    	return s1;
    }

    // Accessory method to get the current element of this sequence.
    
    public T getCurrent() throws java.lang.IllegalStateException {
    	
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	
    	return this.value;
    }

    /* Accessory method to determine whether this sequence has a specified current element that can be retrieved with
       the getCurrent method. */
    public boolean isCurrent() { //2
        return this.value != null;
    }

    // Remove the current element from this sequence.
    public void removeCurrent() throws java.lang.IllegalStateException{
    	
    	if(!isCurrent()) {
    		throw new java.lang.IllegalStateException("there is no current element, so advance may not be called");
    	}
    	
    	this.value = null;
    }

    // Determine the number of elements in this sequence.
    public int size() {
    	return this.size;
    }

    // Set the current element at the front of this sequence.
    
    public void start() { //1
    	
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


