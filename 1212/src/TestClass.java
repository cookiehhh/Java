import java.util.List;

public class TestClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCStudent jdbc = new JDBCStudent();
		List<Student> list = jdbc.selectStudent();
		for(Student s : list)
			System.out.println(s);

	}

	

}
