package task;

import java.util.*;
public class Problem4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] a=new double[5];
		int i;
		String name="С��";
		System.out.println("������5�ųɼ�:");
		for(i=0;i<5;i++)
			a[i]=in.nextDouble();
		double sum=0;
		for(i=0;i<5;i++)
			sum+=a[i];
		System.out.println("������"+name+" �ܳɼ���"+sum+" ƽ���֣�"+sum/5);
	}
}
