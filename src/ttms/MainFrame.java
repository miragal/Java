package my;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.File;
import java.util.Random;
import javax.swing.*;
public class MainFrame {  
    GridBagLayout  layout=new  GridBagLayout();  
    GridBagConstraints gbc=new GridBagConstraints();  
    JMenuBar menubar1 = new JMenuBar();  
    JMenu menu1=new JMenu("票务管理");  
    JMenu menu2=new JMenu("会员管理");  
    JMenu menu5=new JMenu("信息服务");  
    JMenu menu6=new JMenu("用户设置");  
    JMenuItem menu1Item1=new JMenuItem("售票");  
    JMenuItem menu1Item2=new JMenuItem("退票");  
    JMenuItem menu2Item1=new JMenuItem("会员注册");  
    JMenuItem menu2Item2=new JMenuItem("信息管理");  
    JMenuItem menu5Item1=new JMenuItem("版本信息");  
    JMenuItem menu5Item2=new JMenuItem("使用帮助");  
    JMenuItem menu6Item1=new JMenuItem("修改密码");  
    JFrame jf=new JFrame("剧院票务管理系统");  
    static JPanel jp=new JPanel(new GridLayout(1,1));  
    Toolkit kit=Toolkit.getDefaultToolkit();  
    Dimension  screeSize=kit.getScreenSize();  
    static JScrollPane  js;  
    public MainFrame(){  
         menu1.add(menu1Item1);  
         menu1.add(menu1Item2);  
         menu2.add(menu2Item1);  
         menu2.add(menu2Item2);  
         menu5.add(menu5Item1);  
         menu5.add(menu5Item2);  
         menu6.add(menu6Item1);   
         menubar1.add(menu1);  
         menubar1.add(menu2);  
         menubar1.add(menu5);  
         menubar1.add(menu6);  
         jf.setJMenuBar(menubar1);  
         
         jf.add(jp);  
         jf.setSize(screeSize.width, screeSize.height);  
         jf.setVisible(true);  
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }  
} 