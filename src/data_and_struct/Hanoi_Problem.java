package data_and_struct;
import java.util.Scanner;
public class Hanoi_Problem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("���������Ӹ�����");
		int n=in.nextInt();
		hanoi(n,1,2,3);
	}
	public static void hanoi(int n,int a,int b,int c){
		if(n==1)
			System.out.println("���Ӵ�"+a+"�Ƶ�"+c);
		else{
			hanoi(n-1,a,c,b);
			System.out.println("���Ӵ�"+a+"�Ƶ�"+c);
			hanoi(n-1,b,a,c);
		}
	}
}
