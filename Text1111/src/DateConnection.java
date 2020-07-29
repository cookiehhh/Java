import java.sql.Connection;
import java.sql.DriverManager;

public class DateConnection {
	private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=javadate";
    private static final String USER = "sa";
    private static final String PASSWORD = "4210";
    private Connection conn = null;
    public Connection getConnection( ) {
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL,USER,PASSWORD);
			if (conn != null)
				System.out.println("【信息】连接数据库成功！");
		} catch (Exception e) {
			System.out.println("【错误】连接数据库失败：" + e.getMessage( ));
			e.printStackTrace( );
		}
		return conn;
	}
    public void closeConnection( ) {
		try {
			if (conn != null)
				conn.close( );
			conn = null;
			System.out.println("【信息】数据库连接关闭成功！");
		} catch (Exception e) {
			System.out.println("【错误】数据库连接关闭失败：" + e.getMessage( ));
			e.printStackTrace( );
		}
	}
}
