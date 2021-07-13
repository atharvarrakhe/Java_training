
public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,nn,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++) {
			nn=n1+n2;
			n1=n2;
			n2=nn;
			System.out.print(" "+nn);
		}
	}

}
