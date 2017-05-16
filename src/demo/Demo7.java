package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo7 extends JFrame implements ActionListener {

    
    private JLabel headIcon;

   
    private JPanel numberLogin, emailLogin, phoneNumberLogin;
    private JTabbedPane choice;
  
    private JButton b2, b1;
    private JTextField inputAccount;
    private JPasswordField inputPasswd;
    private JCheckBox invisibleLogin, rememberPasswd;
    private JLabel t1, t2;
    private JPanel data4;

    //�ײ���ť
    private JPanel p1, p2;
    private JButton loginButton, cancelButton, registerButton;

    public Demo7() {

        //�ϲ�ͼƬ
        b1 = new JButton("ͼƬ��������ռλʵ��");
        b1.addActionListener(this);
       // b1.setSize(50, 80);

        //ʱ�䳡��ѡ��
        JPanel data2 = new JPanel();
        Box vtemp = Box.createVerticalBox();
        
        Box b32a = Box.createHorizontalBox();
        Box b32b = Box.createHorizontalBox();
        Box b32c = Box.createHorizontalBox();
        JButton b321 = new JButton("������Ʊ");
        JButton b322 = new JButton("������Ʊ");
        JButton b323 = new JButton("������Ʊ");
        t1 = new JLabel("̫ƽ�����Ӱ��        9:00  - 12:00    ");
        t2 = new JLabel("̫ƽ�����Ӱ��        2:00  - 16:00    ");
        JLabel t3 = new JLabel("̫ƽ�����Ӱ��        20:00 - 22:00   ");
        b32a.add(t1);
        b32a.add(b321);
        b32b.add(t2);
        b32b.add(b322);
        b32c.add(t3);
        b32c.add(b323);
        
        vtemp.add(b32a);
        vtemp.add(b32b);
        vtemp.add(b32c);
        data2.add(vtemp);
        //data2.add(sc);
//exmple
        data4 = new JPanel();
        Box vte = Box.createVerticalBox();
        JLabel o1 = new JLabel("̫ƽ�����Ӱ�� A       9:00  - 12:00");
        JLabel o2 = new JLabel("̫ƽ�����Ӱ�� A       2:00  - 16:00");
        JLabel o3 = new JLabel("̫ƽ�����Ӱ�� A      20:00 - 22:00");
        vte.add(o1);
        vte.add(o2);
        vte.add(o3);
        data4.add(vte);
        
        
        
        
        JPanel data1 = new JPanel();
        Box vtemp1 = Box.createVerticalBox();
        
        Box tic1 = Box.createHorizontalBox();
        Box tic2 = Box.createHorizontalBox();
        Box tic3 = Box.createHorizontalBox();
        JButton ticc1 = new JButton("������Ʊ");
        JButton ticc2 = new JButton("������Ʊ");
        JButton ticc3 = new JButton("������Ʊ");
        JLabel x1 = new JLabel("̫ƽ�����Ӱ��        9:00  - 12:00    ");
        JLabel x2 = new JLabel("̫ƽ�����Ӱ��        2:00  - 16:00    ");
        JLabel x3 = new JLabel("̫ƽ�����Ӱ��        20:00 - 22:00    ");
        
        tic1.add(x1);
        tic1.add(ticc1);
        tic2.add(x2);
        tic2.add(ticc2);
        tic3.add(x3);
        tic3.add(ticc3);
        
        vtemp1.add(tic1);
        vtemp1.add(tic2);
        vtemp1.add(tic3);
        data1.add(vtemp1);
        
        JPanel data3 = new JPanel();
        Box vtemp3 = Box.createVerticalBox(); 
        Box b33a = Box.createHorizontalBox();
        Box b33b = Box.createHorizontalBox();
        Box b33c = Box.createHorizontalBox();
        JButton b331 = new JButton("������Ʊ");
        JButton b332 = new JButton("������Ʊ");
        JButton b333 = new JButton("������Ʊ");
        JLabel Q1 = new JLabel("̫ƽ�����Ӱ��        9:00  - 12:00    ");
        JLabel Q2 = new JLabel("̫ƽ�����Ӱ��        2:00  - 16:00    ");
        JLabel Q3 = new JLabel("̫ƽ�����Ӱ��        20:00 - 22:00   ");
        b33a.add(Q1);
        b33a.add(b331);
        b33b.add(Q2);
        b33b.add(b332);
        b33c.add(Q3);
        b33c.add(b333);
        vtemp3.add(b33a);
        vtemp3.add(b33b);
        vtemp3.add(b33c);
        data3.add(vtemp3);
        
        
        p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        

        //�в����ֵ�����
        //3��2��
        phoneNumberLogin = new JPanel();
        phoneNumberLogin.add(data2);
        

        //3��1��
        numberLogin = new JPanel();
        numberLogin.add(data1);

        //3��3��
        emailLogin = new JPanel();
        emailLogin.add(data3);
        
        //��ǩ��
        choice = new JTabbedPane();
        choice.add("3��1��",numberLogin);
        choice.add("3��2��",phoneNumberLogin);
        choice.add("3��3��",emailLogin);
        choice.setFont(new Font("����", 0, 14));

        //�ײ�����
        b2 = new JButton("ads");
        
        
        //���岼��
        this.add(b1,BorderLayout.NORTH);
        this.setIconImage(new ImageIcon("image/qq.jpg").getImage());
        this.setTitle("��Ժ����ϵͳ��ҳ");
        this.setSize(300,240);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1.add(choice);
        p1.add(new JPanel());
        this.add(p1,BorderLayout.CENTER);
        this.add(new JPanel(), BorderLayout.SOUTH);
        this.setLocation(800,400);
        //this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Demo7 test = new Demo7();
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		phoneNumberLogin.removeAll();
		phoneNumberLogin.add(data4);
		phoneNumberLogin.repaint();
		
	}

}
