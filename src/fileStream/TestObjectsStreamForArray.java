package fileStream;
import java.io.*;
public class TestObjectsStreamForArray {
	public static void main(String[] args)
		throws ClassNotFoundException,IOException{
		int [] numbers={1,2,3,4,5};
		String [] strings={"John","Jim","Jake"};
		ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("array.dat"));
		output.writeObject(numbers);
		output.writeObject(strings);
		output.close();
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("array.dat"));
		int [] newNumbers=(int [])(input.readObject());
		String [] newStrings=(String [])(input.readObject());
		for(int i=0;i<newNumbers.length;i++)
			System.out.print(newNumbers[i]+" ");
		System.out.println();
		for(int i=0;i<newStrings.length;i++)
			System.out.print(newStrings[i]+" ");
	}
}
