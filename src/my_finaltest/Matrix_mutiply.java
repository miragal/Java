package my_finaltest;
import java.util.*;
public class Matrix_mutiply {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[][] a=new double[3][2];
		double[][] b=new double[2][3];
		int i,j;
		System.out.println("please input MatirxA elements:\n");
		for(i=0;i<3;i++)
				for(j=0;j<2;j++)
						a[i][j]=in.nextDouble();
		System.out.println("please input MatirxB elements:\n");
		for(i=0;i<2;i++)
			for(j=0;j<3;j++)
					b[i][j]=in.nextDouble();
		double[][] c=MultipMatrix(a,b);
		System.out.println("A*B:");
		for(i=0;i<c.length;i++){
			for(j=0;j<c[0].length;j++)
					System.out.print(c[i][j]+"\t");
			System.out.println();
		}
	}

	private static double[][] MultipMatrix(double[][] a, double[][] b) {
		double[][] c=new double[a.length][b[0].length];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b[0].length;j++){
				c[i][j]=0;
				 for(int k=0;k<a[0].length;k++)
					 c[i][j]+=a[i][k]*b[k][j];
			}
		return c;
	}
}
