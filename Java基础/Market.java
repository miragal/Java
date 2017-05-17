package task;
//小型超市管理系统，包括用户登录，用户购买货物
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
	int num;	//编号
	String name;	//名称
	int amount; 	//数量
	double price; 	//单价
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
		System.out.println("请输入用户名：");
		name=in.next();
		System.out.println("请输入密码：");
		password=in.next();
		user.setName(name);
		user.setPassword(password);
		System.out.println("注册成功！");
	}
	public void Login(User user){
		String name=null,password=null;
		while(true){
				System.out.println("请输入用户名：");
				name=in.next();
				System.out.println("请输入密码：");
				password=in.next();
				if(user.name.equals(name)&&user.password.equals(password)){
					System.out.println("登录成功！");
					user.tag=1;
					break;
				}
				else System.out.println("用户名或密码错误，请重新输入：");
		}
	}
	public void print(){
		System.out.println("\t\t欢迎光临柚子超市");
		System.out.println("1.用户注册");
		System.out.println("2.用户登录");
		System.out.println("3.用户购物(默认用户有100元）");
		System.out.println("0.退出");
		System.out.println("请选择：");
	}
	public void show(Goods[] goods){
		//输出
		System.out.println("货物信息为：\n编号\t名称\t库存\t单价");
		for(int i=0;i<5;i++)
				goods[i].show();
	}
	public void buy(Goods[] goods,User user){
		if(user.tag==0){
			System.out.println("还未注册，请注册！");
			return;
		}
		show(goods);
		int[] a=new int[5];	//要购买的物品编号数组
		int[] b=new int[5];	//对应的个数数组
		String c;
		int i=0;
		while(true){
			System.out.println("请输入要购买的物品编号：");
			int num=in.nextInt();
			System.out.println("请输入购买数量:");
			int amount=in.nextInt();
			//库存减少
			goods[num-1].amount-=amount;
			a[i]=num;
			b[i++]=amount;
			System.out.println("是否继续购买？（“y”是，“n”不是）");
			c=in.next();
			if(c.equals("n"))	break;
		}
		double s=0;
		for(int j=0;j<i;j++){
			s=s+(goods[a[j]-1].price)*b[j];
		}
		System.out.printf("总计:%.2f元。\n",s);
		if(user.money>=s){
			System.out.println("确认支付？（“y”是，“n”不是）");
			String l=in.next();
			if(l.equals("y")){
				System.out.println("支付成功！");
				System.out.println("您可用余额为："+(user.money-s));
			}
			else System.out.println("取消支付");
		}
		else System.out.print("可用余额不足，请充值！");
	}
}
