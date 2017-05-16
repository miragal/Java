package string;
import java.util.Scanner;
public class Reyouwithwe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s,s1="you",s2="we",ss="";
		while((s=in.nextLine())!=null){
			ss=s.replaceAll(s1, s2);
			System.out.println(ss);
		}
	}
}
