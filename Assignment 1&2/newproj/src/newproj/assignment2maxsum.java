package newproj;

import java.util.Scanner;

public class assignment2maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int noOfElements = scanner.nextInt();
		
		if(noOfElements<0) {
			System.out.println("Invalid Input") ;
		}
		int [] arr = new int[noOfElements];
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = scanner.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid Input") ;
				
			}
		}
		int evensum=0,oddsum=0;
for(int i = 0; i<arr.length; i++) 
	{
			if(i%2==0) 
			{
				evensum+=arr[i];
			}
			else oddsum+=arr[i];
		
	}
	if(evensum>oddsum) 
	{
		System.out.println("The evensum is :"+ evensum) ;
	}
	else System.out.println("The oddsum is :"+ oddsum) ;
	}
}
