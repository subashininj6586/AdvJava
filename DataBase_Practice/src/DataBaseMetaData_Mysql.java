import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseMetaData_Mysql {

		public static void main(String[] args) throws ClassNotFoundException {
	        databaseInfo();
	    }

	    private static void databaseInfo() throws ClassNotFoundException {
	        // Step 1: Establishing a Connection
	        try {
	        		 Class.forName("com.mysql.jdbc.Driver");
	        		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Productdb?useSSL=false", "root", "Baby@6586");
	            DatabaseMetaData dbmd = connection.getMetaData();
	            System.out.println("Driver Name: " + dbmd.getDriverName());
	            System.out.println("Driver Version: " + dbmd.getDriverVersion());
	            System.out.println("UserName: " + dbmd.getUserName());
	            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
	            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }

	    public static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}