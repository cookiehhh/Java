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
		} catch (Exception e) {
			System.out.println("�������������ݿ�ʧ�ܣ�" + e.getMessage( ));
			e.printStackTrace( );
		}
		return conn;
	}
    public void closeConnection( ) {
		try {
			if (conn != null)
				conn.close( );
			conn = null;
		} catch (Exception e) {
			System.out.println("���������ݿ����ӹر�ʧ�ܣ�" + e.getMessage( ));
			e.printStackTrace( );
		}
	}
}
