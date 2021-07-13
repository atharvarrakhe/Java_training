package newproj;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int s=0;
		int m=n;
		while(m!=0) {
			int k=m%10;
			s+=k*k*k;
			m/=10;
		}
		if(s==n) {
			System.out.println(n+" is Armstrong Number.");
		}else System.out.println(n+" is not Armstrong Number.");
	}

}
