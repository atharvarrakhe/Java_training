
public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employees e1=new employees();
		e1.setEmp_id(1);
		e1.setHours_worked(5);
		e1.setWages_per_hour(10);
		e1.setName("Rahul");
		int ans=e1.Hours_worked*e1.Wages_per_hour;
		System.out.println(e1.getName()+" has a salary of "+ans);
	}

}
