package my_finaltest;
import java.util.Scanner;
public class CharOccuresTimes {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		Character c=s1.charAt(0);
		System.out.print("The number of occurrences is "+count(s,c)+".");
		
	}
	public static int count(String str, char a){
		int i,count=0;
		for(i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c==a)	count++;
		}
		return count;
	}
}
