package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
    /*
     * Crate a HashMap of Integers for the keys and Strings for the values.
    
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */

	HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	public static void main(String[] args) {
		 _02_LogSearch obj = new  _02_LogSearch();
		 obj.setup();
	}
	void setup(){
		frame.setVisible(true);
		frame.setTitle("title");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button1.setText("ADD ENTRY");
		button2.setText("SEARCH BY ID");
		button3.setText("VIEW LIST");
		button4.setText("REMOVE ENTRY");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton ) arg0.getSource();
		
		if( buttonclicked == button1) {
		String ID =	JOptionPane.showInputDialog(null, "Please enter an ID number.");
		String Name =	JOptionPane.showInputDialog(null, "Please enter a Name.");
		int input =	Integer.parseInt(ID);
		hashmap.put(input, Name);
		}
		if( buttonclicked == button2) {
			String ID =	JOptionPane.showInputDialog(null, "Please enter an ID number.");
			int input =	Integer.parseInt(ID);
		
				if( hashmap.get(input) != null) {
					JOptionPane.showMessageDialog(null, "Is the person you are looking for "+hashmap.get(input));
						
			   } else if(hashmap.get(input) == null){
					JOptionPane.showMessageDialog(null, "there is no person with the ID number "+input+" listed.");
				}
		}
		if( buttonclicked == button3) {
			JOptionPane.showMessageDialog(null, hashmap);
			
		}
		if( buttonclicked == button4) {
			String ID =	JOptionPane.showInputDialog(null, "Please enter an ID number.");
			int input =	Integer.parseInt(ID);
		
				if( hashmap.get(input) != null) {
					JOptionPane.showMessageDialog(null, "The person you just removed was "+hashmap.get(input));
					hashmap.remove(input);
					
			   } else if(hashmap.get(input) == null){
					JOptionPane.showMessageDialog(null, "there is no person with the ID number "+input+" listed.");
				}
		}
		
	}
	
	
}
