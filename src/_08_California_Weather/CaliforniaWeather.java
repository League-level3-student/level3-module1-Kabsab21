package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	String citi;
	String condition;
	String lowtemp;
	String hightemp;
	WeatherData datum;
	String cityName;
    HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
     
    void start() {
       
        
        // All city keys have the first letter capitalized of each word
        setup();
       
       
        
       
    }
    
    void setup() {
    	
    	frame.setVisible(true);
    	frame.setTitle("California Weather");
    	frame.add(panel);
    	panel.add(button);
    	panel.add(button1);
    	panel.add(button2);
    	button.addActionListener(this);
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button.setText("Search by City");
    	button1.setText("Search by Conditions");
    	button2.setText("Search by Temperature");
    	frame.pack();
    	
    	
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == button) {
			
			citi =	JOptionPane.showInputDialog(null, "please enter a city."); 
			cityName = Utilities.capitalizeWords( citi );
			datum = weatherData.get(cityName);
			
			 if( datum == null ) {
		            System.out.println("Unable to find weather data for: " + cityName);
		        } else {
		            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
		        }
		}
		
		if(buttonPressed == button1) {
			condition  = JOptionPane.showInputDialog(null, "please enter a Weather Condition.");
			for (WeatherData temp : weatherData.values()) {
				if (condition.equals(temp.weatherSummary)) {
					System.out.println(temp);
				}
			}
		
			
			}
		
		if(buttonPressed == button2) {
			lowtemp =	JOptionPane.showInputDialog(null, "please enter a lowest Temperature.");
			lowtemp =	JOptionPane.showInputDialog(null, "please enter a highest Temperature.");
			}
	}
}
