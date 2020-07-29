
public abstract class Singer {
	public String name;
	public String style;
	
	public Singer(String name, String style) {
		this.name = name;
		this.style = style;
	}
	
	public abstract void sing();
	
}
