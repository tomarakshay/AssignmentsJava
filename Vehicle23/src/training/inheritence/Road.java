package training.inheritence;


public class Road {

	public static void main(String[] args) {
		Truck truck = new Truck("Red",12,"TATA");
		truck.showDetails();
		Bus bus=new Bus("Blue",8,"MERCEDEZ");
		bus.showDetails();
		Car car=new Car("Orange",4,"MARUTI");
		car.showDetails();

	}

}

