import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentJDBC {
	private final String dbdriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student";
	private final String username = "sa";
	private final String passwd = "4210";

	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public List<Student> selectStudent(String courseNameSelect) {
		List<Student> slist = new ArrayList<Student>();
		try {
			Class.forName(dbdriver);
			connection = DriverManager.getConnection(url, username, passwd);

			String sql = "select Student.Studentid,Studentname,Classname,Score,Coursename\r\n" + 
					"from Student inner join Class on Student.Classid = Class.Classid \r\n" + 
					" inner join Score on Student.Studentid = Score.Studentid\r\n" + 
					" inner join Course on Score.Courseid = Course.Courseid\r\n" + 
					" where Course.Coursename = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, courseNameSelect);

			rs = ps.executeQuery();

			while (rs.next()) {
				String studentId = rs.getString(1);
				String studentName = rs.getString(2);
				String className = rs.getString(3);
				int Score = rs.getInt(4);
				String courseName = rs.getString(5);
				Student student = new Student(studentId, studentName, className, Score, courseName);

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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}

}

