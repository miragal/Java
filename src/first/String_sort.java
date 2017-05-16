package first;
import java.util.*;
public class String_sort {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char[] a=s.toCharArray();
		Arrays.sort(a);
		System.out.print(new String(a));
	}
}
