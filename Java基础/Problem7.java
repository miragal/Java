package task;

import java.util.Arrays;

public class Problem7 {
	public static void main(String[] args){
		int[] a=new int[10];
		for(int i=0;i<10;i++)
			a[i]=(int)(Math.random()*100+1);
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i+" ");
		double s=0;
		for(int i=1;i<9;i++)
			s+=a[i];
		System.out.print("\n平均分为："+s/8);
	}
}
