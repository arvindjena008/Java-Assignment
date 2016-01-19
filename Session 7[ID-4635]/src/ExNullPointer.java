
public class ExNullPointer {

		    private static String name;
		  
	public static void main(String args[])
	{  
		try
		{
			if(name.equals("Java"))
			{
				System.err.println("Welcome to Java");
			}
			System.out.println(name);
		}
		catch(NullPointerException n)
		{
			System.out.println("please put some value into name.........");
		}
		catch (Exception e)
		{
			System.out.println("please check once again");
		}
		finally
		{
		
			System.out.println(".......END......");
		}
    }
}
