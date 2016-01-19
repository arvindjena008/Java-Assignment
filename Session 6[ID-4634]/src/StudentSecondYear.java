
public class StudentSecondYear implements Student
{
	private	int RollNo;
	private String Name;
	private int registration;
	public StudentSecondYear(int rollNo, String name, int registration) {
		super();
		RollNo = rollNo;
		Name = name;
		this.registration = registration;
	}
	public void display(int marks1,int marks2)
	{
		System.out.println("Rollno = "+RollNo);
		System.out.println("name = "+Name);
		System.out.println("registration No= "+registration);
		System.out.println("C lang. = "+marks1);
		System.out.println("SQL = "+marks2);
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	
	
}
