package my_finaltest;
import java.util.*;
public class Prefix_twostirng {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String s1=in.next();
			String s2=in.next();
			String s="";
			s=prefix(s1,s2,s);
			if(s.equals(""))	
			System.out.println("No common prefix");
			else System.out.println("The common prefix is "+s);
		}
	}

	private static String prefix(String s1, String s2, String s) {
		for(int i=0;i<s1.length()&&i<s2.length();i++)
				if(s1.charAt(i)==s2.charAt(i))
					s+=s1.charAt(i);
				else break;
		return s;
	}
}
