
public class DemoBuiding {

	public static void main(String[] args)
	{
	  CommercialBuilding cobj = new CommercialBuilding("AJ AutoExpo","Banglore",1000,"Automobile Repair Shop");
	  AgricultureBuilding aobj= new AgricultureBuilding("AJ Chiken farm","Delhi",50,10000);
	  cobj.display();
	  System.out.println("..........................................");
      aobj.display();
	}

}
