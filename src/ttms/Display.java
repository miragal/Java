package ttms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Display extends JFrame {
	private String[] flagTitles={"�������","һ������ʹ��","������","ħ�óǱ�"};
	private ImageIcon[] flagImage={
			new ImageIcon("1.jpg"),
			new ImageIcon("2.jpg"),
			new ImageIcon("3.jpg"),
			new ImageIcon("4.jpg")
	};
	private String[] fd=new String[4];
	private DescriptionPanel dsp=new DescriptionPanel();
	private JComboBox jcbo=new JComboBox(flagTitles);
	public Display(){
		fd[0]="�������\n\n"+"��Զ��󶼻��Сɽ�壬ס����Ů���ҳ���ĸ���Ů����ˮ��Ҷ���ϰ�ʯ���� ��������У԰�ͼ�ͥ��ԭ�򱾾������������գ�����һ��ʱ�䷢��������¼���������Ҷ������ͷ�ԡ���֪�Ӻ�ʱ����Ҷ�����оͻ���һ��ס�ڶ����ĸ����к���������İ����ͬѧ�����ѣ������е�ǰ���ͷ����Ľֵ���һ�ж���������˶���ʵ����һ���棬ס�ڶ����ĸ����к���������ľ¡֮�� ��������������������İ����Сɽ�壬��Ů���ӵ���ݹ���ȫ�µ�����������ǿ��������ǵ�Ӱ�죬��������Ҷ�����н�������ݡ����������ߵĽǶ������ŶԷ������������ڼ��з�ŭ���л�ЦҲ��ů�ġ�ֻ�����˲���֪������ݽ����ı����������ش��׶�ĵ����ܡ��� ";
		fd[1]="һ������ʹ��\n\n"+"ӰƬ�������˵��ӽ�չ�ֹ����������΢����У�һֻ�������С���˳�����ˣ�����Ϊ��׷����Ů���ѣ�������������ȥ��ת��Ͷ̥��������Ա�����͵������ڶ����ֻع�������˾�Ȯ�������ݣ��ٴ�ת�ֻأ��ֳ������һλ����Ů�����С�»�Ȯ���ھ����˶���ֻ�֮�����ջص������������ߡ� ";
		fd[2]="������\n\n"+"���·�����һ�����в����ද���г��������������У�������ϣ����ݸ����ŵ��� Ginnifer Goodwin ��������С���������ܹ���Ϊһ���Ͷ����Ƶ��̾���ƾ�����ǻۺ�Ŭ������ϳɹ��ĴӾ�У�б�ҵ�����˷����Ǿ���֣��ⲻ֪�����Ǵ�����ʳ�ද�����أ���Ϊ��һֻ��Ҳ��Ψһ��С��ʳ���ද���ϻ����������Ĺ����أ� "
		+"��������н�����������ʧ�ٰ���������ȫ����Ա�������ڵ��鰸������֮ʱ�����ȴ���ֳ���������˹�������� Idris Elba �����������Ϊ��һ���������صĽ�����ĳ�գ�����ִ�ڵ�������������Ϊ��ˣ���ɭ�������� Jason Bateman �������ĺ��꣬���˲�����ʶ��֮���������ײ�Ľ�����Ѱ��ʧ�ٵ�ˮ̡�����������������������֮���ҵ�ˮ̡��������Ͼͱ�����Ը�뿪���֡�����ҵ�����ˣ��������ֽ�¶��һ�������ڷ�����֮�еľ������ܡ�";
		fd[3]="ħ�óǱ�\n\n"+"���ܿˣ����������طƶ��� Asa Butterfield �Σ���үү�Խܿ˻�С��ʱ�򣬾ͻ᳣˵���߹��¸������������������ӵ������������С����үү���������������˹������������һ��ʱ�������������ŵ��������ܿ�ѭ����Щ������������������ص����磬������Ⱥ��ֵĺ�����ʵ���ڣ�����ס��������Ϊ�˶�ܿ��µı�����ޡ����Žܿ˵ĵ�����Σ��Ҳͬʱ�ִ�ܿ���Ҫ����Ⱥ����һ�𣬵����ڰ�������";
		setDisplay(0);
		add(jcbo,BorderLayout.NORTH);
		add(dsp,BorderLayout.CENTER);
		jcbo.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				setDisplay(jcbo.getSelectedIndex());
			}
		});
	}
	public void setDisplay(int index){
		dsp.setTitle(flagTitles[index]);
		dsp.setImageIcon(flagImage[index]);
		dsp.setDescription(fd[index]);
	}
	public static void main (String[] args){
		Display frame=new Display();
		frame.setTitle("��Ӱ��Ϣ");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class DescriptionPanel extends JPanel{
	private JLabel jit=new JLabel();
	private JTextArea jd=new JTextArea();
	public DescriptionPanel(){
		jit.setHorizontalAlignment(JLabel.CENTER);
		jit.setHorizontalTextPosition(JLabel.CENTER);
		jit.setVerticalAlignment(JLabel.BOTTOM);
		
		jit.setFont(new Font("ScansSerif",Font.BOLD,16));
		jd.setFont(new Font("Serif",Font.PLAIN,14));
		
		jd.setLineWrap(true);
		jd.setWrapStyleWord(true);
		jd.setEditable(false);
		
		JScrollPane sl=new JScrollPane(jd);
		
		setLayout(new BorderLayout(5,5));
		add(sl,BorderLayout.CENTER);
		add(jit,BorderLayout.WEST);
	}
	
	public void setTitle(String t){
		jit.setText(t);
	}
	public void setImageIcon(ImageIcon i){
		jit.setIcon(i);
	}
	public void setDescription(String t){
		jd.setText(t);
	}
}
