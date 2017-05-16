package string;
import java.util.*;
public class Replace {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String temp;
		while(in.hasNextLine()){
			temp=in.nextLine();
			if(temp.equals("end"))
				break;
			s=s+'\n'+temp;
		}
		String str1=in.nextLine();
		String str2=in.nextLine();
		String newstr=s.replaceAll(str1,str2);
		System.out.println(newstr);
		
		/*
		String s=in.nextLine();
		String end=in.nextLine();
		String s1=in.nextLine();
		String s2=in.nextLine();
		String l="";
		if(end.equals("end"))
			l=s.replaceAll(s1, s2);
		System.out.println(l);
		*/
	}
}
