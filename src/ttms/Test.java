package ttms;


import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.*;

/** 
 * JTable的例子 
 */
public class Test extends JFrame {
	
    private JFrame frame = null;

    private JTable table = null;

    private Table_Model model = null;

    private JScrollPane s_pan = null;
//    public void choose(){
//    	
//    	JButton one=new JButton("正在上映");
//    	JPanel panel=new JPanel();
//    	panel.add(one);
//    	panel.setLayout(null);
//    	one.setBounds(0,100,100,30);
//    }
    public void Test() {

    	
    	
        frame = new JFrame("剧院管理系统--选票界面");
        
        ImageIcon backgroundimg = new ImageIcon("6.jpg");

     
        model = new Table_Model(40);
        table = new JTable(model);
        table.setRowHeight(40);
        String[] age = { "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
        JComboBox com = new JComboBox(age);
        TableColumnModel tcm = table.getColumnModel();
        tcm.getColumn(2).setCellEditor(new DefaultCellEditor(com)); // 设置某列采用JComboBox组件 


        model.addRow("西安奥斯卡", "20", "30",false);
        model.addRow("西安万达国际影城", "30", "21",false);
        model.addRow("中国国际影院", "40", "24",false);
        model.addRow("西安奥斯卡", "20", "30",false);
        model.addRow("西安万达国际影城", "30", "21",false);
        model.addRow("中国国际影院", "40", "24",false);
        model.addRow("西安奥斯卡", "20", "30",false);

        
        s_pan = new JScrollPane(table);
        s_pan.setBounds(0, 40, 700, 500);;

        frame.getContentPane().add(s_pan, BorderLayout.CENTER);
        
        frame.setSize(700, 500);
        frame.setVisible(true);

        //model.addRow(2); // 在某处插入一空行 

        //table.updateUI(); // 刷新 
        
//        JPanel contentPane=new JPanel( );
//        contentPane.setBounds(7);
//        frame.setContentPane(contentPane);
       
        JButton b1=new JButton("确定");
        b1.setContentAreaFilled(true);
        b1.setBounds(0,0,100,40);
        s_pan.add(b1);
     

    }

//    public static void main(String args[]) {
//        new Test();
//    }

}

class Table_Model extends AbstractTableModel {
    private static final long serialVersionUID = -3094977414157589758L;

    private Vector content = null;

    private String[] title_name = { "剧院名称", "价格", "场次","选择" };

    public Table_Model() {
        content = new Vector();
    }

    public Table_Model(int count) {
        content = new Vector(count);
    }

    /** 
     * 加入一空行 
     * @param row 行号 
     */
    public void addRow(int row) {
        Vector v = new Vector(4);
        v.add(0, null);
        v.add(1, null);
        v.add(2, null);
        v.add(3,null);
        content.add(row, v);
    }

    /** 
     * 加入一行内容 
     */
    public void addRow(String name, String  t, String age,boolean f) {
        Vector v = new Vector(4);
        v.add(0, name);
        v.add(1,t ); // JCheckBox是Boolean的默认显示组件，这里仅仅为了看效果，其实用JComboBox显示***更合适 

        v.add(2, age); // 本列在前面已经设置成了JComboBox组件，这里随便输入什么字符串都没关系 
        v.add(3,f);
        content.add(v);
    }

    public void removeRow(int row) {
        content.remove(row);
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return true;
    }

    public void setValueAt(Object value, int row, int col) {
        ((Vector) content.get(row)).remove(col);
        ((Vector) content.get(row)).add(col, value);
        this.fireTableCellUpdated(row, col);
    }

    public String getColumnName(int col) {
        return title_name[col];
    }

    public int getColumnCount() {
        return title_name.length;
    }

    public int getRowCount() {
        return content.size();
    }

    public Object getValueAt(int row, int col) {
        return ((Vector) content.get(row)).get(col);
    }

    public Class getColumnClass(int col) {
        return getValueAt(0, col).getClass();
    }

}

 