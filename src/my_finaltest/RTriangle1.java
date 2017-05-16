package my_finaltest;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RTriangle1 implements IShape1{
	private double a,b;
	RTriangle1(double a,double b){
		this.a=a;
		this.b=b;
	}
	public double getArea() {
		return a*b/2;
	}
	public double getPerimeter() {
		return a+b+Math.sqrt(a*a+b*b);
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		DecimalFormat a=new DecimalFormat("#.####");
		double x=in.nextDouble();
		double y=in.nextDouble();
		RTriangle r=new RTriangle(x,y);
		System.out.println(a.format(r.getArea()));
		System.out.println(a.format(r.getPerimeter()));
	}
}

interface IShape1 {
	public abstract double getArea();
	public abstract double getPerimeter();
}