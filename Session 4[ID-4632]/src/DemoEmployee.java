
public class DemoEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("arvind",240,(float)10000.57);
		Employee e2=new Employee();
		System.out.println(e1+"\n"+e2);
		e2.setName("qrs");
		e1.setAge(24);
		System.out.println(e2.getName());
		System.out.println(e1.getAge());
		System.out.println(e1+"\n"+e2);
		Employee.setCompanyname("Java Acadgild");
		System.out.println(e1+"\n"+e2);
		
	}

}
