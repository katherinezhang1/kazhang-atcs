package movieBooking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui {
	TheaterClass regal;
	private JFrame mainFrame;
	private JFrame movieFrame;
	private JFrame seatFrame;
	private JFrame foodFrame;
	private JFrame cartFrame;
	private JTextArea ta;
	private JTextArea ta1;
	private JTextField tf;
	private JButton Select;
	private JButton Next;
	private JButton bookSeat;
	private JButton cart;
	private JButton add;
	private JButton no;
	private JComboBox days;
	private JComboBox movies;
	private JComboBox food;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
private int amount;

	Gui(TheaterClass _regal) {
		regal = _regal;

		mainFrame = new JFrame("Welcome to Regal!");
		mainFrame.setSize(450, 450);
		mainFrame.setLayout((new FlowLayout()));

		movieFrame = new JFrame("Movies Available");
		movieFrame.setSize(450, 450);
		movieFrame.setLayout(new FlowLayout());

		seatFrame = new JFrame("Seats Available");
		seatFrame.setSize(450, 450);
		seatFrame.setLayout(new FlowLayout());

		foodFrame = new JFrame("Additional Food");
		foodFrame.setSize(450, 450);
		foodFrame.setLayout(new FlowLayout());

		cartFrame = new JFrame("Cart");
		cartFrame.setSize(450, 450);
		cartFrame.setLayout(new FlowLayout());

		label1 = new JLabel();
		label1.setBounds(100, 50, 400, 15);
		label1.setText("Please Select the Date You Want to Book");

		label2 = new JLabel();
		label2.setBounds(100, 50, 400, 15);
		label2.setText("Which Movie Would You Like to Watch?");

		// label3 = new JLabel();
		// label3.setBounds(100, 50, 400, 15);
		// label3.setText("You have chosen a" + dayChosen + "showing of '" +
		// movieChosen+ "'");

		label4 = new JLabel();
		label4.setBounds(180, 50, 400, 15);
		label4.setText("Seats Available");

		label5 = new JLabel();
		label5.setBounds(120, 150, 400, 15);
		label5.setText("Which Seat(s) Would You Like to Book?");

		label6 = new JLabel();
		label6.setBounds(120, 150, 400, 15);
		label6.setText("Would You Like to Add Food?");
		
		label7 = new JLabel();
		label7.setBounds(120, 150, 400, 15);
		label7.setText("Here is Your Total");

		Select = new JButton("Select");
		Select.setBounds(170, 200, 80, 30);
		Select.setActionCommand("select");
		Select.addActionListener(new ButtonClickListener());

		Next = new JButton("Next");
		Next.setBounds(170, 200, 80, 30);
		Next.setActionCommand("next");
		Next.addActionListener(new ButtonClickListener());

		cart = new JButton("Go to Cart");
		cart.setBounds(330, 400, 120, 30);
		cart.setActionCommand("cart");
		cart.addActionListener(new ButtonClickListener());

		add = new JButton("Add to Cart");
		add.setBounds(170, 200, 80, 30);
		add.setActionCommand("add");
		add.addActionListener(new ButtonClickListener());

		no = new JButton("No, Go to Cart");
		no.setBounds(330, 400, 120, 30);
		no.setActionCommand("no");
		no.addActionListener(new ButtonClickListener());

		bookSeat = new JButton("Book This Seat");
		bookSeat.setBounds(150, 230, 150, 30);
		bookSeat.setActionCommand("book");
		bookSeat.addActionListener(new ButtonClickListener());

		String weekdays[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		days = new JComboBox(weekdays);
		days.setBounds(120, 150, 200, 25);

		String movieNames[] = regal.getMoviesArray();
		movies = new JComboBox(movieNames);
		movies.setBounds(120, 150, 200, 25);

		String foodNames[] = regal.getFoodArray();
		food = new JComboBox(foodNames);
		food.setBounds(120, 150, 200, 25);

		ta = new JTextArea();
		ta.setBounds(120, 100, 230, 30);
		ta.setText(regal.toString2());

		ta1 = new JTextArea();
		ta1.setBounds(200, 180, 50, 30);
		
		tf = new JTextField();
		tf.setBounds(120, 100, 230, 30);
		tf.setText(amount + "");
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		mainFrame.setLayout(null);
		mainFrame.add(label1);
		mainFrame.add(days);
		mainFrame.setVisible(true);
		mainFrame.add(Select);

		movieFrame.setLayout(null);
		movieFrame.add(label2);
		movieFrame.add(movies);
		movieFrame.add(Next);

		seatFrame.add(label4);
		seatFrame.add(ta);
		seatFrame.add(label5);
		seatFrame.add(ta1);
		seatFrame.add(bookSeat);
		//seatFrame.add(cart);
		seatFrame.setSize(450, 450);
		seatFrame.setLayout(null);

		/*foodFrame.add(label6);
		foodFrame.add(food);
		foodFrame.add(no);
		foodFrame.add(add);*/
		
		
		
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("next")) {
				mainFrame.setVisible(false);
				seatFrame.setVisible(true);
			} else if (command.equals("book")) {
				if (regal.bookSeat(ta1.getText()))
					System.out.println("Seat Booked");
				else
					System.out.println("Unavailable");
			} else if (command.equals("select")) {
				mainFrame.setVisible(false);
				movieFrame.setVisible(true);
			} else if (command.equals("cart")) {
				mainFrame.setVisible(false);
				movieFrame.setVisible(false);
				seatFrame.setVisible(false);
				//foodFrame.setVisible(true);
				cartFrame.setVisible(true);
			/*} else if (command.equals("no")) {
				mainFrame.setVisible(false);
				movieFrame.setVisible(false);
				seatFrame.setVisible(false);
				foodFrame.setVisible(false);
				cartFrame.setVisible(true);
			} else if (command.equals("add")) {
				mainFrame.setVisible(false);
				movieFrame.setVisible(false);
				seatFrame.setVisible(false);
				foodFrame.setVisible(false);
				cartFrame.setVisible(true);
				amount+=10;
			}
		}*/
			}}}}


