package in.JDBCUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbccrud 
{
	public static Connection getJdbacconnection() throws IOException, SQLException
	{
		FileInputStream FIS = new FileInputStream("Application.properties");
		Properties P =new Properties();
		P.load(FIS);
		
		
		String url=P.getProperty("url");
		String user= P.getProperty("user");
		String password = P.getProperty("password");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		//driver connected
		Connection connection=DriverManager.getConnection(url, user, password);
		return connection;
	}
	public static void closeResorce(Connection connection ,Statement statement,ResultSet resultset) throws SQLException
	{
		if(connection!=null) {
			connection.close();
		}
		if(statement != null) {
			statement.close();
		}
		if(resultset!= null) {
			resultset.close();
		}

	}
	
	
	
}
