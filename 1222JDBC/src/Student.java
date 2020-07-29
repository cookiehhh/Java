
public class Student {
	private String studentId;
	private String studentName;
	private String className;
	private int Score;
	private String courseName;
	
	public Student() {
		super();
	}
	public Student(String studentId, String studentName, String className, int score, String courseName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		Score = score;
		this.courseName = courseName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", Score=" + Score + ", courseName=" + courseName + "]";
	}
	
	
}
