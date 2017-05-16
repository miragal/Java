package first;

public class SumArea {
	public static double Sum(GeometricObject[] a){
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i].getArea();
			System.out.println(a[i].getArea());
		}
		return sum;
	}
	public static void main(String[] args){
		GeometricObject[] a={	
				new Circle(1.0),
				new Circle(2.0),
				new Rectangle(2.0,3.0),
				new Rectangle(6.0,3.0)
				
		};
		System.out.println(Sum(a));
	}
}
