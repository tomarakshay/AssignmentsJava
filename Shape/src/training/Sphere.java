package training;

	class Sphere extends Shape3d
	{
		public  double r;
		

		public void setR(double r) {
			this.r = r;
		}

		public double  SurfaceArea(){
			 
		  return (double)(3.14*r*r);
		  
		 }
		 public double Volume(){
		  
		  return (double) (1.33333333334*3.14*r*r*r);
		 }
		
}
