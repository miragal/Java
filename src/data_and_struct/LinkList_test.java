//链表的基本操作

package data_and_struct;
import java.util.*;
public class LinkList_test {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		LinkedList l=new LinkedList();
		System.out.println("请输入5个数");
		int x;
		for(int i=0;i<5;i++){
			x=in.nextInt();
			l.insert(x);
		}
		System.out.println("输出为：");
		l.print();
	}
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class LinkedList{
	private Node first;
	private Node last;
	public boolean IsEmpty(){
		return first==null;
	}
	public void print(){
		Node t;
		for(t=first;t!=null;t=t.next)
			System.out.print(t.data+" ");
		System.out.println();
	}
	public void insert(int data){
		Node t=new Node(data);
		if(this.IsEmpty())
			first=last=t;
		else last=last.next=t;
		
	}
}
