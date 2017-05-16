package bigInteger;
import java.util.Scanner;
import java.math.BigInteger;
public class BigDivide {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String l=in.nextLine();
		BigInteger op=new BigInteger(l);
		BigInteger bigNum=new BigInteger(Long.MAX_VALUE+"");
		bigNum=bigNum.add(BigInteger.ONE);
		int count=1;
		while(count<=3){
			if(bigNum.remainder(op).equals(BigInteger.ZERO)){
				System.out.print(bigNum);
				System.out.println();
				count++;
			}
			bigNum=bigNum.add(BigInteger.ONE);
		}
		in.close();
	}
}
