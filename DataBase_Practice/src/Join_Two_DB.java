import java.sql.*;

import java.sql.SQLException;
//import java.util.*;

public class Join_Two_DB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
	   		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistrationDB?useSSL=false", "root", "Baby@6586");
	   	 String sql = "select cname1, cname2, cname3 from course where studid=1234";
            
	   	Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        System.out.println("     Course registered       ");
        System.out.println(" ========================");
        while (result.next())
        {
             System.out.println (
                  result.getString(1)+"\n"+
                  result.getString(2)+"\n"+
                  result.getString(3)
                  );
        }
        System.out.println("**===============**\n");

	}

}
