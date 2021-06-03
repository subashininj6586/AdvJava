import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListOfTables {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
   		 Class.forName("com.mysql.jdbc.Driver");
   		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistrationDB?useSSL=false", "root", "Baby@6586");
       DatabaseMetaData dbmd = connection.getMetaData();
       System.out.println("Driver Name: " + dbmd.getDriverName());
       System.out.println("Driver Version: " + dbmd.getDriverVersion());
       System.out.println("UserName: " + dbmd.getUserName());
       System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
       System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

       
       System.out.println("Connection established......");
       //Creating a Statement object
       Statement stmt = connection.createStatement();
       //Retrieving the data
       ResultSet rs = stmt.executeQuery("Show tables");
       System.out.println("Tables in the current database: ");
       while(rs.next()) {
          System.out.print(rs.getString(1));
          System.out.println();
       }
   } catch (SQLException e) {
      System.out.println(e);
   }
	}


}
