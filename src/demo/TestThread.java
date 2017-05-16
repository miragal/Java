package demo;

public class TestThread {
	public static void main(String[] args){
		Thread t1=new Thread(new T1(),"Thread A");
		Thread t2=new Thread(new T2(),"Thread b");
		t1.start();
		t2.start();
	}
}
class T1 implements Runnable{
	public void run(){
		System.out.println("Thread A");
	}
}
class T2 implements Runnable{
	public void run(){
		System.out.println("Thread B");
	}
}