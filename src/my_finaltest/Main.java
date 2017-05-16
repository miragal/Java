package my_finaltest;

import java.util.Scanner;
import java.text.DecimalFormat;

class RTriangle implements IShape{
	private double a,b;
	RTriangle(){
		a=0;
		b=0;
	}
	RTriangle(double a,double b){
		this.a=a;
		this.b=b;
	}
	public double getArea() {
		return a*b/2;
	}
	public double getPerimeter() {
		return a+b+Math.sqrt(a*a+b*b);
	}
}
public class Main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		DecimalFormat a=new DecimalFormat("#.####");
		double x=in.nextDouble();
		double y=in.nextDouble();
		RTriangle r=new RTriangle(x,y);
		System.out.println(a.format(r.getArea()));
		System.out.println(a.format(r.getPerimeter()));
		in.close();
	}
}

interface IShape {
	public abstract double getArea();
	public abstract double getPerimeter();
}