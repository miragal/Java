package task;

import java.util.*;
public class Problem5 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("请输入一个数：");
		n=in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=0;j<i;j++)
				System.out.print(i);
			System.out.print("\n");
		}	
	}
}
