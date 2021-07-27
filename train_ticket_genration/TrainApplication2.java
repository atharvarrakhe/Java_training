package train_ticket_genration;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

 

import train_ticket_genration.Passenger;
import train_ticket_genration.Ticket;
import train_ticket_genration.Train;
public class TrainApplication2 {

 

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Train td = new Train();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Train No.");
        int No = scan.nextInt();
        td.setTrainNo(No);        
        System.out.println("Enter No. of passengers");
        int N = scan.nextInt();
        Passenger p = new Passenger();
        Ticket t = new Ticket();
        TreeMap<Passenger,Double> tm = new TreeMap<Passenger,Double>(new Comparator<Passenger>() {

 

            @Override
            public int compare(Passenger o1, Passenger o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(int i =0;i<N;i++) {
            System.out.println("Enter Name of passenger "+(i+1));
            String name = scan.next();
            p.setName(name);
            System.out.println("Enter age of passenger "+(i+1));
            int age = scan.nextInt();
            p.setAge(age);
            System.out.println("Enter gender of passenger "+(i+1));
            char g = scan.next().charAt(0);    
            p.setGender(g);
            
            
            tm.put(new Passenger(p.getName(),p.getAge(),p.getGender()),600.00 );

 

            
            }
        
       
        //td.method();
        System.out.println(t.generatePNR());
        System.out.println("Fare for each passenger is : "+t. calculateTotalTicketPrice());
        
        Set<Passenger> keys = tm.keySet();
        for(Passenger key:keys) {
            System.out.println(key+"\t"+tm.get(key));
        }
        
        //t.addPassenger();
        //System.out.println(p.getName()+p.getAge()+p.getGender());
        
        
    }

 

}






