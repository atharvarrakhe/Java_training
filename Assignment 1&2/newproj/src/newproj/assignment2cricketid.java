package newproj;
import java.util.*;
public class assignment2cricketid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int noOfElements = scanner.nextInt();

		if(noOfElements<0) 
		{
			System.out.println("Invalid Array size") ;
		}
		noOfElements++;
		int [] arr = new int[noOfElements];
		for(int i = 0; i<arr.length; i++) 
		{
			
			arr[i] = scanner.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid Input") ;
				
			}
		}
		for(int i=1;i<arr.length-1;i+=2)
		{
				if(arr[i] > arr[noOfElements-1]) {
				System.out.println(arr[i-1]) ;
		}
		}
	}

}
