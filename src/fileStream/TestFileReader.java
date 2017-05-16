package fileStream;
import java.io.*;
public class TestFileReader {
	public static void main(String[] args){
		FileReader file=null;
		try{
			file=new FileReader("E:/xue/Queue.h");
			int b;
			while((b=file.read())!=-1){
				System.out.print((char)b);
			}
			file.close();
		}
		catch(IOException ex){
			System.out.println("Not Found!");
		}
	}
}
