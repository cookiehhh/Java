package cn.sdcet.db;

public class Address {
	String name;
	String telephone;
	String qq;
	public String s[];
	public String[] getS() {
		return s;
	}
	public void setS(String[] s) {
		this.s = s;
	}
	public Address(){
		super();
	}
	public Address(String name, String telephone,String qq) {
		super();
		this.name =name;
		this.telephone = telephone;
		this.qq=qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	

}
