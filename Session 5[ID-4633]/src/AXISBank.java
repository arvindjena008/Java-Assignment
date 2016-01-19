public class AXISBank extends Bank
{
	double principle,time;
	  public void RateOfInterest(double principle,double time)
	  {
		  double rate=9;
		  this.principle=principle;
		  this.time=time;
		System.out.println("S.I for AXIS bank = "+((principle*rate*time)/100));
		  
	  }
}
