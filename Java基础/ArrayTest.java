package task;
public class ArrayTest {
	public static void main(String[] args){
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(100*Math.random());
		//for(���������  ����ı����������Ķ���
		for(int t:a)
			System.out.print(t+" ");
		for(int i=0;i<a.length-1;i++)
				for(int j=0;j<a.length-i-1;j++){
					if(a[j]>a[j+1]){
						int t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
		System.out.println("\n����������Ϊ��");
		for(int t:a)
			System.out.print(t+" ");
	}
}
