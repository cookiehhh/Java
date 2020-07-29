
public class Student {
	private int id;
	private String name;
	private	String sex;
	private int phone;
	private String address;
	
	public Student(int id, String name, String sex, int phone, String address) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
	}
	
	public String show() {
		return id + name + sex + phone + address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
