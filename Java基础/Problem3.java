package task;

public class Problem3 {
	public static void main(String[] args){
		for(int i=0;i<17;i++)
			for(int j=0;j<26;j++){
				if(2*i+j==20)
					System.out.println("���ˣ�"+i+" Ů�ˣ�"+j+" С����"+(30-i-j));
			}
	}
}
