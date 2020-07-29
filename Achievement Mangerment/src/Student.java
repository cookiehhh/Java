
public class Student {
	private int number;
	private String name;
	private int english;
	private int math;
	private int java;
	private int average;
	private int total;
	
	public Student(){}
	
	public Student(int number, String name, int english, int math, int java){
		
		this.number = number;
		this.name = name;
		this.english = english;
		this.math = math;
		this.java = java;
		total = english + math + java;
		average = total/3;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	

}
