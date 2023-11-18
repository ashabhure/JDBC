package jdbcConnection1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnect {

	public static void main(String[] args) {
	try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         //import from java.sql package, 
         //we are using out own database stored at our machine so it is local host
         //otherwise we have to enter IP address of other m/c whose database we want to use
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashaDB","root","Vinayak");
	     System.out.println(" Java Application Connection with database through JDBC done sucessfully");
	}
        catch(Exception ex){
        ex.printStackTrace();
    }
  }
}
