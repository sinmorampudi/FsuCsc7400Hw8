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
 * Simple observer for weather data
 *
 */
public interface Observer {
	
	/**
	 * Updates the temperature, humidity, and pressure of the observer as necessary
	 * 
	 * @param temp current temperature
	 * @param humidity current humidity level
	 * @param pressure current barometric pressure
	 */
	public void update(float temp, float humidity, float pressure);
}
