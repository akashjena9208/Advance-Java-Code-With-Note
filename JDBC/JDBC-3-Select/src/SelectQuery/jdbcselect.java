package SelectQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.JDBCUtil.jdbccrud;

public class jdbcselect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection connection= null;
		ResultSet resultset=null;

		PreparedStatement preparedStatement = null;
		Scanner scan=new Scanner(System.in);
		
			


		try {
			connection=jdbccrud.getJdbacconnection();
			if(connection!= null)
			{
				String myinsertQuery="SELECT * FROM student where id=?";
				preparedStatement=connection.prepareStatement(myinsertQuery);
				if(preparedStatement != null) 
				{
					System.out.println("Enter the id of the student which you would like to update");
					int id=scan.nextInt();
					
					preparedStatement.setInt(1, id);
					
					resultset=preparedStatement.executeQuery();
					
					if(resultset!=null)
						
					{
						if (resultset.next())
						{
						System.out.println("ID\tNAME\trollNo\tResult");
				        System.out.println(resultset.getInt(1)+"\t"+ resultset.getString(2)+"\t"+resultset.getInt(3)+"\t" + resultset.getString(4));

						}
					}
					else
					{
						System.out.println("Result not Found");
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
