package train;

public class Shape {

	
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void area(double radius) {
		double area=3.142*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	public void peri(double radius) {
		double peri=2*3.142*radius;
		System.out.println("Perimeter of Circle : "+peri);
	}
	public void peri(int side ) {
		int peri=4*side;
		System.out.println("Perimeter of Square : "+peri);
	}
	public void peri(int lenght, int breadth) {
		int peri=2*(lenght+breadth);
		System.out.println("Perimeter of Rectangle : "+peri);
	}
	
}
