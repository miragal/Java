package gui;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;
import javax.*;
import javax.swing.JFrame;

public class MY extends JFrame{
	public MY(){
		setLayout(new GridLayout(3,2,5,5));
		add(new JLabel("Apple"));
		add(new JTextField(8));
		add(new JLabel("Orange"));
		add(new JTextField(2));
		add(new JLabel("Pear"));
		add(new JTextField(8));
	}
	public static void main(String[] args){
		MY frame=new MY();
		frame.setTitle("Fruit");
		frame.setSize(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
