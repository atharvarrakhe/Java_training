
import java.util.*;
class Customer {
    
     private int CustId;
     private String CustName;
     private String CustCity;
    
     
     public int getId() {
         return CustId;
     }
     public String getName() {
         return CustName;
       }
     
     public void setName(String c) {
         this.CustName = c;
       }
      
     public String getCity() {
         return CustCity;
     }
    
    public void print() {
        System.out.print("ID:"+CustId+" "+"Name:"+CustName+" "+"City:"+CustCity);
    }
    public void setCustCity(String CustCity){
        this.CustCity=CustCity;
    }
    public void setCustId(int CustId){
        this.CustId=CustId;
    }
    public void setCustName(String CustName){
        this.CustName=CustName;
    }
    public String printt() {
        return CustId+" "+CustName+" "+CustCity;
    }
    public static void main(String[] args)
    {
        Customer customer1=new Customer();
        customer1.setCustId(1);
        customer1.setCustName("Ro");
        customer1.setCustCity("Abd");
        System.out.println(customer1.printt());
        
        Customer customer2=new Customer();
        customer1.setCustId(2);
        customer1.setCustName("to");
        customer1.setCustCity("hbd");
        System.out.println(customer2.printt());
    }
}
 