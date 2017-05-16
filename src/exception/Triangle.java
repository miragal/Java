package exception;

import java.util.Scanner;

class IllegalTriangleException1 extends Exception{
	private double a;
	private double b;
	private double c;
	IllegalTriangleException1(){
		super("error triangle");
	}
	IllegalTriangleException1(double a,double b,double c){
			this.a=a;
			this.b=b;
			this.c=c;
	}
	public String getMessage(){
		return a+" "+b+" and "+c+" cannot construct a triangle.";
	}
}

public class Triangle {
	private double a;
	private double b;
	private double c;
	Triangle(){
		a=0;
		b=0;
		c=0;
	}
	Triangle(double a,double b,double c)
	throws IllegalTriangleException{
		if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a)	throw new IllegalTriangleException(a,b,c);
		else{
			this.a=a;
			this.b=b;
			this.c=c;
		}
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getArea()
	{
		return a+b+c;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("please input three sides:");
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		try{
			Triangle s=new Triangle(a,b,c);
			System.out.println("this triangle's area is :"+s.getArea());
		}
		catch(IllegalTriangleException ex){
			System.out.println(ex.getMessage());
		}
	}
}