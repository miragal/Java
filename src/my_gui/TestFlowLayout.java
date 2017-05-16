package my_gui;
import java.awt.*;
public class TestFlowLayout {
	public static void main(String[] args){
		Frame f=new Frame();
		Button b1=new Button("Yes");
		Button b2=new Button("Close");
		Button b3=new Button("No");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setBounds(200,200,400,300);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
	}
}
