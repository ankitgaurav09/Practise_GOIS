
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DbConnection {
//
//	
//	//Class.forName("com.mysql.jdbc.Driver");
//    public static void forName(String className)throws ClassNotFoundException  
//    public static Connection getConnection(String url,String name,String password)  
//    		throws SQLException 
//    		{
//	Connection con=DriverManager.getConnection("delsrv","gaurava","gaurav15");
//	Statement stmt=con.createStatement();
//    		}
//	}
//
//
package automationFramework;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DbConnection {
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://delsrvgois;database=goisllc_web1_branch; integratedSecurity=true");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = "select * from SystemUser";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("txt_title"));
			conn.close(); 
		}
	}
	catch (ClassNotFoundException e){
		
		throw (e);
	}
	}
}
		
	
	
