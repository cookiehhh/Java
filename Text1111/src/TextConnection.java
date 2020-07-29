import java.sql.*;

public class TextConnection {
	private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver" ;
    private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=student" ;
    private static final String USER = "sa" ;
    private static final String PASSWORD = "4210" ;
    public static void main(String[] args) throws Exception {
        // 第一步：加载数据库驱动程序，此时不需要实例化，因为会由容器自己负责管理
        Class.forName(DBDRIVER);
        // 第二步：根据连接协议、用户名、密码连接数据库
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD);
        System.out.println(conn);		// 输出数据库连接
        // 第三步：进行数据库的数据操作
        Statement stmt = conn.createStatement() ;
        // 在编写SQL的过程里面，如果太长需要增加换行，一定要在前后加上空格
        /*
        //添加数据
        String sql = "insert into Student(Studentid,Studentname,age) values(17001,'学生A',18)";
        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
        System.out.println("影响的数据行：" + len);
        
        //修改数据
        String sql = " update Student set Studentid=17001,Studentname='学生A',age=17\r\n" + 
        		"where 学生编号=170001 ";
        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
        System.out.println("影响的数据行：" + len);
   
        //删除数据 
        String sql = "delete from Student where Studentid=170001";
        int len = stmt.executeUpdate(sql) ;	// 执行SQL返回更新的数据行
        System.out.println("影响的数据行：0" + len);

        
        //查询数据
        String sql = "select * from Student" ;
        ResultSet rs = stmt.executeQuery(sql) ;			// 实现数据查询
        while (rs.next()) {							// 循环取出返回的每一行数据
        	String Studentid = rs.getString("Studentid");	//String Studentid = rs.getString(1);
            String Studentname = rs.getString("Studentname");	//String Studentname = rs.getString(2);
            String Classid = rs.getString("Classid");	//String Classid = rs.getString(3);
            Date Birthday = rs.getDate("Birthday");		//Date Birthday = rs.getDate(4);
            String Sex = rs.getString("Sex"); 			//String Sex = rs.getString(5);
            System.out.println(Studentid + "，" + Studentname + "，" + Classid + "，" + Birthday + "，" + Sex);
        }
		*/
     // 第四步：关闭数据库
        conn.close();					
    }

}
