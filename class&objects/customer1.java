
public class customer1 {
	private int custId;
	private String custName;
	private String custcity;

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	 public String printt() {
	        return custId+"--"+custName+"--"+custcity;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.setCustId(1);
		c1.setCustCity("Abd");
		c1.setCustName("Rohan");
		System.out.println(c1.printt());
		
		Customer c2=new Customer();
		c2.setCustId(2);
		c2.setCustCity("hbd");
		c2.setCustName("Mohan");
		System.out.println(c2.printt());
	}

}
