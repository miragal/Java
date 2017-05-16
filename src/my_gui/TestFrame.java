package my_gui;
import java.awt.*;
public class TestFrame {
	public static void main(String[] args){
		MyFrame m1=new MyFrame(100,100,300,300,Color.DARK_GRAY);
		MyFrame m2=new MyFrame(100,400,300,300,Color.green);
		MyFrame m3=new MyFrame(400,100,300,300,Color.LIGHT_GRAY);
		MyFrame m4=new MyFrame(400,400,300,300,Color.pink);
	}
}

class MyFrame extends Frame{
	static int i=0;
	MyFrame(int x,int y,int h,int w,Color color){
		super("Frame "+(++i));
		setBounds(x,y,h,w);
		setBackground(color);
		setLayout(null);
		setVisible(true);
	}
}
