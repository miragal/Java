package fileStream;
import java.io.*;
public class TestFileInputStream{
	public static void main(String[] args){
		try{
			FileInputStream file=new FileInputStream("E:/xue/Queue.h");
			int b;
			long	num=0;
			while((b=file.read())!=-1){
				System.out.print((char)b);
				num++;
			}
			System.out.println("总共读入 "+num+"字节" );
			file.close();
		}
		catch(IOException ex){
				System.out.println("文件不存在！");
		}
	}
}
