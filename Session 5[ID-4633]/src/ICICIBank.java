public class ICICIBank extends Bank
{
	double principle,time;
	  public void RateOfInterest(double principle,double time)
	  {
		  double rate=7;
		  this.principle=principle;
		  this.time=time;
		System.out.println("S.I for ICICI bank = "+((principle*rate*time)/100));
		  
	  }
}
