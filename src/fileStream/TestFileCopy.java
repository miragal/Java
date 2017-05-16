package fileStream;
import java.io.*;
public class TestFileCopy {
	public static void main(String[] args){
		FileReader r=null;
		FileWriter w=null;
		try{
			w=new FileWriter("E:/xue/misson.h");
			r=new FileReader("E:/xue/Queue");
			int c;
			while((c=r.read())!=-1){
				w.write(c);
			}
			w.close();
			r.close();
		}
		catch(FileNotFoundException e1){
			e1.printStackTrace();
			System.out.println("Not Found!");
			System.exit(-1);
		}
		catch(IOException ex){
			System.out.println("文件读取错误！");
		}
		System.out.println("文件已复制！");
	}
}
