public class CommercialBuilding extends Building {
    int employee;
    String comercialtype;
	public CommercialBuilding(String BuildingName, String BuildingPlace, int employee, String comercialtype) 
	{
		super(BuildingName, BuildingPlace);
		this.employee=employee;
		this.comercialtype=comercialtype;
	}
	void display()
	{
		Display();
		System.out.println("comercial type ="+comercialtype);
		System.out.println("no. of employee worked in this building = "+employee);
	}

}
