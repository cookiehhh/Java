import java.sql.*;

public class ConManager {
    final static String cfn = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
    
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;
        try {
            Class.forName(cfn);
            con = DriverManager.getConnection(url,"sa","4210");
            
            String sql = "select * from Student";
            statement = con.prepareStatement(sql);
            res = statement.executeQuery();
            while(res.next()){
                String title = res.getString("Studentname");                                                                                                                                             ;
                System.out.println("������"+title);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(res != null) res.close();
                if(statement != null) statement.close();
                if(con != null) con.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
    }
}