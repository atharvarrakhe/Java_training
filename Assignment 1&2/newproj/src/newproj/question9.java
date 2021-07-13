package newproj;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int sum=0;
		System.out.println(n);
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}

}
