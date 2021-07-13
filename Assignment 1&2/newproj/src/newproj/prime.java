package newproj;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		var scanner=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n=Integer.parseInt(scanner.next());
		 for(int i=2;i*i<=n;i++) {
			 if(n%i==0) {
				 f=0;
				 break;
			 }else continue;
		 }
		 if(f==1) {
			 System.out.println(n+" is prime number");
		 }else System.out.println(n+" is not a prime number");
	}

}
