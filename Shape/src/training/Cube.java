package training;

public class Cube extends Shape3d {
	
	private int side ; 
	public void setSide(int side) 
	{
		this.side = side;
	}
	public double SurfaceArea()
	{
		
		return (double)(4*side*side);
	}
	public double Volume()
	{
		return (double)(side*side*side);
	}

}
