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
 * Display for current conditions
 *
 */
public class CurrentConditionsDisplay extends Observer implements  DisplayElement {

	/**
	 * Constructor with weather data which  calls super Constructor
	 * 
	 * @param weatherData
	 *            the weather data for initialization
	 * 
	 * @precondition weatherData != null
	 * @postcondition this will be registered as an observer to Subject
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		
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
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	public void update(Subject subject)
	{
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)subject;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	/**
	 * Displays the data
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	private float temperature;
	private float humidity;
}
