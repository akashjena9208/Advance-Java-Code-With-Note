package InsertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import in.JDBCUtil.jdbccrud;

public class insertmysqlquery {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection connection= null;
		resultset

		PreparedStatement preparedStatement = null;
			


		try {
			connection=jdbccrud.getJdbacconnection();
			if(connection!= null)
			{
				String myinsertQuery="insert into student(name,rollNo,result) values(?,?,?)";
				preparedStatement=connection.prepareStatement(myinsertQuery);
				if(preparedStatement != null) 
				{
					//set values 
					
					preparedStatement.setString(1,"Chirag");
					preparedStatement.setInt(2, 12);
					preparedStatement.setString(3, "P");
					
					
					//execute the Query
					int roweffect= preparedStatement.executeUpdate();
					
					if(roweffect==1)
					{
						System.out.println("row insert");
					}
					else
					{
						System.out.println(" row doesnot insert");
					}
					
				}


			}

			
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				jdbccrud.closeResorce(connection, preparedStatement,resultset);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
