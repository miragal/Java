package gui;

import java.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	char op;
	double a;
	double b;
	JTextField tf = new JTextField(8);
	JButton [] button={
				new JButton("Add"),
				new JButton("Substract"),
				new JButton("Multiply"),
				new JButton("Divide")
		};
	public Calculator(){
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		jp1.add(new JLabel("Number1"));
		jp1.add(new JTextField(5));
		jp1.add(new JLabel("Number2"));
		jp1.add(new JTextField(5));
		jp1.add(new JLabel("Result"));
		jp1.add(tf);
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		for(int i=0;i<button.length;i++){
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
			
		jp1.add(jp2);
		add(jp1);
		
	}
	public static void main(String[] args){
		Calculator c=new Calculator();	
		c.setTitle("Computer");
		c.setSize(450,150);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
	}
}
