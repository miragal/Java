package line;

public class Test1 implements Runnable{
	public static void main(String[] args){
		new Test1();
		Test1 task=new Test1();
		new Thread(task).start();
	}
	public void run(){
		System.out.println("test1");
	}
}
