public class SBIBank extends Bank
{
	double principle,time;
	  public void RateOfInterest(double principle,double time)
	  {
		  double rate=8;
		  this.principle=principle;
		  this.time=time;
		System.out.println("S.I for SBI bank = "+((principle*rate*time)/100));
		  
	  }
}
