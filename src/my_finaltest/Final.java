package my_finaltest;
import java.util.Scanner;

class Student{
	private String name;
	private int grade;
	Student(){
	}
	Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	public int getGrade(){
		return grade;
	}
	public String getName() {
		return name;
	}
}
public class Final{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in); 
		int i,j;
		Student[] st=new Student[1000];
		String s,ss;
		int g;
		i=0;
		while(true){
			ss=in.next();
			g=in.nextInt();
			st[i++]=new Student(ss,g);
			if(ss.equals("noname"))	break;
		}
		s=in.nextLine();
		for(j=0;j<i;j++){
			System.out.println(st[j].getName()+" "+st[j].getGrade());
			if(st[j].getName().equals(s))	break;
		}
		if(i==j)	System.out.print("Not found");
		else System.out.printf("%.2f", st[i].getGrade()*0.21);
	}
}
