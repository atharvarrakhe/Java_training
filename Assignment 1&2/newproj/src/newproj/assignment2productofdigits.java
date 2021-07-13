package newproj;

import java.util.Scanner;

public class assignment2productofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int product=1;
		System.out.println("Entered number is: "+number);
		while(number!=0) 
		{
			product*=(number%10);
			number/=10;
			if(product==0) {
				break;
			}
		}
		 System.out.println("The product of digits on given number is: "+product);
	}

}
