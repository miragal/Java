/*
 目的：洗牌-发牌的过程
 0-12 梅花
 13-25 方块
 26-38 红桃
 39-51 黑桃
 */

package data_and_struct;
import java.io.*;
public class Stack_test {
	static int top=-1;
	public static void main(String[] args){
		int[] card=new int[52];
		int[] stack=new int[52];
		int i,j,k=0,test;
		char ascVal='H';
		int style;
		for(i=0;i<52;i++)
			card[i]=i;
		System.out.println("洗牌中……请稍后!");
		while(k<30){
			for(i=0;i<51;i++){
				for(j=i+1;j<52;j++){
					if((int)Math.random()*5==2){
						test=card[i]; //洗牌
						card[i]=card[j];
						card[j]=test;
					}
				}
			}
			k++;
		}
		i=0;
		while(i!=52){
			push(stack,52,card[i]);	//将52张牌放入堆栈
			i++;
		}
		System.out.println("逆时针发牌");
		System.out.println("显示各家的牌\n东家 \t北家\t西家\t南家");
		System.out.println("====================================");
		while(top>=0){
			style=stack[top]/13;
			switch(style){
			case 0: ascVal='C';break;
			case 1: ascVal='D';break;
			case 2: ascVal='H';break;
			case 3: ascVal='S';break;
			}
			System.out.print(ascVal+""+(stack[top]%13+1));
			System.out.print('\t');
			if(top%4==0)
				System.out.println();
			top--;
		}
	}
	public static void push(int[] stack, int max, int val) {
		// TODO 自动生成的方法存根
		if(top>=max)
			System.out.println("已经满了");
		else{
			top++;
			stack[top]=val;
		}
		
	}
	public static int pop(int[] stack){
		if(top<0)
			System.out.println("已经空了");
		else top--;
		return stack[top];
	}
}
