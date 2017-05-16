package my_finaltest;
import java.util.*;
public class Reverse_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuffer sbf=new StringBuffer(s);
		StringBuffer ss=sbf.reverse();
		System.out.println(ss.toString());
	}
}
