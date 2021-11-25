package training;

public class MainShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder c= new Cylinder();
		c.setR(5.0);
		c.setH(4.0);
		System.out.println("surface area of cylinder is " + c.SurfaceArea()+ " Volume is "+c.Volume());
	Cube g = new Cube();
	g.setSide(8);
	System.out.println("surface area of cube is "+ g.SurfaceArea()+"and volume is "+ g.Volume());
	Sphere  h = new Sphere();
	h.setR(8);
	System.out.println("surface area of Sphere is "+ h.SurfaceArea()+"and volume is "+ h.Volume());

	}

}
