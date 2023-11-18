package jdbcConnection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashaDB", "root", "Vinayak");
    PreparedStatement stmt=con.prepareStatement("INSERT INTO student VALUES(7,'Ram','8643545676','Nagpur',22,'M')")  ; 
    int count=stmt.executeUpdate();
    con.close();
    System.out.println("Row Inserted:" +count);

}
    catch(Exception ex) {
	ex.printStackTrace();
}
	}

}
