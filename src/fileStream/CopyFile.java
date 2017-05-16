package fileStream;
import java.io.*;
public class CopyFile {
	public static void main(String[] args){
		
	}
	public static void copyfile(File src,File dst) throws IOException{
		FileInputStream input=new FileInputStream(src);
		FileOutputStream output=new FileOutputStream(dst);
		int b=0;
		while((b=input.read())!=-1)
				output.write(b);
		input.close();
		output.close();
	}
}
