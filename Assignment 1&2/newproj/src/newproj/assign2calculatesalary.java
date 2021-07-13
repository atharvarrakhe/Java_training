package newproj;

import java.util.Scanner;

public class assign2calculatesalary {

	public static void main(String[] args) {
		int salary,shifts;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a salary");
		salary=scanner.nextInt();
		scanner.nextLine();
		shifts=scanner.nextInt();
		
			//System.out.println(shifts);
			System.out.println("The amount saved is :"+salary*(0.5+0.0200*shifts));

			if(salary>8000) {
				System.out.println("Salary too large");
			}else if(shifts<0) {
				System.out.println("Shifts too small");
			}else System.out.println("Salary too small");

	}

}
