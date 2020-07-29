import java.util.List;

public class Test {

	public static void main(String[] args) {
		String courseName = "高等数学";
		StudentJDBC jdbc = new StudentJDBC();
		List<Student> list = jdbc.selectStudent(courseName);
		for(Student s : list)
			System.out.println(s);
	}

}
