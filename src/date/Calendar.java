package date;

import java.util.GregorianCalendar;
import java.util.Scanner;
public class Calendar {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in); 
		GregorianCalendar gc = new GregorianCalendar();
		 long time=in.nextLong();
		 gc.setTimeInMillis(time);
		 System.out.print(gc.get( GregorianCalendar.YEAR)+"-");
		 System.out.print(gc.get( GregorianCalendar.MONTH)+"-");
		 System.out.print(gc.get( GregorianCalendar.DAY_OF_MONTH));
	}
}
