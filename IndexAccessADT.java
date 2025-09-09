/**creating array interface
 * Creates an array with ability to store and write elements**/
interface IndexAccessADT<T>{
    /**Reading n elements of the array
     * Throws an exception if there are no more elements to read
     ***/
    public T read (int n);

    /**Writing the requested n elements of the array*
     * Throws an exception if one tries entering more values than set size
     **/
    public T write();

}