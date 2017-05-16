package first;
import java.*;
import java.text.DecimalFormat;
import java.util.Scanner;
abstract class shape{
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Five extends shape{
	private double side;
	public Five(double side){
		this.side=side;
	}
	public double getArea(){
		return 5*side;
	}
	public double getPerimeter(){
		return 0.25*side*side*Math.sqrt(25+10*Math.sqrt(5));
	}
}
public class FiveShape{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		DecimalFormat de=new DecimalFormat("#.####");
		double a=in.nextDouble();
		Five gon=new Five(a);
		System.out.println(de.format(gon.getPerimeter()));
		System.out.println(de.format(gon.getArea()));
	}
}
