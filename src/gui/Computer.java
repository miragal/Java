package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Computer {

	double a, b;
	char op;
	JButton[] button = { new JButton("1"), new JButton("2"), new JButton("3"),
			new JButton("+"), new JButton("4"), new JButton("5"),
			new JButton("6"), new JButton("-"), new JButton("7"),
			new JButton("8"), new JButton("9"), new JButton("*"),
			new JButton("0"), new JButton("."), new JButton("="),
			new JButton("/")
	};

	JFrame calFrame = new JFrame();
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JTextField tf = new JTextField(15);

	public Computer() {
		// TODO Auto-generated constructor stub
		calFrame.setSize(200, 300);

		jp1.setLayout(new FlowLayout());
		jp1.setSize(200, 50);
		jp1.add(tf);

		GridLayout gridLayout = new GridLayout(4, 4);

		jp2.setLayout(gridLayout);
		
		for (int i = 0; i < 16; i++) {
			jp2.add(button[i]);
			button[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource();
					if (btn.getText().matches("[0-9]")
							|| btn.getText().equals(".")) {
						tf.setText(tf.getText() + btn.getText());
					} else if (btn.getText().matches("[+\\-*/]")) {
						a = Double.parseDouble(tf.getText());
						op = btn.getText().charAt(0);
						tf.setText("");
					} else {
						b = Double.parseDouble(tf.getText());
						switch (op) {
						case '+':
							tf.setText(Double.toString(a + b));
							break;
						case '-':
							tf.setText(Double.toString(a - b));
							break;
						case '*':
							tf.setText(Double.toString(a * b));
							break;
						case '/':
							tf.setText(Double.toString(a / b));
							break;

						}

					}
				}
			});
		}
		
		calFrame.setLayout(new BorderLayout());
		calFrame.add(jp1, BorderLayout.NORTH);
		calFrame.add(jp2, BorderLayout.CENTER);
		calFrame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Computer();
	}

}
