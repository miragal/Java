package task;

import java.util.*;
public class test1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������");
		int n=in.nextInt();
		int s=0,t=n;
		while(n!=0){
			s+=n%10;
			n/=10;
		}
		System.out.println(t+"�ĸ���λ����֮��Ϊ��"+s);
	}
}
