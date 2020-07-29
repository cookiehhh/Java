
public class Box {
	double lenth;
	double width;
	double heigh;
	
	public Box(double lenth , double width , double heigh) 
	{
		this.lenth = lenth;
		this.width = width;
		this.heigh = heigh;
	}
	
	public Box()
	{
		this(5,5,5);
	}
	
	public double volume()
	{
		return lenth*width*heigh;
	}
}
