
public class Student {
	int no;
	String name;
	private int age;
	String sex;
	double score;
	static int n;
	
	public Student(int no, String name, String sex, double score)
	{
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.score = score;
		Student.n++;
	}
	
	public Student()
	{
		this(17001, "小明", "男", 80);
		Student.n++;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if(age < 18)
		{
			System.out.println("年龄必须大于18岁！");
		}
		else
		{
			this.age = age;
		}
		
	}

	public int getNo()
	{
		return no;
	}
	public String getName()
	{
		return name;
	}
	public String getSex()
	{
		return sex;
	}
	public double getScore()
	{
		return score;
	}
	public void changeScore(double score)
	{
		this.score = score;
	}
}
