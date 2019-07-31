package generic;
import java.sql.*;

public class DatabaseConnection {
	public DatabaseConnection() {
		try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://uat-replicat.csjwu1vljdd7.us-east-1.rds.amazonaws.com/acuitylink","acuitylink","Ac8it2y@uat");
				//here acuitylink is the database name, acuitylink is the username and Ac8it2y@uat is the password
				Statement stmt=con.createStatement();

				ResultSet rs=stmt.executeQuery("DELETE FROM additional_hi_info WHERE user_id IN (SELECT user_id FROM users WHERE user_type = 'HI' AND asp_hi_id IN (SELECT hi_id FROM hi_info WHERE hi_name = 'PDH'));");

				/*while(rs.next())
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));*/
					con.close();
			}catch(Exception e){ System.out.println(e);}
	}
}