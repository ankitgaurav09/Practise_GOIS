package automationFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	class MysqlCon{  
	public static void main(String args[]){  
	try{  
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	Connection con=DriverManager.getConnection("jdbc:sqlserver://delsrvgois;user=sa;password=option1234#;database=goisllc_web1_branch");

	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from emp");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}  



