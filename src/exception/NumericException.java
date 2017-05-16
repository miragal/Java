package exception;

import java.util.Scanner;

public class NumericException {
	public static boolean IsNumberic(String token){
		try{
			Double.parseDouble(token);
			return true;
		}
		catch(java.lang.NumberFormatException ex){
			ex.printStackTrace();
			System.out.println(ex);
			return false;
		}
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(IsNumberic(s));
	}
}
