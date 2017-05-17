//ผฆอรอฌมý
package task;

public class Problem1 {
	public static void main(String[] args){
	for(int i=0;i<36;i++)
		for(int j=0;j<24;j++)
				if(i+j==35&&2*i+4*j==94){
					System.out.println("ผฆฃบ"+i+" "+"อร"+j);
				}
	}
}
