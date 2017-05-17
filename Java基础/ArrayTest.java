package task;
public class ArrayTest {
	public static void main(String[] args){
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(100*Math.random());
		//for(对象的类型  对象的别名：遍历的对象）
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
		System.out.println("\n排序后的数组为：");
		for(int t:a)
			System.out.print(t+" ");
	}
}
