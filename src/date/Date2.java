package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date2 {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
		long l=in.nextLong();
		d.setTime(l);
		System.out.print(s.format(d));
	}
}
