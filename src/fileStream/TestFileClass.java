package fileStream;

import java.io.File;

public class TestFileClass {
	public static void main(String[] args){
		File file=new File("E/image/us.gif");
		System.out.println("Does it exist? "+file.exists());
		System.out.println("Absolute path is "+file.getAbsolutePath());
	}
}
