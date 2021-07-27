package train_ticket_genration;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import train_ticket_genration.TrainDAO;
public class TrainApplication {

	public static int countticketontheday(LocalDate d) {
		int count=0;
		String datest=Integer.toString(d.getYear())+Integer.toString(d.getMonthValue())+Integer.toString(d.getDayOfMonth());
		Scanner scan = new Scanner(System.in);
		File[] file = new File("D:\\tickets").listFiles(File::isFile);
	    
	      for(int i=0; i<file.length; i++) {
	    	 if( file[i].getName().indexOf(datest)!=-1)
	    	 {
	    		 count++;
	    	 }
	      }
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Train No:\n");
		
		Ticket ticket=new Ticket();
		
		int trainNo=s.nextInt();
		
		Train CurrTrain=TrainDAO.findTrain(trainNo);
		ticket.setTrain(CurrTrain);
		if(CurrTrain!=null) {
		System.out.print("Enter the No of Passengers:\n");
		int passengerNo=s.nextInt();
		
		System.out.print("Enter the TravelDate:");
		String stringDate=s.next();
		//System.out.println(stringDate);
		
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1=LocalDate.parse(stringDate,dateFormat);
		System.out.println(d1);
		
		ticket.setTravelDate(d1);
		for(int i=0;i<passengerNo;i++) {
			System.out.println("Enter The Details of Passengers");
			Passenger p=new Passenger();
			System.out.println("Enter The Name of Passenger "+(i+1));
			p.setName(s.next());
			System.out.println("Enter The age of Passenger "+(i+1));
			p.setAge(s.nextInt());
			System.out.println("Enter The Gender of Passenger "+(i+1));
			p.setGender(s.next().charAt(0));
			ticket.addPassenger(p.getName(), p.getAge(), p.getGender());
		}
		//System.out.print(ticket.calculateTotalTicketPrice());
		ticket.setPnr(null);
		System.out.println("Ticket Booked with PNR: "+ticket.getPnr());
		ticket.getTicket();
		System.out.println("Ticket should be written in file : "+ticket.getPnr());
		
		
		System.out.println(" No. of Tickets booked  on date "+d1+ " are "+countticketontheday(d1));
		
		//System.out.println(ticket.generateTicket());
	}
	}
}
	
