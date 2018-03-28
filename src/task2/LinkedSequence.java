package task2;

public interface LinkedSequence<T> {

    // Add a new element to this sequence, after the current element.
    void addAfter(T element);

    //Place the contents of another sequence at the end of this sequence.
    void addAll(LinkedSequence<T> seq);

    // Add a new element to this sequence, before the current element.
    void addBefore(T element);

    // Move forward, so that the current element is now the next element in this sequence.
    void advance();

    // Generate a copy of this sequence.
    T clone();

    // Create a new sequence that contains all the elements from one sequence followed by another.
    LinkedSequence<T> concatenaton(LinkedSequence<T> s1, LinkedSequence<T> s2);

    // Accessor method to get the current element of this sequence.
    T getCurrent();

    /* Accessor method to determine whether this sequence has a specified current element that can be retrieved with
       the getCurrent method. */
    boolean isCurrent();

    // Remove the current element from this sequence.
    void removeCurrent();

    // Determine the number of elements in this sequence.
    int size();

    // Set the current element at the front of this sequence.
    void start();
}
