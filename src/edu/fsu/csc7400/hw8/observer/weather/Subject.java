/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 8
 * @author Sindhuja Morampudi,Divya Kasu
 * @version 1.0
 * Date: 2017-10-20
 * 
 * Code taken from HeadFirst Object-Oriented Design Patterns sample
 */
package edu.fsu.csc7400.hw8.observer.weather;

import java.util.ArrayList;

/**
 * Simple subject/observable class
 */
public abstract class Subject {
	
	/**
	 * Default constructor
	 */
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	/**
	 * Registers an observer
	 * 
	 * @param o the new observer
	 * 
	 * @precondition o != null
	 */
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	/**
	 * Removes a registered observer
	 * 
	 * @param o observer to remove
	 * 
	 * @precondition o != null
	 */
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	/**
	 * Notifies all registered observers
	 */
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
	}
	
	private ArrayList<Observer> observers;
}
