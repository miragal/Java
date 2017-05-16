package fileStream;
import java.io.*;
public class showfile {
	public static void main(String[] args)throws Exception{
		listAll(new File("E://xue"));
	}
	public static void listAll(File file)throws Exception{
		if(file.isFile()){
			System.out.println(file);
			String str=file.toString();
		}
		else if(file.isDirectory()){
			File[] fs=file.listFiles();
			for(int i=0;i<fs.length;i++)
					listAll(fs[i]);
		}
	}
}
