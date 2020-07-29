
public class Student {

	private String id;
	private String name;
	private double chinese;
	private double math;
	private double english;
	
	public Student(String id, String name, double chinese, double math, double english) {
		super();
		this.id = id;
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getChinese() {
		return chinese;
	}
	public void setChinese(double chinese) {
		this.chinese = chinese;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", chinese=" + chinese + ", math=" + math + ", english="
				+ english + "]";
	}
	
	
	
}
