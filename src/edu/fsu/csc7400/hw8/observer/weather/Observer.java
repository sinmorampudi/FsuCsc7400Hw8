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

/**
 * Simple observer for weather data
 *
 */
public abstract class Observer {
	
	
	/**
	 * Constructor with Subject
	 * 
	 * @param Subject
	 *            the data for initialization
	 * 
	 * @precondition weatherData != null which is received in subject 
	 * parameter here
	 * @postcondition this will be registered as an observer to subject
	 */
	public Observer(Subject subject)
	{
		subject.registerObserver(this);
	}
	
	/**
	 * Updates the temperature, humidity, and pressure of the observer as necessary
	 * 
	 * @param Subject Object
	 */
	
	public abstract void update(Subject subject);   
 
	
}
