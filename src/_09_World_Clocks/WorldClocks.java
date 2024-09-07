package _09_World_Clocks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/*
 * You task is to create a java program that:
 * 1. Displays the time for multiple cities around the world on one display.
 * 2. Gives the user the ability to add a city to the display. One possible
 *    way to do this is to create a HashMap of city names and their
 *    corresponding time zones, e.g. HashMap<String, TimeZone>, then use each
 *    city's TimeZone to get the current date/time every second using a
 *    Timer object (see example code below).
 * 
 * The code below is an example of how to print out a clock for San Diego.
 * Use the ClockUtilities class to find the time zone of each city, then use
 * Calendar.getInstance to return a Calendar object to get the current time for
 * that city. Example:
 *   TimeZone timeZone = clockUtil.getTimeZoneFromCityName("San Diego, US");
 *   Calendar c = Calendar.getInstance(timeZone);
 *   System.out.println("Full date and time: " + calendar.getTime());
 * 
 * NOTE: The program may take a second or two to execute
 * 
 * Calendar class:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 */

public class WorldClocks implements ActionListener {
	ClockUtilities clockUtil;
	Timer timer;
	TimeZone timeZone;
	ArrayList<JTextArea> Textareas = new ArrayList();;
	JFrame frame;
	JPanel panel;
	Hashmap<String, TimeZone> times = new 
	// JTextArea textArea;
	JButton add;
	JButton remove;
	String city;
	String dateStr;
	String timeStr;
	int clocksmade = -1;

	public WorldClocks() {
		clockUtil = new ClockUtilities();

		// The format for the city must be: city, country (all caps)

		newClocks("Chicago, US", clocksmade);

		System.out.println(dateStr);

		// Sample starter program
		frame = new JFrame();
		panel = new JPanel();
		remove = new JButton();
		remove.setText("REMOVE  PLACE");
		remove.addActionListener(this);
		add = new JButton();
		add.addActionListener(this);
		add.setText("ADD PLACE");
		// textArea = new JTextArea();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.add(panel);
		panel.add(add);
		panel.add(remove);
		for (JTextArea in : Textareas) {
			panel.add(in);

		}
		// panel.add(textArea);
		// textArea.setText(city + "\n" + dateStr);
		frame.pack();

		// This Timer object is set to call the actionPerformed() method every
		// 1000 milliseconds
		timer = new Timer(1000, this);
		timer.start();
	}

	void newClocks(String cit, int clocks) {

		clocks = clocks + 1;
		clocksmade = clocksmade + 1;
		city = cit;
		timeZone = clockUtil.getTimeZoneFromCityName(cit);

		Calendar calendar = Calendar.getInstance(timeZone);
		String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
		dateStr = dayOfWeek + " " + month + " " + calendar.get(Calendar.DAY_OF_MONTH) + " "
				+ calendar.get(Calendar.YEAR);
		JTextArea i = new JTextArea();
		i.setText(cit + "\n" + dateStr);
		;
		Textareas.add(clocks, i);
		System.out.println(Textareas.get(clocks));

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() instanceof JButton) {
			JButton buttonpressed = (JButton) arg0.getSource();

			if (buttonpressed == add) {
				String ans = JOptionPane.showInputDialog(null,
						"Please enter the city of your preference ( City, Country ).");
				newClocks(ans, clocksmade);

			}
			if (buttonpressed == remove) {
				System.out.println("???");
			}
		} else {
			Calendar c = Calendar.getInstance(timeZone);
			String militaryTime = c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":"
					+ c.get(Calendar.SECOND);
			String twelveHourTime = " [" + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":"
					+ c.get(Calendar.SECOND) + "]";
			timeStr = militaryTime + twelveHourTime;

			System.out.println(timeStr);
			for (JTextArea in : Textareas) {
				in.setText(city + "\n" + dateStr + "\n" + timeStr);
			}

			frame.pack();

		}
	}

}
