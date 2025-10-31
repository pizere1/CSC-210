/**creating array interface
 * Creates an array with ability to store and write elements**/
public interface IndexAccessADT<T>{
    /**
     * A class extending this interfaces
     * Class A extends IndexAccessADT<T>
     * A( int n_elements)
     */

    /**
     * The method to return the size of the array
     * @return the number of elemennts in the array
     */
    public int size ();

    /**
     * Function to display the elements at the specified index
     * @param index takes in the index whose element we want to know
     * @return the element on the specified index
     * Throws an exception if the index is less than 0 or greater than the size of the arrau
     */
    public T get(int index);

    /**
     * Function to update the value stored on the specified index
     * @param index takes in the index whose value is to  be upadted
     * @param value takes in the new value to store on the specified  index
     * Throws an exception if that index is out of the bounds of our array
     */
    public void set(int index, T value);

    /**
     * Function to store the same values in the array
     * @param value takes in the value to store in the array
     */
    public void fill(T value);

    /**
     * Function to verify the index of a given value
     * @param value takes in the value whose value we should check
     * @return the index on which it is stored
     * throws an exception if there's no such element
     */
    public int indexOf(T value);

    /**
     * Function ot verify if a certain value is stored in the array
     * @param value take sin the value to verify
     * @return true if the value is in our array or false if it's not
     */
    public boolean contains(T value);
    /*
    To test out these methods, we make a dummy array to use in testing our methods
    T val[] new_array=new IndexAccessTest(10);
    Class IndexAccessTest{
        @Test
        IndexAcessTest(10);
        AssertEquals(10, new_array.size());

        The test below verifies the get function
        @Test
        AssertThrows(IndexOutofBoundsException.class-->(new_array.get(15))
         */

}
