package task;

public class Problem3 {
	public static void main(String[] args){
		for(int i=0;i<17;i++)
			for(int j=0;j<26;j++){
				if(2*i+j==20)
					System.out.println("男人："+i+" 女人："+j+" 小孩："+(30-i-j));
			}
	}
}
