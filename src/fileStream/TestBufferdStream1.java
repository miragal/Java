package fileStream;
import java.io.*;
public class TestBufferdStream1 {
	public static void main(String[] args){
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		try{
			fis=new FileInputStream("E:/xue/Stack.h");
			bis=new BufferedInputStream(fis);
			int b;
			System.out.print(bis.read()+" ");
			System.out.print(bis.read()+" ");
			bis.mark(100);
			for(int i=0;i<10&&(b=bis.read())!=-1;i++){
				System.out.print(b+" ");
			}
			System.out.println();
			bis.reset();
			for(int i=0;i<10&&(b=bis.read())!=-1;i++){
				System.out.print(b+" ");
			}
			fis.close();
			bis.close();
		}
		catch(IOException ex){
			System.out.println("Not Found!");
		}
	}
}
