package first;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two point x1,y1,x2,y2");
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double Distance;
		Distance = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
		System.out.println("The Distance is "+Distance);
	}
}