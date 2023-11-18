package jdbcConnection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingDynamicData {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id=scan.nextInt();
		
		System.out.println("Enter Name:");
		String name=scan.next();
		
		System.out.println("Enter Contact:");
		String contact=scan.next();
		
		System.out.println("Enter City:");
		String city=scan.next();
		
		System.out.println("Enter Age:");
		int age=scan.nextInt();
		
		System.out.println("Enter Gender:");
		String gender=scan.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashaDB", "root", "Vinayak");
		    PreparedStatement stmt=con.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?)")  ; 
		    
		    stmt.setInt(1,id);
		    stmt.setString(2,name);
		    stmt.setString(3, contact);
		    stmt.setString(4, city);
		    stmt.setInt(5, age);
		    stmt.setString(6, gender);
		    
		    
		    int count=stmt.executeUpdate();
		    con.close();
		    System.out.println("Row Inserted Dynamically using Parameterised Querry:" +count);

		}
		    catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
