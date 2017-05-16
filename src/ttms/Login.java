package ttms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JPanel{
	static final int width=300;
	static final int height=150;
	JFrame loginframe;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	Login(){
		loginframe=new JFrame("��ӭ�������˹ȣ���������(^o^)~");
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		loginframe.add(this,BorderLayout.WEST);
		loginframe.setSize(width, height);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int wi=screenSize.width;
		int he=screenSize.width;
		int x=(wi-width)/2;
		int y=(he-height)/2;
		loginframe.setLocation(x,y);
		JButton ok=new JButton("��¼");
		JButton cancel=new JButton("����");
		JLabel title=new JLabel("��ӭ�������˹ȣ���������(^o^)~");
		JLabel name=new JLabel("�û���");
		JLabel password=new JLabel("����");
		final JTextField nameinput=new JTextField(15);
		final JTextField passwordinput=new JTextField(15);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.EAST;
		constraints.weightx=3;
		constraints.weighty=4;
		add(title,constraints,0,0,4,1);
		add(name,constraints,0,1,1,1);
		add(password,constraints,0,2,1,1);
		add(nameinput,constraints,2,1,1,1);
		add(passwordinput,constraints,2,2,1,1);
		add(ok,constraints,0,3,1,1);
		add(cancel,constraints,2,3,1,1);
		loginframe.setResizable(false);
		loginframe.setVisible(true);
	}
	public static void main(String[] args){
		Login l=new Login();
	}
}

