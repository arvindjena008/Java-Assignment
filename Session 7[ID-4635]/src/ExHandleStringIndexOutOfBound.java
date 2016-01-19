

public class ExHandleStringIndexOutOfBound {

	public static void main(String[] args) {
		String name="JAVA";
		try
		{
			System.out.println(name.charAt(10));
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("The index of the string is out of bound..........");
		}
		catch (Exception e)
		{
			System.out.println("please check once again");
		}
		finally
		{
			System.out.println(name.charAt(2));
			System.out.println(".......END......");
		}
	}

}
