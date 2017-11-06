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
 * Forecast display
 */
public class ForecastDisplay extends Observer implements  DisplayElement {
	
	/**
	 * Constructor with weather data which  calls super Constructor
	 * 
	 * @param weatherData
	 *            the weather data for initialization
	 * 
	 * @precondition weatherData != null
	 * @postcondition this will be registered as an observer to Subject
	 */
	public ForecastDisplay(WeatherData weatherData) {
		super(weatherData);
	}

	/**
	 * Updates the display with new data
	 * 
	 * @param temp
	 *            current temperature
	 * @param humidity
	 *            current humidity level
	 * @param pressure
	 *            current barometric pressure
	 */
	
	public void update(Subject subject)
	{
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)subject;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	/**
	 * Displays the data
	 */
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	private float currentPressure = 29.92f;  
	private float lastPressure;

}
