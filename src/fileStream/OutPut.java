package fileStream;
import java.io.*;
public class OutPut {
	public static void main (String[] args){
		FileInputStream in=null;
		FileOutputStream out=null;
		try{
			out=new FileOutputStream("E:/xue/test.h");
			in=new FileInputStream("E:/xue/Stack.h");
			int b;
			while((b=in.read())!=-1)
				out.write(b);
			System.out.println("文件已复制！");
			in.close();
			out.close();
		}
		catch(IOException ex){
			System.out.print("Not Found!");
		}
	}
}
