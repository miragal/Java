package line;

public class Test2 implements Runnable {
	public static void main(String[] args){
		new Test2();
	}
	public Test2(){
		Thread t=new Thread(this);
		t.start();
	}
	public void run(){
		System.out.println("test2");
	}
}
