package bigInteger;
import java.math.*;
import java.util.*;
public class LargeFactorial {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(factorial(n));
	}

	public static BigInteger factorial(int n) {
		BigInteger result=BigInteger.ONE;
		for(int i=1;i<=n;i++)
			result=result.multiply(new BigInteger(i+""));
		return result;
	}
}
