package prime;
import java.util.Scanner;
import java.math.*;
public class CountPrime {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n,j,s=0;
		BigInteger x;
		System.out.println("Please input x and n:");
		x=in.nextBigInteger();
		n=in.nextInt();
		while(s<n){
			if(x.isProbablePrime(100)){
				System.out.println(x);
				s++;
			}
			x=x.nextProbablePrime();
		}
	}
}
