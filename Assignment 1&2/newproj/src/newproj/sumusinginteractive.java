package newproj;
import java.util.*;
public class sumusinginteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n=Integer.parseInt(scanner.next());
		 sum+=n;
		 System.out.println("Enter a number");
		 int n1=Integer.parseInt(scanner.next());
		 sum+=n1;
		 System.out.println("Enter a number");
		 int n2=Integer.parseInt(scanner.next());
		 sum+=n2;
		 System.out.println("sum is:"+sum);
	}

}
