package my_finaltest;

interface ClassName{
	public abstract void getClassName();
}

class Company implements ClassName{
	public void getClassName() {
		System.out.println(Company.class.getSimpleName().toString());
	}
}

public class Company1{
	public static void main(String[] args){
		Company c=new Company();
		c.getClassName();
	}
}