package fileStream;
import java.io.*;
public class TestDataSteam {
	public static void main(String[] args) throws IOException{
		DataOutputStream output=new DataOutputStream(new FileOutputStream("temp1.dat"));
		output.writeUTF("John");
		output.writeDouble(85.5);
		output.writeUTF("Jim");
		output.writeDouble(185.5);
		output.close();
		
		DataInputStream input=new DataInputStream(new FileInputStream("temp1.dat"));
		System.out.println(input.readUTF()+" "+input.readDouble());
		System.out.println(input.readUTF()+" "+input.readDouble());
	}
}
