package training;

public class Cylinder extends Shape3d {
	
	double r , h; 
	





public void setR(double r) {
		this.r = r;
	}
	public void setH(double h) {
		this.h = h;
	}
public double SurfaceArea()
	{
	  return (double)( 2*3.14*r*r + 2*3.14*h*r);
	   
	}
public double Volume()
{
	return (double)(3.14*r*r*h);

}



	
}
	


