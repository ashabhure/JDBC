package jdbcConnection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectUsingJDBC {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashaDB", "root", "Vinayak");
		    PreparedStatement stmt=con.prepareStatement("SELECT * FROM student")  ; 
	        ResultSet rs=stmt.executeQuery();
	       while( rs.next());
	        System.out.println("Id: " +rs.getInt("id"));
	        System.out.println("Name: " +rs.getString("name"));
	        System.out.println("Contact: " +rs.getString("contact"));
	        System.out.println("City: " +rs.getString("city"));
	        System.out.println("Age: " +rs.getInt("age"));
	        System.out.println("Gender: " +rs.getString("gender"));

	        con.close();
		    System.out.println("Row Selected Dynamically using Parameterised Querry:");

		}
		    catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
