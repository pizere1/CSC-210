public interface SequenceADT<T> {
    /**
     * function to return the size of the sequence
     * @return the current count of elements in the sequence or 0 if they're none
     */
    public int size();

    /**
     * Method to add a specified value to the sequence
     * @param value takes the value to add to the sequence
     */
    public void insert(T value);

    /**
     * Fubction to remove the value from the seqeunce
     * @param value takes in the element
     * @return the element after removing it form the sequence
     * throws an exception if that value isn't there
     */
    public T remove(T value);

    /**
     * Function to append a whole sequence to the current sequence
     * @param val takes in the sequence
     * @return s the new ssequences
     * throws an exception if they're of a different type
     */
    public T append(T val);

    /**
     * Function to divide the sequnces into subsequences
     * @param val takes in the value to mark wheer the cut has to happen
     * @return the desired subsequence of the new two or both
     */
    public T split(T val);

}
