package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import in.JDBCUtil.jdbccrud;

public class insertmysqlquery {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection connection= null;
		Statement statement= null;


		try {
			connection=jdbccrud.getJdbacconnection();
			if(connection!= null)
			{
				statement=connection.createStatement();
				String myinsertQuery="insert into student(name,rollNo,result) values('Smruti',100,'PASS')";
				int roweffect=statement.executeUpdate(myinsertQuery);
				
				if (roweffect==1)
				{
					System.out.println("Row inserted");

				}
				else
				{
					System.out.println("Row can not inserted");
				}

			}

			
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				jdbccrud.closeResorce(connection, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
