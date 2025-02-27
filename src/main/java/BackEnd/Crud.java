package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.el.ELClass;

import BackEnd.Std;

public class Crud {
	 
	public Connection getConnection() throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306:/projectstudent1","root","root");
		return connection;
		
	}
	
	public int SignUp(Std s) throws Exception {
		 Connection connection=getConnection();
		 PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?,?)");
		 
		 preparedStatement.setString(1,s.getName());
		 preparedStatement.setInt(2,s.getId());
		 preparedStatement.setString(3,s.getAdd());
		 preparedStatement.setString(4,s.getEmail());
		 preparedStatement.setString(5,s.getState());
		 
		 int count=preparedStatement.executeUpdate();
		 System.out.print(count);
		connection.close();
		return count;
	}
}
