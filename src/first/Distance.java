package first;
import java.util.*;
public class Distance {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double a,b,c,d;
		a=in.nextDouble();b=in.nextDouble();
		c=in.nextDouble();d=in.nextDouble();
		System.out.printf("The distance is %.2f",Math.sqrt((a-c)*(a-c)+Math.pow(b-d,2)));
	}
}
