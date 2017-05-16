package fileStream;
import java.io.*;
public class TestDataOutputStream {
	public static void main(String[] args){
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos); 
		try{
			dos.writeChar('c');
			dos.writeUTF("hello world");
			dos.writeDouble(Math.random());
			ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());
			DataInputStream dis=new DataInputStream (bais);
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
			dos.close();
			dis.close();
		}
		catch(IOException ex){
			System.out.println("error");
		}
	}
}
