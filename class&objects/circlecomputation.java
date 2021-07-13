
import java.util.Scanner;
public class circlecomputation {
	private double radius;
	
	private double calculateArea(double radius){
		double area=22*radius*radius/7;
		System.out.print(22*radius*radius/7);
		return area;
	
		}
	public void calculateCircumference(double radius)
	{
		System.out.print(22*radius*2/7);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 circlecomputation computation = new circlecomputation();
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the radius: ");
		 double radius= scanner.nextDouble();
		 
		 double area= computation.calculateArea( radius);
		 System.out.print(area);
	}

}
