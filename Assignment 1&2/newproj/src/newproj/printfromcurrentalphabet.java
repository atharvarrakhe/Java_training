
public class printfromcurrentalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char d='A';
		if(d>='A' && d<='Z') 
		{
			while(d<='Z') 
			{
				System.out.println(d);
				d++;
			}
		}
		else if(d>='a' && d<='z') 
		{
			while(d<='z') 
			{
				System.out.println(d);
				d++;
			}
		}
		else System.out.println("INVALID INPUT");
	}

}
