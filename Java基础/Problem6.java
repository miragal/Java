package task;

public class Problem6 {
	public static void main(String[] args){
		int s=0;
		for(int i=1;i<100;i+=2)
			s+=i;
		System.out.println("1+3+...+99="+s);
		int t=0;
		for(int i=0;i<=8;i++){
			System.out.print(Math.pow(2, i)+" ");
			t+=Math.pow(2, i);
		}
		System.out.println("\n1+2+4+...+128+256="+t);
	}
}
