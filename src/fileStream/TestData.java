package fileStream;
import java.io.*;
public class TestData {
	public static void main(String[] args){
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("Exercise.dat"));
			dos.writeInt(10);
			dos.writeInt(20);
			dos.writeInt(30);
			DataInputStream dis=new DataInputStream(new FileInputStream("Exercise.dat"));
			int sum=0,x;
			while(dis.available()>0){
				x=dis.readInt();
				sum+=x;
			}
			System.out.println("sum is "+sum);
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
