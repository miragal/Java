package exception;
import java.util.*;
public class IllegalTriangleException extends Exception{
	private double a;
	private double b;
	private double c;
	IllegalTriangleException(){
		super("error triangle");
	}
	IllegalTriangleException(double a,double b,double c){
			this.a=a;
			this.b=b;
			this.c=c;
	}
	public String getMessage(){
		return a+" "+b+" and "+c+" cannot construct a triangle.";
	}
}
