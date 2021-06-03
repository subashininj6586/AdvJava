import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Stud_DB {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/RegistrationDB?useSSL=false", "root", "Baby@6586");

			Scanner sin = new Scanner(System.in);
			System.out.println("Connection established......");

			System.out.println("Enter Student ID");
			int studid = sin.nextInt();
			String sql = "select cname1, cname2, cname3 from course where studid=" + studid;

			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			System.out.println("     Course registered       ");
			System.out.println(" ========================");
			while (result.next()) {
				System.out.println(result.getString(1) + "\n" + result.getString(2) + "\n" + result.getString(3));
			}
			System.out.println("**===============**\n");
			int count = 0;
			while (count < 3) {
				System.out.println("Enter Course Name");
				String cname = sin.next();
				System.out.println("Enter True for Online False for offline");
				boolean mode = sin.nextBoolean();

				String sql1 = "insert into student " + " (studid, cname, mode)" + " values (?, ?, ?)";

				PreparedStatement stmt1 = connection.prepareStatement(sql1);

				// set param values
				stmt1.setInt(1, studid);
				stmt1.setString(2, cname);
				stmt1.setBoolean(3, mode);

				// 3. Execute SQL query
				stmt1.executeUpdate();
				count++;
			}
			System.out.println("Inserted successfully");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
