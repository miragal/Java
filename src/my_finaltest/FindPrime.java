package my_finaltest;
import java.math.BigInteger;
import java.util.*;
public class FindPrime {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		BigInteger big;
		int n,cnt=0;
		big=in.nextBigInteger();
		n=in.nextInt();
		while(cnt<n){
			if(big.isProbablePrime(100)){
				System.out.println(big);
				cnt++;
			}
			big=big.nextProbablePrime();
		}
	}
}
