package my_finaltest;

public class Substirng {
	public static void main(String[] args){
		String s="C:/cat1/cat2/Person.java";
		String ss=s.substring(s.lastIndexOf(".")+1);
		System.out.println(ss);

		String s1=s.substring(s.lastIndexOf("/")+1);
		System.out.println(s1);
		
		String s2=s.substring(0, s.lastIndexOf("/")+1);
		System.out.println(s2);
	}
}
