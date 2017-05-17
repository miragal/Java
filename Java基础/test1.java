package task;

import java.util.*;
public class test1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n=in.nextInt();
		int s=0,t=n;
		while(n!=0){
			s+=n%10;
			n/=10;
		}
		System.out.println(t+"的各个位上数之和为："+s);
	}
}
