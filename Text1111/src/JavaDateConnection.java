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
				String sql = "insert into student(id,name,sex,age,address) values(17001,'ѧ��A','��',18,'������')";
		        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
		        System.out.println("Ӱ��������У�" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("�������������ݿ�ʧ�ܣ�");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    public static void update( ) {
		try {
			conn = dcon.getConnection( );
			if (conn != null) {
				Statement stmt = conn.createStatement() ;				
				String sql = "update student set name='����' where id=17001";
		        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
		        System.out.println("Ӱ��������У�" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("�������������ݿ�ʧ�ܣ�");
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
		        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
		        System.out.println("Ӱ��������У�" + len);
				stmt.close();
				dcon.closeConnection( );			
			} else
				System.out.println("�������������ݿ�ʧ�ܣ�");
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
		        ResultSet rs = stmt.executeQuery(sql) ;			// ʵ�����ݲ�ѯ
		        while (rs.next()) {							// ѭ��ȡ�����ص�ÿһ������
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
				System.out.println("�������������ݿ�ʧ�ܣ�");
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
    
    
    
}
