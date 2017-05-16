package first;
import java.*;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape1{
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle2 extends shape1{
	private double radius;
	Circle2(){
		radius=0;
	}
	Circle2(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
class Rectangle2 extends shape1 {
	private double width;
	private double height;
	public Rectangle2(){
		width=0;
		height=0;
	}
	public Rectangle2(double width,double height){
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
}
public class AreaSum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double r1=in.nextDouble();
		double r2=in.nextDouble();
		double a1=in.nextDouble();
		double b1=in.nextDouble();
		double a2=in.nextDouble();
		double b2=in.nextDouble();
		shape1[] a={
				new Circle2(r1),
				new Circle2(r2),
				new Rectangle2(a1,b1),
				new Rectangle2(a2,b2)
		};
		System.out.printf("the total are %.4lf"+Sum(a));
	}
	public static double Sum(shape1[] a){
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i].getArea();
		}
		return sum;
	}
}
