package exception;
import java.util.Scanner;
public class QuotientwithException {
	public static int quotient(int n1,int n2){
		if(n2==0)
			throw new ArithmeticException("Divisor cannot be zero");
		return n1/n2;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("please input two integers:");
		int n1=in.nextInt();
		int n2=in.nextInt();
		try{
			int result=quotient(n1,n2);
			System.out.println(n1+"/"+n2+"="+n1/n2);
		}
		catch(ArithmeticException ex){
			System.out.println("Exception:an integer cannot be divided by zero.");
		}
	}
}
