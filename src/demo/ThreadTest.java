package demo;

public class ThreadTest {
	public static void main(String[] args){
		Thread t=Thread.currentThread();
		t.setName("MyThread");
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getThreadGroup().getName());
	}
}
