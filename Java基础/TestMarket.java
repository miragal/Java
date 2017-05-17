package task;

import java.util.Scanner;

public class TestMarket {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		User user=new User();
		Goods[] goods=new Goods[5];
		goods[0]=new Goods(1,"苹果",20,3.5);
		goods[1]=new Goods(2,"橘子",20,2.0);
		goods[2]=new Goods(3,"桃子",20,4.5);
		goods[3]=new Goods(4,"菠萝",20,5.0);
		goods[4]=new Goods(5,"葡萄",20,4.0);
		Market m=new Market();
		while(true){
			m.print();
			int n=in.nextInt();
			switch(n){
				case 1:m.Sign(user);break;
				case 2:m.Login(user);break;
				case 3:m.buy(goods,user);break;
				case 0:
					System.out.println("欢迎光临！希望下次再来>_<");
					System.exit(0);break;
				default:System.out.println("输入有误，请重新选择！");
			}	
		}
		
	}
}
