package task;

import java.util.*;
public class Hello {
	public static void main(String[] args){
		//System.out.print("hello");
		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		switch(n/10){
//		case 10:
//		case 9:System.out.println("优秀！");break;
//		case 8:System.out.println("良！");break;
//		case 7:
//		case 6:System.out.println("及格！");break;
//		default:System.out.println("不及格！");
//		}
		int[][] a={{1,2,3},{3,5},{5}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		//System.out.println(sizeof(a));
		Arrays.sort(a);
	}
}
