package task;

import java.util.*;
public class Problem4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] a=new double[5];
		int i;
		String name="小明";
		System.out.println("请输入5门成绩:");
		for(i=0;i<5;i++)
			a[i]=in.nextDouble();
		double sum=0;
		for(i=0;i<5;i++)
			sum+=a[i];
		System.out.println("姓名："+name+" 总成绩："+sum+" 平均分："+sum/5);
	}
}
