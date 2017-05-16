package fileStream;
import java.io.*;
public class TestFileStream {
	public static void main(String[] args)	throws IOException{
		FileOutputStream output=new FileOutputStream("temp.dat");
		for(int i=1;i<11;i++)
				output.write(i);
		output.close();
		FileInputStream input=new FileInputStream("temp.dat");
		int i;
		while(( i=input.read())!=-1){
			System.out.print(i+" ");
		}
		input.close();
	}
}
