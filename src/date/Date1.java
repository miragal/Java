package date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Date1 {
	public static void main(String[] args){
		Date date=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		Scanner in=new Scanner(System.in);
		long time=in.nextLong();
		int days=in.nextInt();
		date.setTime(time);
		System.out.println(sdf1.format(date));
		System.out.print(sdf1.format(time+(long)days*24*3600*1000));
	}
}
