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
 * Display of weather statistics
 */
public  class  StatisticsDisplay extends Observer implements  DisplayElement  {

	/**
	 * Constructor with weather data which  calls super Constructor
	 * 
	 * @param weatherData
	 *            the weather data for initialization
	 * 
	 * @precondition weatherData != null
	 * @postcondition this will be registered as an observer to Subject
	 */
	public StatisticsDisplay(WeatherData weatherData) {
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

	@ Override
	public void update(Subject subject){
		if (subject instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)subject;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			display();
		}

		
	}

	/**
	 * Displays the data
	 */
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
}
