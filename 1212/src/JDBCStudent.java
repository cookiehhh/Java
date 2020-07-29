import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCStudent {

	private final String dbdriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String url = "jdbc:sqlserver://localhost:1433;DatabaseName=javastudent";
	private final String username = "sa";
	private final String passwd = "4210";

	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public List selectStudent() {
		List<Student> slist = new ArrayList<Student>();
		try {
			Class.forName(dbdriver);
			connection = DriverManager.getConnection(url, username, passwd);

			ps = connection.prepareStatement("select * from student");
			// ps.setString(1, num);

			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				double chinese = rs.getDouble(3);
				double math = rs.getDouble(4);
				double english = rs.getDouble(5);
				Student student = new Student(id, name, chinese, math, english);

				slist.add(student);

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ö´ÐÐ²éÑ¯²Ù×÷Ê§°Ü£º" + e.getMessage());
		} finally {
			try {
				rs.close();
				ps.close();
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return slist;
	}

}
