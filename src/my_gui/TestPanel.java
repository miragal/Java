package my_gui;
import java.awt.*;
import java.util.Scanner;
public class TestPanel {
	public static void main(String[] args){
		Frame f=new Frame("Java Frame");
		f.setLayout(new GridLayout(2,1));
		f.setLocation(300, 400);
		f.setSize(400, 300);
		f.setBackground(new Color(204,204,205));
		Panel p1=new Panel(new BorderLayout());
		Panel p2=new Panel(new BorderLayout());
		Panel p11=new Panel(new GridLayout(2,2));
		Panel p21=new Panel(new GridLayout(2,2));
		p1.add(new Button("Button"), BorderLayout.WEST);
		p1.add(new Button("Button"), BorderLayout.EAST);
		p11.add(new Button("Button"));
		p11.add(new Button("Button"));
		p1.add(p11, BorderLayout.CENTER);
		p2.add(new Button("Button"), BorderLayout.WEST);
		p1.add(new Button("Button"), BorderLayout.EAST);
		for(int i=1;i<=4;i++)	p21.add(new Button("Button"));
		p2.add(p21, BorderLayout.CENTER);
		f.add(p1);f.add(p2);
		f.setVisible(true);
	}
}
