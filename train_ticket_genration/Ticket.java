package train_ticket_genration;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Ticket {

	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger,Integer> passengers=new TreeMap<Passenger,Integer>(new Comparator<Passenger>() {

		 

        @Override
        public int compare(Passenger o1, Passenger o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
    });;
	
	Ticket(){}
	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	public String getPnr() {
		return pnr;
	}


	public void setPnr(String pnr) {
		this.pnr = this.generatePNR();
	}


	public LocalDate getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(LocalDate D) {
		//System.out.println("Todays Date is "+LocalDate.now());
		//System.out.print(D.isBefore(LocalDate.now()));
		
		if(D.isBefore(LocalDate.now())) {
			System.out.println("Travel Date is before current Date");
			System.exit(0);
		}
		
		this.travelDate = D;
	}


	public Train getTrain() {
		return train;
	}


	public void setTrain(Train train) {
		this.train = train;
	}


	public TreeMap<Passenger, Integer> getPassengers() {
		return passengers;
	}


	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}


	Ticket(LocalDate D, Train t){
		//System.out.println("Todays Date is "+LocalDate.now());
		//System.out.print(D.isBefore(LocalDate.now()));
		if(D.isBefore(LocalDate.now())) {
			System.out.println("Travel Date is before current Date");
			System.exit(0);
		}
		
		
		this.travelDate=D;
		this.train=t;
	}
	
	
	public String generatePNR() {

		return train.getSource().charAt(0)+""+train.getDestination().charAt(0)+"_"+Integer.toString(travelDate.getYear())+Integer.toString(travelDate.getMonthValue())+Integer.toString(travelDate.getDayOfMonth())+"_"+Integer.toString(99+passengers.size());
	}
	
	public double calcPassengerFare(Passenger p) {
		double fare;
		if(p.getAge()<=12) {
			fare= train.getTicketPrice()*50/100;
		}
		else if(p.getAge()>=60) {
			fare= train.getTicketPrice()*60/100;
		}
		else if(p.getGender()=='F' ) {
			fare= train.getTicketPrice()*75/100;
		}else fare=train.getTicketPrice();
		return fare;
	}
	
	
	public void addPassenger(String name,int age,char i){
		Passenger newPassenger=new Passenger(name,age,i);
		passengers.put(newPassenger,(int)calcPassengerFare(newPassenger));
	}
	
	public double calculateTotalTicketPrice() {
		double totalfare=0;
		for(Map.Entry<Passenger, Integer> entry:passengers.entrySet()) {
			totalfare+=entry.getValue();
		}
		return totalfare;
	}
	
	public StringBuilder generateTicket() {
		StringBuilder sb=new StringBuilder();
		sb.append("PNR:"+pnr+"\n");
		sb.append("Train No:"+train.getTrainNo()+"\n");
		sb.append("Train Name:"+train.getTrainName()+"\n");
		sb.append("From:"+train.getSource()+"\n");
		sb.append("To:"+train.getDestination()+"\n");
		/*sb.append("Travel Date:"+Integer.toString(travelDate.getDate()));
		sb.append("\\");
		sb.append(Integer.toString(travelDate.getMonth());
		sb.append("\\");
		sb.append(Integer.toString(travelDate.getYear())+"\n");*/
		sb.append(travelDate.getDayOfMonth()+"/"+(travelDate.getMonthValue())+"/"+(travelDate.getYear())+"\n");
		sb.append("\n");
		
		sb.append("Passengers:"+"\n");
		sb.append("name\t"+"age\t"+"Gender\t"+"Fare\n");
		for(Map.Entry<Passenger, Integer> entry:passengers.entrySet()) {
			sb.append(entry.getKey().getName()+"\t"+entry.getKey().getAge()+"\t"+entry.getKey().getGender()+"\t"+entry.getValue()+"\n");
		}
		sb.append("Total Price:"+this.calculateTotalTicketPrice());
		return sb;
		}
	
	public  void getTicket() throws IOException{
		File file=new File("D:\\tickets");
		file.mkdir();
		File file1=new File("D:\\tickets\\"+pnr+".txt");
		file1.createNewFile();
	

		FileOutputStream f = new FileOutputStream(file1);
		BufferedOutputStream b = new BufferedOutputStream(f);
		f.write(generateTicket().toString().getBytes());
		f.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
