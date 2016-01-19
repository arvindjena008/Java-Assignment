
public class Employee {
	private String name;
	private int age;
	private float salary;
	private static String companyname="ACADGILD";
	Employee(){
		name="xyz";
		age=29;
		salary=(float) 10000.00;
	}
	Employee(String name,int age,float salary){
		this.name=name;
		if(age>=1&&age<=100){
		this.age=age;
		return;
		}
		else{
		System.out.println("invalid age");
		this.age=0;
		}
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", Companyname=" +companyname+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=1&&age<=100){
			this.age=age;
			return;
			}
			else{
			System.out.println("invalid age");
			this.age=0;
			}
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static String getCompanyname() {
		return companyname;
	}
	public static void setCompanyname(String companyname) {
		Employee.companyname = companyname;
	}
	
	
}
