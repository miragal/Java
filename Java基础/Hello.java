package task;

import java.util.*;
public class Hello {
	public static void main(String[] args){
		//System.out.print("hello");
		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		switch(n/10){
//		case 10:
//		case 9:System.out.println("���㣡");break;
//		case 8:System.out.println("����");break;
//		case 7:
//		case 6:System.out.println("����");break;
//		default:System.out.println("������");
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
