package first;
import java.util.*;;
public class MaxClass {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String[] s=new String[5];
		Integer[] a=new Integer[5];
		for(int i=0;i<5;i++)
			s[i]=in.nextLine();
		for(int i=0;i<5;i++)
			a[i]=in.nextInt();
		System.out.println("Max string is "+max(s));
		System.out.println("Max Integer is "+max(a));
	}

	public static Object max(Comparable[] s) {
		Arrays.sort(s);
		return s[s.length-1];
	}
}
