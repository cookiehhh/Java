
public class Bus {
	private String num;
	private String type;
	private double price;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	

	public Bus() {}
	public Bus(String num, String type, double price) {
		this.num = num;
		this.type = type;
		this.price = price;
	}
}
