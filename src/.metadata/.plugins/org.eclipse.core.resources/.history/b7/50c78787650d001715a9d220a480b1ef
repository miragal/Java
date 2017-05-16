package ttms;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.File;
import java.util.Random;
import javax.swing.*;
public class site {
	
	public int count=0;
	static int[][] buttonArray = new int[15][15];
		public static void main(String[] args){
			site a=new  site();
			a.site();
		}
		
		public void site(){
			JFrame mazeBoard = new JFrame("剧院管理系统--选择座位");
	 		Toolkit kit = Toolkit.getDefaultToolkit();
	 		Dimension screenSize = kit.getScreenSize();
	 		int screenWidth = screenSize.width;
	 		int screenHeigth = screenSize.height;
	 		mazeBoard.setBounds(screenWidth/2-400, screenHeigth/2-300, 800, 600);
	 		mazeBoard.setResizable(false);
	 		mazeBoard.setVisible(true);
//	 		ImageIcon mazeBack = new ImageIcon("back.jpg");
//	 		JLabel mazeLabel = new JLabel(mazeBack);
//	 		mazeLabel.setBounds(0, 0, mazeBack.getIconWidth(), mazeBack.getIconHeight());
	 		JPanel mazePanel = (JPanel)mazeBoard.getContentPane();
	 		mazePanel.setOpaque(false);
	 		mazePanel.setLayout(new FlowLayout());
	 		mazeBoard.getLayeredPane().setLayout(null);
//	 		mazeBoard.getLayeredPane().add(mazeLabel,new Integer(Integer.MIN_VALUE));
	 		mazeBoard.setLayout(null);
	 		JLabel tip = new JLabel("请选择座位");
			tip.setFont(new Font("微软雅黑",Font.PLAIN,32));
			tip.setForeground(new Color(0, 110, 210));
			tip.setBounds(535, 50, 250, 40);
			mazePanel.add(tip);
			JLabel tip2 = new JLabel("电影名称：美女与野兽");
			tip2.setFont(new Font("微软雅黑",Font.PLAIN,16));
			tip2.setForeground(new Color(0, 110, 210));
			tip2.setBounds(535, 150, 250, 40);
			mazePanel.add(tip2);
			JLabel tip3 = new JLabel("时间：17.50 ~ 19.20");
			tip3.setFont(new Font("微软雅黑",Font.PLAIN,16));
			tip3.setForeground(new Color(0, 110, 210));
			tip3.setBounds(535, 200, 250, 40);
			mazePanel.add(tip3);
			JButton b1=new JButton("确定");
			b1.setBounds(590, 450, 100, 40);
			mazePanel.add(b1);
			
			
		
			
			
			
			JButton[][] button = new JButton[15][15];
	 		int a = 25,b = 30;
	 		Color Blue = new Color(0, 110, 210);
	 		ImageIcon icon1 = new ImageIcon("6.jpg");
	 		ImageIcon icon2 = new ImageIcon("02.jpg");
	 		for(int i=0;i<15;i++){
	 			for(int j=0;j<15;j++){
	 				button[i][j] = new JButton();
	 				button[i][j].setBounds(a, b, 31, 31);
	 				button[i][j].setBackground(Color.ORANGE);
	 				button[i][j].setIcon(icon1);
	 				mazePanel.add(button[i][j]);
	 				a=a+32;
	 				buttonArray[i][j] = 0;
	 				final int m=i,n=j;
	 				button[i][j].addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							int temp=0;
							count+=1;
							if(button[m][n].getBackground()==Color.ORANGE&&temp==0){
								button[m][n].setBackground(Blue);
								button[m][n].setIcon(icon2);
//								count+=1;
								temp=1;
								buttonArray[m][n] = 1;
							}
							if(button[m][n].getBackground()==Blue&&temp==0){
								button[m][n].setBackground(Color.ORANGE);
								button[m][n].setIcon(icon1);
								temp=1;
//								count-=1;
								buttonArray[m][n] = 0;
							}
						}
	 				});
	 			}
	 			a=25;
	 			b=b+32;
	 		}
	 		
	 		mazePanel.repaint();
	 		System.out.println(count);
//	 		if(count!=0){
	 		b1.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 
					 new success().site();
				 }
			});}
//		}
		
}


