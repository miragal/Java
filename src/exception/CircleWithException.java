package exception;

public class CircleWithException {
	private double raduis;
	private static int numberOfObjects=0;
	public CircleWithException(){
		this(1.0);
	}
	public CircleWithException(double newRaduis){
		setRaduis(newRaduis);
		numberOfObjects++;
	}
	
	public double getRaduis(){
		return raduis;
	}
	private void setRaduis(double newRaduis)throws IllegalArgumentException {
		// TODO 自动生成的方法存根
		if(newRaduis>=0)	raduis=newRaduis;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	public double finArea(){
		return raduis*raduis*3.14;
	}
}
