package my_finaltest;
import java.util.*;
public class Max_Class {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String[] a=new String[5];
		Integer[] b=new Integer[5];
		for(int i=0;i<5;i++)
			a[i]=in.nextLine();
		for(int i=0;i<5;i++)
			b[i]=in.nextInt();
		System.out.println("Max string is "+max(a));
		System.out.println("Max integer is "+max(b));
	}
	public static Object max(Comparable[] a){
		Arrays.sort(a);
		return a[a.length-1];
	}
}
