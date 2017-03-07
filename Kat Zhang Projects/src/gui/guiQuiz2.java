package gui;

import java.awt.*;
import java.awt.event.*;

public class guiQuiz2 extends Frame implements ActionListener {
	//declaring variables for panels, buttons, text fields, and counters
	private Panel panel0;
	private Panel panel1;
	private Panel panel2;
	private Panel panel3;
	private Panel panel4;
	private Panel panel5;
	private Panel panel6;
	private Panel panel7;

	private Button go;
	private Button button1a;
	private Button button1b;
	private Button button2a;
	private Button button2b;
	private Button button3a;
	private Button button3b;
	private Button button4a;
	private Button button4b;
	private Button button5a;
	private Button button5b;
	private Button button6a;
	private Button button6b;
	private Button restart;

	private Label lbl0;
	private Label lbl1;
	private Label lbl2;
	private Label lbl3;
	private Label lbl4;
	private Label lbl5;
	private Label lbl6;
	private Label lbl7;
	private Label lbl8;

	private TextField tf1;
	
	private Font ft;

	private int points;

	//constructor for quiz 
	private guiQuiz2() {
		setLayout(null);
		setResizable(false);

		//buttons: declaring buttons, naming them, setting the color, the bounds, and their actions
		go = new Button("Go!");
		go.setBackground(Color.orange);
		go.setBounds(200, 250, 100, 50);
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false); //after pressing the "go" button, panel0 is turned off,
				panel1.setVisible(true);  //while panel1 is visible
			}
		});

		button1a = new Button("La La Land"); //name of button/declaring button
		button1a.setBackground(Color.MAGENTA); //setting the color of the button
		button1a.setBounds(100, 250, 100, 50); //setting the bounds of the button
		button1a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true); //moving on to the next panel even though the answer is wrong
				
			}
		});
		button1b = new Button("Moonlight");
		button1b.setBackground(Color.MAGENTA);
		button1b.setBounds(300, 250, 100, 50);
		button1b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true); //still moves on to the next panel 
				points++; //adds one to the counter 
				tf1.setText(points + "/6"); //sets the text in the tf = to the points over number of question
			}
		});

		button2a = new Button("Arizona");
		button2a.setBackground(Color.white);
		button2a.setBounds(100, 250, 100, 50);
		button2a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				points++;
				tf1.setText(points + "/6");
			}
		});
		button2b = new Button("Iowa");
		button2b.setBackground(Color.white);
		button2b.setBounds(300, 250, 100, 50);
		button2b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);

			}
		});

		button3a = new Button("39");
		button3a.setBackground(Color.darkGray);
		button3a.setBounds(100, 250, 100, 50);
		button3a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
			}
		});

		button3b = new Button("43");
		button3b.setBackground(Color.darkGray);
		button3b.setBounds(300, 250, 100, 50);
		button3b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				points++;
				tf1.setText(points + "/6");
			}
		});

		button4a = new Button("Kevin Systrom");
		button4a.setBackground(Color.white);
		button4a.setBounds(100, 250, 100, 50);
		button4a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				points++;
				tf1.setText(points + "/6");
			}
		});

		button4b = new Button("Evan Spiegel");
		button4b.setBackground(Color.white);
		button4b.setBounds(300, 250, 100, 50);
		button4b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
			}
		});

		button5a = new Button("Full House");
		button5a.setBackground(Color.YELLOW);
		button5a.setBounds(100, 250, 100, 50);
		button5a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);

			}
		});

		button5b = new Button("X-Files");
		button5b.setBackground(Color.YELLOW);
		button5b.setBounds(300, 250, 100, 50);
		button5b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				points++;
				tf1.setText(points + "/6");

			}
		});

		button6a = new Button("Chris");
		button6a.setBackground(Color.black);
		button6a.setBounds(100, 250, 100, 50);
		button6a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);

			}
		});

		button6b = new Button("Liam");
		button6b.setBackground(Color.black);
		button6b.setBounds(300, 250, 100, 50);
		button6b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);
				points++;
				tf1.setText(points + "/6");

			}
		});

		restart = new Button("Restart");
		restart.setBackground(Color.cyan);
		restart.setBounds(200, 250, 100, 50);
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				panel0.setVisible(true); //reverts back to the original panel0
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				points = 0; //sets the points equal to zero 

			}
		});
		//declaring the names of the labels + setting their bounds
		lbl0 = new Label("Pop Culture Quiz!");
		lbl0.setBounds(200, 60, 110, 50);

		lbl1 = new Label("Who won the 2017 Oscar for Best Picture?");
		lbl1.setBounds(130, 50, 400, 100);

		lbl2 = new Label("Where is actress Emma Stone from?");
		lbl2.setBounds(140, 50, 400, 100);

		lbl3 = new Label("How old is Mahershala Ali (as of Feb. 03, 2016)?");
		lbl3.setBounds(110, 50, 400, 100);

		lbl4 = new Label("Who is the CEO of Instagram?");
		lbl4.setBounds(170, 50, 400, 100);

		lbl5 = new Label("Which cult 90s television show was ressurected in 2016 on Fox?");
		lbl5.setBounds(50, 50, 460, 100);

		lbl6 = new Label("Which Hemsworth is Miley Cryus engaged to?");
		lbl6.setBounds(120, 50, 400, 100);
		
		lbl7 = new Label("Quiz Complete!");
		lbl7.setBounds(200, 50, 400, 100);

		lbl8 = new Label("Number of Questions Correct: ");
		lbl8.setBounds(130, 120, 400, 100);

		tf1 = new TextField();
		tf1.setBounds(325, 150, 50, 45);
		//adding the buttons and labels to panels
		panel0 = new Panel();
		panel0.setBackground(Color.red);
		panel0.setBounds(0, 0, 500, 500);
		panel0.setLayout(null);
		panel0.add(lbl0);
		panel0.add(go);
		panel0.setVisible(true);

		panel1 = new Panel();
		panel1.setBackground(Color.yellow);
		panel1.setBounds(0, 0, 500, 500);
		panel1.setLayout(null);
		panel1.add(lbl1);
		panel1.add(button1a);
		panel1.add(button1b);
		panel1.setVisible(false);

		panel2 = new Panel();
		panel2.setBackground(Color.blue);
		panel2.setBounds(0, 0, 500, 500);
		panel2.setLayout(null);
		panel2.add(lbl2);
		panel2.add(button2a);
		panel2.add(button2b);
		panel2.setVisible(false);

		panel3 = new Panel();
		panel3.setBackground(Color.orange);
		panel3.setBounds(0, 0, 500, 500);
		panel3.setLayout(null);
		panel3.add(lbl3);
		panel3.add(button3a);
		panel3.add(button3b);
		panel3.setVisible(false);

		panel4 = new Panel();
		panel4.setBackground(Color.cyan);
		panel4.setBounds(0, 0, 500, 500);
		panel4.setLayout(null);
		panel4.add(lbl4);
		panel4.add(button4a);
		panel4.add(button4b);
		panel4.setVisible(false);

		panel5 = new Panel();
		panel5.setBackground(Color.pink);
		panel5.setBounds(0, 0, 500, 500);
		panel5.setLayout(null);
		panel5.add(lbl5);
		panel5.add(button5a);
		panel5.add(button5b);
		panel5.setVisible(false);

		panel6 = new Panel();
		panel6.setBackground(Color.gray);
		panel6.setBounds(0, 0, 500, 500);
		panel6.setLayout(null);
		panel6.add(lbl6);
		panel6.add(button6a);
		panel6.add(button6b);
		panel6.setVisible(false);

		panel7 = new Panel();
		panel7.setBackground(Color.green);
		panel7.setBounds(0, 0, 500, 500);
		panel7.setLayout(null);
		panel7.add(tf1);
		panel7.add(lbl7);
		panel7.add(lbl8);
		panel7.add(restart);
		panel7.setVisible(false);
		//adding all the panels to the quiz 
		add(panel0);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);

		setTitle("Pop Culture Quiz!");//setting the title of the quiz
		setSize(500, 500); //setting dimensions of the window
		setVisible(true); //setting the whole thing to visible 
	}

	public static void main(String[] args) {
		guiQuiz2 app = new guiQuiz2(); 
	}

	public void actionPerformed(ActionEvent e) {
	}
}