package task;

public class Problem2 {
	public static void main(String[] args){
		int s=0;
		for(int i=3;i<=100;i++){
			if(i%3==0||i%5==0||i%3==0&&i%5==0){
				s+=i;
				System.out.print(i+" ");
			}
		}
		System.out.print("sum="+s);
	}
}
