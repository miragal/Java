//Ŀ�ģ���ά�����Ӧ��
package data_and_struct;
import java.util.*;
public class ArrayTest {
	public static void main(String[] args){
		int intCreate=1000;
		int intRand;
		int [][] intArray=new int[2][42];
		while(intCreate-->0){
			intRand=(int)(Math.random()*42);
			intArray[0][intRand]++;
			intArray[1][intRand]++;
		}
		Arrays.sort(intArray[0]);
		//�ҳ��������6�����ֺ���
		for(int i=41;i>(41-6);i--){
			for(int j=41;j>=0;j--)
				if(intArray[0][i]==intArray[1][j]){
					System.out.println("��������� "+(j+1)+" ����"+intArray[0][i]+" �Ρ�");
					intArray[1][j]=0;
					break;
				}
		}
	}
}
