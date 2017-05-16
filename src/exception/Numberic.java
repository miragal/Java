package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numberic {
	public static boolean IsNumberic(String a){
		return a.matches("[0-9]+");
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(IsNumberic(s));
	}
}


