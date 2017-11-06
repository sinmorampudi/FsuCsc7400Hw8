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

import java.util.*;

/**
 * WeatherData collects readings from sensors and then broadcasts the values to observers
 *
 */
public class WeatherData extends Subject {
	
	/**
	 * Default constructor
	 */
	public WeatherData() {
		
	}
	
	
	/**
	 * Does whatever it needs to do when a sensor sends a change
	 */
	public void measurementsChanged() {
		notifyObservers();
	}
	
	/**
	 * Sets the weather values from the sensors.
	 * 
	 * @param temperature current temperature
	 * @param humidity current humidity level
	 * @param pressure current barometric pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/**
	 * Returns the current temperature
	 */
	public float getTemperature() {
		return temperature;
	}
	
	/**
	 * Returns the current humidity level
	 */
	public float getHumidity() {
		return humidity;
	}
	
	/**
	 * Returns the current barometric pressure
	 */
	public float getPressure() {
		return pressure;
	}

	private float temperature;
	private float humidity;
	private float pressure;
}
