package train_ticket_genration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

 

//import com.exp.TrainDoesNotexistException;

 


public class TrainDAO {
	
	private String DRIVER_NAME;
	private String DB_URL;
	private String USERNAME;
	private String PASSWORD;
    public static Train findTrain(int trainNo) throws ClassNotFoundException, SQLException {
                
                //step 1 - register the driver
                Class.forName("oracle.jdbc.OracleDriver");
                //Step 2 - establish a connection
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "oracle");
                //Step 3 - create a statement
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Trains where train_no="+ trainNo+"");
                boolean found=resultSet.next();
                try{
                		if(!found) {
                	throw new TrainNotFoundException();
                		}
                }catch(TrainNotFoundException e) {
                	System.out.print("Train was not found.\n Plese check your Train Number");
                	  return null;
                }
                
                if(found) {
                    Train t=new Train(resultSet.getInt(1),resultSet.getString("TRAIN_NAME"),resultSet.getString("SOURCE"),resultSet.getString("dESTINATION"),resultSet.getDouble(5));    
                  //System.out.print(resultSet.getString(2));
                    return t;
                }
                connection.close();
				return null;
				
               
                
            }
    
            public static void main(String[] args) throws ClassNotFoundException, SQLException {
                // TODO Auto-generated method stub
                
                //Train t= TrainDAO.findTrain(1001);
                //System.out.println(t);
            }
    
    
            
}
 