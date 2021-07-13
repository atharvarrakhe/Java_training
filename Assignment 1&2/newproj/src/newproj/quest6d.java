
public class quest6d {

	public static void main(String[] args) {
		int n1=0,n2=1,nn=1,sum=0;
		sum=sum+n1+n2;
		while(nn<100) 
		{
			nn=n1+n2;
			n1=n2;
			n2=nn;
			sum=sum+nn;
		}
		System.out.print(sum);
	
	}

}
