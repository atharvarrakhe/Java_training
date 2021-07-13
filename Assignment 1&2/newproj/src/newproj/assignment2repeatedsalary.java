package newproj;

import java.util.Scanner;

public class assignment2repeatedsalary {

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
		//System.out.println("Array elements are....");
		for(int i = 0; i<arr.length; i++) {
			int count=1;
			for(int j=0;j<arr.length;j++) 
			{
				if(j!=i && arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("The count of repeated element is "+count) ;
				break;
			}
		}
		
	}

}
