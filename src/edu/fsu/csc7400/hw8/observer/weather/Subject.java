/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 8
 * 
 * Date: 2017-10-20
 * 
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package edu.fsu.csc7400.hw8.observer.weather;

/**
 * Simple subject/observable class
 */
public interface Subject {
	/**
	 * Registers an observer
	 * 
	 * @param o the new observer
	 * 
	 * @precondition o != null
	 */
	public void registerObserver(Observer o);
	
	/**
	 * Removes a registered observer
	 * 
	 * @param o observer to remove
	 * 
	 * @precondition o != null
	 */
	public void removeObserver(Observer o);
	
	/**
	 * Notifies all registered observers
	 */
	public void notifyObservers();
}
