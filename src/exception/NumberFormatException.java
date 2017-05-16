package exception;
import java.math.BigInteger;
import java.util.*;
public class NumberFormatException {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] c=s.split("\\D");	//所有非数字的字符
		BigInteger a=new BigInteger(c[0]);
		BigInteger b=new BigInteger(c[1]);
		int t=0;
		if(s.indexOf("+")!=-1)	t=1;
		if(s.indexOf("-")!=-1)	t=2;
		if(s.indexOf("*")!=-1)	t=3;
		if(s.indexOf("/")!=-1)	t=4;
		switch(t){
		case 1:	System.out.println(a+"+"+b+"="+a.add(b));break;
		case 2: System.out.println(a+""+b+"="+a.subtract(b));break;
		case 3: System.out.println(a+"*"+b+"="+a.multiply(b));break;
		case 4: System.out.println(a+"/"+b+"="+a.divide(b));break;
		default: System.out.println("Wrong input!");
		}
	}
}
