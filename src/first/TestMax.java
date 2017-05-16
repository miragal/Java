package first;

abstract class GeometricObject1 implements Comparable {
	private String color="while";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject1(){
		dateCreated=new java.util.Date();
	}
	protected GeometricObject1(String color,boolean filled){
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "Created on "+dateCreated +"\ncolor: "+color+" and filled: "+filled;
	}
	public abstract double getArea();
	
	public abstract double getPerimeter();

	
	public int compareTo(GeometricObject1 o){
		if(getArea()>((GeometricObject1)o).getArea())
			return 1;
		else if(getArea()<((GeometricObject1)o).getArea())
			return -1;
		else return 0;
	}
}

class Circle1 extends GeometricObject1{
	private double radius;
	Circle1(){
	}
	Circle1(double radius){
		this.radius=radius;
	}
	Circle1(double radius,String color,boolean filled){
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getDiameter(){
		return 2*radius;
	}
	public void printCircle(){
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}

class Rectangle1 extends GeometricObject1{
	private double width;
	private double height;
	public Rectangle1(){
	}
	public Rectangle1(double width,double height){
		this.width=width;
		this.height=height;
	}
	public Rectangle1(double width,double height,String color,boolean filled){
		this.height=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
}

public class TestMax{
	public static GeometricObject1 max(GeometricObject1 a,GeometricObject1 b){
		return a.compareTo(b)>=0?a:b;
	}
	public static void main(String[] args){
		Circle1 c1=new Circle1(3);
		Circle1 c2=new Circle1(5);
		Circle1 c=(Circle1) max(c1,c2);
		System.out.println(c.getRadius());
		System.out.println(((Circle1)c).toString());
		System.out.println("Area: "+c.getArea()+" Primeter: "+c.getPerimeter());
	}
}