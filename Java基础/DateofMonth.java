package task;
import java.util.*;
public class DateofMonth {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] a={31,28,31,30,31,30,31,30,31,31,30,31};
		int[] b={31,29,31,30,31,30,31,30,31,31,30,31};
		int year,month;
		System.out.print("��������ݣ�");
		year=in.nextInt();
		System.out.print("�������·ݣ�");
		month=in.nextInt();
		if(year%4==0&&year%100!=0||year%400==0)
			System.out.println(year+"�� "+month+"���У�"+b[month-1]+"��");
		else
			System.out.println(year+"�� "+month+"���У�"+a[month-1]+"��");
	}
}
