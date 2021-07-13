package newproj;

import java.util.Scanner;

public class assignment2farehtocenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int f = scanner.nextInt();
		
		if(f<0) {
			System.out.println("Invalid Input") ;
		}
		float ans=5*(f-32)/9;
		System.out.println(ans) ;
	}

}
