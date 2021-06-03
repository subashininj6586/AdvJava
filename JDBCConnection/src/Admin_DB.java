
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Admin_DB {

	public static void main(String[] args) throws ClassNotFoundException {

		Scanner sin = new Scanner(System.in);
		try {
			// Driver load
			Class.forName("com.mysql.jdbc.Driver");
			// Connection to DB
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/RegistrationDB?useSSL=false", "root", "Baby@6586");

			System.out.println("Choose Your choice:\n1.Insert Detail \n2.Retrieve Detail");
			int choice = sin.nextInt();
			if (choice == 1) {

				System.out.println("Connection established......");
				System.out.println("Enter Student ID");
				int studid = sin.nextInt();
				System.out.println("Enter Course Name1");
				String cname1 = sin.next();
				System.out.println("Enter Course Name2");
				String cname2 = sin.next();
				System.out.println("Enter Course Name3");
				String cname3 = sin.next();
				// Insert query
				String sql = "insert into course " + " (studid, cname1, cname2, cname3)" + " values (?, ?, ?,?)";

				PreparedStatement stmt = connection.prepareStatement(sql);

				// set values
				stmt.setInt(1, studid);
				stmt.setString(2, cname1);
				stmt.setString(3, cname2);
				stmt.setString(4, cname3);

				// 3. Execute SQL query
				stmt.executeUpdate();
				System.out.println("Inserted successfully");
				System.exit(0);
			} else {
				// Select Query

				String sql = "select * from student s inner join course c on s.studid=c.studid";

				Statement stmt = connection.createStatement();
				ResultSet result = stmt.executeQuery(sql);
				System.out.println("Studid   |   Cname       |    Mode");
				System.out.println("**===============================**");
				while (result.next()) {
					System.out.println(
							result.getString(1) + "  | " + result.getString(2) + "  |   " + result.getString(3));
				}
				System.out.println("**===========**==========**\n");
				System.exit(0);
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
