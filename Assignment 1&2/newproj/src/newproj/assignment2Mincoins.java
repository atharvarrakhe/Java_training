package newproj;

import java.util.Scanner;

public class assignment2Mincoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		if(amount<0) {
			System.out.println("Invalid Input") ;
		}
		int n=0;
		while(amount!=0) 
		{
			if(amount>=500) 
			{
				amount-=500;
				n++;
			}
			else if(amount>=100)
			{
				amount-=100;
				n++;
			}
			else if(amount>=50)
			{
				amount-=50;
				n++;
			}
			else if(amount>=10)
			{
				amount-=10;
				n++;
			}
			else if(amount>=5)
			{
				amount-=5;
				n++;
			}
			else if(amount>=1)
			{
				amount-=1;
				n++;
			}
		}
		 System.out.println("Minimum number of coins required are: "+n);
	}

}
