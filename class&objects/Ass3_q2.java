import java.util.*;

 

public class Ass3_q2 {
    
    private  int custId;
    private  String custName;
    private  String custCity;
    

 

    public int getId() {
        return custId;
      }
    public void setId(int c) {
        this.custId = c;
      }
    
    
    public String getName() {
        return custName;
      }
    
    public void setName(String c) {
        this.custName = c;
      }
     

 

    public String getCity() {
        return custCity;
      }
    
    public void setCity(String c) {
        this.custCity = c;
      }
    
    public String printt() {
        return custId+"--"+custName+"--"+custCity;
    }
    
    
    public static void main(String[] args) {
           Ass3_q2 emp1=new Ass3_q2();
           emp1.setId(1);
           emp1.setName("saniya");
           emp1.setCity("Pune");
           System.out.println( emp1.printt());

 

           
           Ass3_q2 emp2=new Ass3_q2();
           emp2.setId(1);
           emp2.setName("Aqsa");
           emp2.setCity("Mumbai");
           System.out.println( emp2.printt());

 

    }
}
 