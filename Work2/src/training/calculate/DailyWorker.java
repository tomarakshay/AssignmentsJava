package training.calculate;

public class DailyWorker  extends Worker

{  
	private int hours ;
   DailyWorker (String n, float r, int h)
   {
	   super(n,r);
	   hours = h;
   }
	public void com()
	{
		int days = hours/24;
		System.out.println("salary is "+rate*days );
		
	}

}
