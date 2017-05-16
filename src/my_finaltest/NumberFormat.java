package my_finaltest;

import java.util.Scanner;

public class NumberFormat {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String a,b;
		while(true){
			try{
				a=in.next();
				b=in.next();
				if(Integer.valueOf(a) instanceof Integer&&Integer.valueOf(b) instanceof Integer){
					System.out.println("Sum is "+(Integer.valueOf(a)+Integer.valueOf(b)));
					break;
				}	
			}
			catch(Exception e){
				System.out.println("Incorrect input and re-enter two integers:");
			}
		}
	}
}
