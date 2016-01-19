public class Bank
{
	double principle,time;
  public void RateOfInterest(double principle,double time)
  {
	  double rate=1;
	  this.principle=principle;
	  this.time=time;
	System.out.println("S.I for other = "+((principle*rate*time)/100));
	  
  }
}
