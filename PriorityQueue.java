/**
 * Maria Jose Castro Lemus 
 * 181202
 * Estructura de datos
 * Lab 8
 */

/**
 * @author Majo!
 * Clase extraida del libro Java Structures 
 */
public interface PriorityQueue<E extends Comparable<E>>{
	/**
	 * @return The first of the tale
	 */
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	/**
	 * @return Removes from the tale
	 */
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	/**
	 * @return its a void
	 * @param value
	 */
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	/**
	 * @return True or false 
	 */
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	/**
	 * @return The num of the size 
	 */
	public int size();
	// post: returns number of elements within queue
	
	/**
	 * Clears the tale
	 */
	public void clear();
	// post: removes all elements from queue

}
