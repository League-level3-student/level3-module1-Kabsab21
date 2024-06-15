package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addnames = new JButton();
JButton viewnames = new JButton();
ArrayList<String> guests = new ArrayList<String>();

public static void main(String[] args) {
	 _02_GuestBook book = new  _02_GuestBook();
	 book.setup();
}

void setup() {
	guests.add(" Guest #1: Bob Banders");
	guests.add(" Guest #2: Sandy Summers");
	guests.add(" Guest #3: Greg Ganders");
	guests.add(" Guest #4: Donny Doners");

	frame.setVisible(true);
	frame.setTitle("Guest Book");
	frame.add(panel);
	panel.add(addnames);
	addnames.setText("Add Names");
	addnames.addActionListener(this);
	viewnames.addActionListener(this);
	viewnames.setText("View Names");
	panel.add(viewnames);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonpressed = (JButton) e.getSource();
	
	if(buttonpressed == addnames) {
		String newguest = JOptionPane.showInputDialog(null, " Add names below: ");
		guests.add("Guest #"+(guests.size()+1)+": "+newguest);
		System.out.println(guests);
	}
	if(buttonpressed == viewnames) {
	
		JOptionPane.showMessageDialog(null, guests );
	}
	
}





}
