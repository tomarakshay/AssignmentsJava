package training.calculate;

public class SalariedWorker extends Worker {
	
	 private int hours ;
	 SalariedWorker    (String n, float r, int h)
	   {
		   super(n,r);
		   hours = h;
	   }
		public void com()
		{
			int weeks = hours/40;
		
			System.out.println("salary is "+rate*weeks );
		}


}
