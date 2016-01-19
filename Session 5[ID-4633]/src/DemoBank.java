
public class DemoBank {

	public static void main(String[] args)
	{
		Bank b1 = new SBIBank();
		b1.RateOfInterest(10000, 2);
		b1=new ICICIBank();
		b1.RateOfInterest(10000, 2);
		b1=new AXISBank();
		b1.RateOfInterest(10000, 2);
		
	}

}
