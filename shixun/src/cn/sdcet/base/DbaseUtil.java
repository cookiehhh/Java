package cn.sdcet.base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbaseUtil {
	static final String Driver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
	static final String URL="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=student";
	static final String uname="sa";
	static final String pwd="sa";
	public static Connection conn=null;
	static{
		try {
			Class.forName(Driver);
			try {
				conn=DriverManager.getConnection(URL,uname,pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection(){
		return conn;
	}
	
}
