import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDateConnection {
    private static Connection conn = null;
    static DateConnection dcon = new DateConnection();
    
    public static void insert( ) {
		try {
			conn = dcon.getConnection( );
			if (conn != null) {
				Statement stmt = conn.createStatement() ;				
				String sql = "insert into student(id,name,sex,age,address) values(17001,'学生A','男',18,'济南市')";
		        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
		        System.out.println("影响的数据行：" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("【错误】连接数据库失败！");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    public static void update( ) {
		try {
			conn = dcon.getConnection( );
			if (conn != null) {
				Statement stmt = conn.createStatement() ;				
				String sql = "update student set name='张三' where id=17001";
		        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
		        System.out.println("影响的数据行：" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("【错误】连接数据库失败！");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    public static void delete( ) {
		try {
			conn = dcon.getConnection( );
			if (conn != null) {
				Statement stmt = conn.createStatement() ;				
				String sql = "delete from student where id=17001";
		        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
		        System.out.println("影响的数据行：" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("【错误】连接数据库失败！");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    public static void select( ) {
		try {
			conn = dcon.getConnection( );
			if (conn != null) {
				Statement stmt = conn.createStatement() ;				
				String sql = "select * from student" ;
		        ResultSet rs = stmt.executeQuery(sql) ;			// 实现数据查询
		        while (rs.next()) {							// 循环取出返回的每一行数据
		        	int id = rs.getInt(1);
		            String name = rs.getString(2);
		            String sex = rs.getString(3);
		            int age = rs.getInt(4);
		            String address = rs.getString(5);
		            System.out.println(id + "\t" + name + "\t" + sex + "\t" + age + "\t" + address);
		        }
		        rs.close();
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("【错误】连接数据库失败！");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    
    
    
}
