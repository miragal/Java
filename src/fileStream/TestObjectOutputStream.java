package fileStream;
import java.io.*;
public class TestObjectOutputStream {
	public static void main (String[] args) throws IOException{
		ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("object.dat"));
		output.writeUTF("John");
		output.writeDouble(85.5);
		output.writeObject(new java.util.Date());
		output.close();
	}
}
