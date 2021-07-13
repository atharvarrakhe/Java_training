
public class fibonnaci6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,nn=1,count=10;
		System.out.print(n1+" "+n2+" "+nn);
		while(nn<100) 
		{
			nn=n1+n2;
			n1=n2;
			n2=nn;
			if(nn%2==1) {
			System.out.print(" "+nn);
					}
		}
	}

}
