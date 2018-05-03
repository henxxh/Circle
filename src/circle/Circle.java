package circle;

public class Circle {

		private double redius;
		private double Permeter;
		private double Area;
		
		
		
		public Circle() {}
		
		public Circle(double redius) {
			this.setRedius(redius);
		}

		public double getRedius() {
			return redius;
		}
		public void setRedius(double rediuss) {
			if(rediuss<=0)
			{
				redius=1;
			}else
			{
				this.redius = rediuss;
			}		
		}
		public double getPermeter() {
			Permeter=2*redius*Math.PI;
			return Permeter;
		}

		public double getArea() {
			Area=redius*redius*Math.PI;
			return Area;
		}
		
}
