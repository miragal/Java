package prime;
import java.util.*;
public class JundgePrime {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x,i;
		x=in.nextInt();
		for(i=2;i<x;i++)
			if(x%i==0)	{
				System.out.println(false);
				break;
			}
		if(x==i)	System.out.println(true);
	}
}
