package LooL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	 private static String databaseDriver = "org.postgresql.Driver";;
	 private static String databaseUrl =  "jdbc:postgresql://localhost:5432/Gestion";
	 private static String databaseUser = "postgres";
	 private static String databasePassword = "anas5313N";
	 
	 
	 public static Connection getConnection() {
		 try{ 
	         Class.forName(databaseDriver);
			 System.out.println("lool first");
			  DriverManager.getConnection(databaseUrl, databaseUser, databasePassword );
		 }catch(SQLException | ClassNotFoundException e){
			 e.printStackTrace();
	         System.out.println("Error in DB!");
		 }
		 
		 return null;
	 }
	
}
