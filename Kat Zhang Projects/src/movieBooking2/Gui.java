package movieBooking2;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class Gui {
	//variables used throughout the project
	Theater regal;
	private JFrame mainFrame;
	private JButton nextButton;
	private JButton selectButton;
	private JButton dateButton;
	private JButton movieButton;
	private JButton timeButton;
	private JButton finalButton;
	private JTextArea ta;
	private JTextArea ta1;
	private Label dateLabel;
	private Label seatLabel;
	private Label cartLabel;
	private String d;
	private String n;
	private String movieName;
	private String seatString;
	private String seatString2;
	private String seatStringYES;
	private String seatSelected;
	private String timeSelected;

	Gui(Theater _regal) { //constructor uses a theater class
		regal = _regal;
		
		//setting up the mainframe
		mainFrame = new JFrame("Regal Cinema"); //name of mainFrame
		mainFrame.setSize(400, 360);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.getContentPane().setBackground(Color.pink);

		//buttons 
		movieButton = new JButton("Chose a Movie");
		movieButton.setActionCommand("reserve");
		movieButton.addActionListener(new ButtonClickListener());

		selectButton = new JButton("Select a Seat");
		selectButton.setActionCommand("select");
		selectButton.addActionListener(new ButtonClickListener());

		nextButton = new JButton("Next");
		nextButton.setActionCommand("next");
		nextButton.addActionListener(new ButtonClickListener());

		dateButton = new JButton("Date");
		dateButton.setActionCommand("date");
		dateButton.addActionListener(new ButtonClickListener());
		
		timeButton = new JButton("Select a Time");
		timeButton.setActionCommand("time");
		timeButton.addActionListener(new ButtonClickListener());
		
		finalButton = new JButton("Back to Seats");
		finalButton.setActionCommand("final");
		finalButton.addActionListener(new ButtonClickListener());

		//text areas
		ta = new JTextArea("", 15, 30);
		ta.setText(regal.toString());
		
		ta1 = new JTextArea("", 15, 30);
		ta1.setText("");

		//labels
		dateLabel = new Label("");
		dateLabel.setText("");

		seatLabel = new Label("");
		seatLabel.setText("");
		
		cartLabel = new Label("");
		cartLabel.setText("Cart: ");
		
		//closing window
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		//adding buttons to mainframe
		mainFrame.add(movieButton);
		movieButton.setVisible(true);
		
		mainFrame.add(nextButton);
		nextButton.setVisible(false); 
		
		mainFrame.add(selectButton);
		selectButton.setVisible(false);
		
		mainFrame.add(dateButton);
		dateButton.setVisible(false);
		
		mainFrame.add(timeButton);
		timeButton.setVisible(false);
		
		mainFrame.add(finalButton);
		finalButton.setVisible(false);
		
		//adding Labels to mainFrame
		mainFrame.add(seatLabel);
		seatLabel.setVisible(false);
		
		mainFrame.add(dateLabel);
		dateLabel.setVisible(false);
		
		mainFrame.add(cartLabel);
		cartLabel.setVisible(false);
		
		//adding text areas to mainframe
		mainFrame.add(ta1);
		ta1.setVisible(false);
		
		mainFrame.add(ta);
		mainFrame.setVisible(true);
		
		System.out.println("Cart: "); //gives user ability to see cart
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand(); //gets command from buttons
			if (command.equals("reserve")) { //if reserve button is clicked, then this action is called
				movieName = JOptionPane.showInputDialog(mainFrame, "Enter a Movie Title").toUpperCase(); //creates a popup window
				if (regal.getMovieIndex(movieName) != -1) { //if input is in the array list
					seatLabel.setVisible(true); 
					seatLabel.setText("Seats Available For: " + movieName);
					ta.setText(regal.toString2(movieName));
					seatString = regal.toString2(movieName);
					d = "Movie: " + movieName; //adding phrases to final cart
					movieButton.setVisible(false); 
					selectButton.setVisible(true);
					System.out.println("Movie Selected: " + movieName);
				}
				else{ //if input is not in array list
					System.out.println("Select a real movie.");
				}
			}
			else if (command.equals("select")){
			seatSelected = JOptionPane.showInputDialog(mainFrame, "Select a Seat").toUpperCase();
			if (seatString.contains(seatSelected) == true) { //if the seatSelected is within the seatString
				ta.setText("Seats available for: " + movieName + "\n" + seatString.replace(seatSelected, "") + "\n" + "\n" +"\n" +"Seat Reserved: " + seatSelected);
				System.out.println("Seat Selected: " + seatSelected);
				seatStringYES = seatString.replace(seatSelected, ""); //replacing the selected Seat with an empty space
				nextButton.setVisible(true);
				seatLabel.setVisible(false);
				selectButton.setVisible(false);
				d += "\n" + "Seat Selected: "+ seatSelected; //adding phrases to the cart
			} else {//if the seat input does not equal what is in the array, this will print
				System.out.println("Sorry, that is not a real seat, try again.");
			}
		
			}else if (command.equals("next")){
				Calendar tomorrow = Calendar.getInstance(); //adding dates into the project
				tomorrow.add(Calendar.DATE, 1); //gets the date for the following day

				ta.setText("Dates Available: " + "\n" + tomorrow.getTime() ); 
				nextButton.setVisible(false);
				selectButton.setVisible(false);
				timeButton.setVisible(true);
			}else if (command.equals("time")){
				timeSelected = JOptionPane.showInputDialog(mainFrame, "Select a Date (Month + Day)");
					n = ta.getText();
					if(n.contains(timeSelected) == true){ //if the date that was input was an option
					System.out.println("Date Selected: " +timeSelected);
					selectButton.setVisible(false);
					timeButton.setVisible(false);
					cartLabel.setVisible(true);
					d += "\n" + "Time: "+ timeSelected; //adding more information to final cart
					ta.setText(d);
					int options = JOptionPane.showConfirmDialog(mainFrame, "Confirm"); //popup window with confirmation of cart
					if(options == JOptionPane.YES_OPTION){ //if yes is selected
						finalButton.setVisible(true);
						ta.setVisible(false);
						cartLabel.setVisible(false);
						
					}
					if(options == JOptionPane.NO_OPTION){//if no is selected
						ta.setText(seatString); //change the text area to the original string of seats without changes
						selectButton.setVisible(true);
					}
					
				}else{
					System.out.println("Sorry, that's not a real time");
				}
			}else if (command.equals("final")){ //gives you the ability to book another seat
				finalButton.setVisible(false);
				ta.setVisible(true);
				seatString = seatStringYES;
				seatString2 ="\n" + "\n" +"\n" +"Seat Reserved: " + seatSelected+ " on " + timeSelected;
				ta.setText(seatString + seatString2);
				seatLabel.setVisible(true);
				selectButton.setVisible(true);
					
			}
	}

	}
}


