package task;
//С�ͳ��й���ϵͳ�������û���¼���û��������
import java.util.*;

class User{
	String name;
	String password;
	int money=100;
	int tag=0;
	void setName(String name){
		this.name=name;
	}
	void setPassword(String password){
		this.password=password;
	}
}

class Goods{
	int num;	//���
	String name;	//����
	int amount; 	//����
	double price; 	//����
	Goods(int num,String name,int amount,double price){
		this.num=num;
		this.name=name;
		this.amount=amount;
		this.price=price;
	}
	void show(){
		System.out.println(num+"\t"+name+"\t"+amount+"\t"+price);
	}
}

public class Market {
	Scanner in=new Scanner(System.in);
	public void Sign(User user){
		String name,password;
		System.out.println("�������û�����");
		name=in.next();
		System.out.println("���������룺");
		password=in.next();
		user.setName(name);
		user.setPassword(password);
		System.out.println("ע��ɹ���");
	}
	public void Login(User user){
		String name=null,password=null;
		while(true){
				System.out.println("�������û�����");
				name=in.next();
				System.out.println("���������룺");
				password=in.next();
				if(user.name.equals(name)&&user.password.equals(password)){
					System.out.println("��¼�ɹ���");
					user.tag=1;
					break;
				}
				else System.out.println("�û���������������������룺");
		}
	}
	public void print(){
		System.out.println("\t\t��ӭ�������ӳ���");
		System.out.println("1.�û�ע��");
		System.out.println("2.�û���¼");
		System.out.println("3.�û�����(Ĭ���û���100Ԫ��");
		System.out.println("0.�˳�");
		System.out.println("��ѡ��");
	}
	public void show(Goods[] goods){
		//���
		System.out.println("������ϢΪ��\n���\t����\t���\t����");
		for(int i=0;i<5;i++)
				goods[i].show();
	}
	public void buy(Goods[] goods,User user){
		if(user.tag==0){
			System.out.println("��δע�ᣬ��ע�ᣡ");
			return;
		}
		show(goods);
		int[] a=new int[5];	//Ҫ�������Ʒ�������
		int[] b=new int[5];	//��Ӧ�ĸ�������
		String c;
		int i=0;
		while(true){
			System.out.println("������Ҫ�������Ʒ��ţ�");
			int num=in.nextInt();
			System.out.println("�����빺������:");
			int amount=in.nextInt();
			//������
			goods[num-1].amount-=amount;
			a[i]=num;
			b[i++]=amount;
			System.out.println("�Ƿ�������򣿣���y���ǣ���n�����ǣ�");
			c=in.next();
			if(c.equals("n"))	break;
		}
		double s=0;
		for(int j=0;j<i;j++){
			s=s+(goods[a[j]-1].price)*b[j];
		}
		System.out.printf("�ܼ�:%.2fԪ��\n",s);
		if(user.money>=s){
			System.out.println("ȷ��֧��������y���ǣ���n�����ǣ�");
			String l=in.next();
			if(l.equals("y")){
				System.out.println("֧���ɹ���");
				System.out.println("���������Ϊ��"+(user.money-s));
			}
			else System.out.println("ȡ��֧��");
		}
		else System.out.print("�������㣬���ֵ��");
	}
}
