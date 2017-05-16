package string;
import java.math.BigInteger;
import java.util.*;
public class StringSplit {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String [] ob=str.split("\\D");
		BigInteger l=new BigInteger(ob[0]);
		BigInteger r=new BigInteger(ob[1]);
		if(str.indexOf('+')!=-1)
			System.out.print(l.add(r));
		if(str.indexOf('-')!=-1)
			System.out.print(l.subtract(r));
		if(str.indexOf('*')!=-1)
			System.out.print(l.multiply(r));
		if(str.indexOf('/')!=-1)
			System.out.print(l.divide(r));
	}
}
