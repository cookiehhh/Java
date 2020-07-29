import java.sql.*;

public class TextConnection {
	private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=student" ;
    private static final String USER = "sa" ;
    private static final String PASSWORD = "4210" ;
    public static void main(String[] args) throws Exception {
        // ��һ�����������ݿ��������򣬴�ʱ����Ҫʵ��������Ϊ���������Լ��������
        Class.forName(DBDRIVER);
        // �ڶ�������������Э�顢�û����������������ݿ�
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD);
        System.out.println(conn);		// ������ݿ�����
        // ���������������ݿ�����ݲ���
        Statement stmt = conn.createStatement() ;
        // �ڱ�дSQL�Ĺ������棬���̫����Ҫ���ӻ��У�һ��Ҫ��ǰ����Ͽո�
        /*
        //�������
        String sql = "insert into Student(Studentid,Studentname,age) values(17001,'ѧ��A',18)";
        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
        System.out.println("Ӱ��������У�" + len);
        
        //�޸�����
        String sql = " update Student set Studentid=17001,Studentname='ѧ��A',age=17\r\n" + 
        		"where ѧ�����=170001 ";
        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
        System.out.println("Ӱ��������У�" + len);
   
        //ɾ������ 
        String sql = "delete from Student where Studentid=170001";
        int len = stmt.executeUpdate(sql) ;	// ִ��SQL���ظ��µ�������
        System.out.println("Ӱ��������У�0" + len);

        
        //��ѯ����
        String sql = "select * from Student" ;
        ResultSet rs = stmt.executeQuery(sql) ;			// ʵ�����ݲ�ѯ
        while (rs.next()) {							// ѭ��ȡ�����ص�ÿһ������
        	String Studentid = rs.getString("Studentid");	//String Studentid = rs.getString(1);
            String Studentname = rs.getString("Studentname");	//String Studentname = rs.getString(2);
            String Classid = rs.getString("Classid");	//String Classid = rs.getString(3);
            Date Birthday = rs.getDate("Birthday");		//Date Birthday = rs.getDate(4);
            String Sex = rs.getString("Sex"); 			//String Sex = rs.getString(5);
            System.out.println(Studentid + "��" + Studentname + "��" + Classid + "��" + Birthday + "��" + Sex);
        }
		*/
     // ���Ĳ����ر����ݿ�
        conn.close();					
    }

}
