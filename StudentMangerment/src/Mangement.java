import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mangement {
    private static Connection conn = null;
    static DateConnection dcon = new DateConnection();
		
	public static void insert(Student newStu){		
			conn = dcon.getConnection( );			
			int i = 0;
		    String sql = "insert into student (id,name,sex,age,address) values(?,?,?,?,?)";
		    PreparedStatement pstmt;
		    try {   
		        pstmt = (PreparedStatement) conn.prepareStatement(sql);
		        pstmt.setString(1, newStu.getId());
		        pstmt.setString(2, newStu.getName());
		        pstmt.setString(3, newStu.getSex());
		        pstmt.setString(4, newStu.getAge());
		        pstmt.setString(5, newStu.getAddress());
		        i = pstmt.executeUpdate();
		        System.out.println("影响的数据行: " + i);
		        pstmt.close();
				dcon.closeConnection( );
		    } catch (SQLException e) {
		        e.printStackTrace();		        
		}
	}

	public static void update(int choice, String id, String newMessage) {
		String sql = null;
		switch (choice) {
			case 1:
				sql = updateId(id, newMessage);
				break;
			case 2:
				sql = updateName(id, newMessage);
				break;
			case 3:
				sql = updateSex(id, newMessage);;
				break;
			case 4:
				sql = updateAge(id, newMessage);;
				break;
			case 5:
				sql = updateAddress(id, newMessage);;
				break;
			default:
				break;
		}
		conn = dcon.getConnection( );
	    int i = 0;
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	        pstmt.close();
	        dcon.closeConnection( );
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static String updateId(String id, String newMessage){
		String sql = "update student set id='" + newMessage + "' where id='" + id + "'";
	    return sql;
	}
	public static String updateName(String id, String newMessage){
		String sql = "update student set name='" + newMessage + "' where id='" + id + "'";
	    return sql;
	}
	public static String updateSex(String id, String newMessage){
		String sql = "update student set sex='" + newMessage + "' where id='" + id + "'";
	    return sql;
	}
	public static String updateAge(String id, String newMessage){
		String sql = "update student set age='" + newMessage + "' where id='" + id + "'";
	    return sql;
	}
	public static String updateAddress(String id, String newMessage){
		String sql = "update student set address='" + newMessage + "' where id='" + id + "'";
	    return sql;
	}
	
	public static void delete(String id) {
		conn = dcon.getConnection( );
	    int i = 0;
	    String sql = "delete from student where id='" + id + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("影响的数据行: " + i);
	        pstmt.close();
	        dcon.closeConnection();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void output() {
		conn = dcon.getConnection( );
		String sql = "select * from student";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void search(int choice, String massage){
		conn = dcon.getConnection( );
		String sql = null;
		switch (choice) {
			case 1:
				sql = searchId(massage);
				break;
			case 2:
				sql = searchName(massage);
				break;
			case 3:
				sql = searchSex(massage);
				break;
			case 4:
				sql = searchAddress(massage);
				break;
			default:
				break;
		}
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");	                
	             }
	            System.out.println("");
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	}
	public static String searchId(String id){
		String sql = "select * from student where id='" + id + "'";
	    return sql;
	}
	public static String searchName(String name){
		String sql = "select * from student where name='" + name + "'";
		return sql;
	}
	public static String searchSex(String sex){
		String sql = "select * from student where sex='" + sex + "'";
		return sql;
	}
	public static String searchAddress(String address){
		String sql = "select * from student where address='" + address + "'";
		return sql;
	}
}
