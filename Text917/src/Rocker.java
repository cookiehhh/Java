
public class Rocker extends Singer{
	public String name;
	public String style;
	public Rocker(String name, String style) {
		super(name, style);
		
	}

	public void sing() {
		System.out.println("摇滚歌手疯狂的、歇斯底里的演唱！");
		
	}

}
