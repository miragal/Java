package fileStream;
import java.io.*;
public class TestPrintStream1 {
	public static void main(String[] args){
		PrintStream ps=null;
		try{
			FileOutputStream fos=new FileOutputStream("E:/xue/test1.word");
			ps=new PrintStream(fos);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		if(ps!=null){
			System.setOut(ps);
		}
		for(int i=0;i<65536;i++)
				System.out.print(i);
	}
}
