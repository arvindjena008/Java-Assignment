public class AgricultureBuilding extends Building 
{
    int employee,capacity;
	public AgricultureBuilding(String BuildingName, String BuildingPlace, int employee, int capacity) 
	{
		super(BuildingName, BuildingPlace);
		this.employee = employee;
		this.capacity = capacity;
	}
	void display()
	{
		Display();
		System.out.println("Capacity of this building = "+capacity+" slot.");
		System.out.println("no. of employee worked in this building = "+employee);
	}
 
}
