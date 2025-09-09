/**
 * An interface for implementing a sequence ot type a*/
public interface SequencesADT<a> {
/**
 * *Add element to sequence**/
public void add(a val);
/**
 * Returns the size of the sequence*/
public int size();
/**
 * Delete an element on a position
 * Throws an exception if it doesn't exist*/
public void delete(a val);
/**
 * Prints the elemnt on the specified index
 * Throws an exception if there's no such index*/
public a get(int index);
    /**
     * Combines 2 sequences
     * Throws exception if there's a missing sequence
     */
public a combine(a val, a valu);
}
