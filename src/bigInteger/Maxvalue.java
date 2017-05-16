package bigInteger;
/*
import java.util.*;
public class Maxvalue {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		long x=Long.MAX_VALUE;
		int n,s=0;
		n=in.nextInt();
		for(long i=x;;i++){
			if(i%n==0){
				System.out.println(i);
				s++;
			}
			if(s==2) break;
		}
	}
}
*/
import java.util.*;
import java.math.BigInteger;
public class Maxvalue {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		BigInteger n2=new BigInteger(String.valueOf(n));
		BigInteger s=new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger t=BigInteger.ONE;
		boolean temp=true;
		int count=0;
		BigInteger k=BigInteger.ONE;
		while(temp)
		{
			s=s.add(t);
			k=s.remainder(n2);
			if(k==BigInteger.ZERO)
			{
				count++;
				System.out.println(s);
			}	
			if(count==2)
				break;
		}
		
	}
}
