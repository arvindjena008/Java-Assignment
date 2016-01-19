

public class ExHandleNumberFormat {

	public static void main(String[] args) 
	{
		try
		{
			int num=Integer.parseInt ("XYZ");
			System.out.println(num);
		}
		catch(NumberFormatException n)
		{
			System.out.println("String cannot be parsed to int........");
		}
		catch (Exception e)
		{
			System.out.println("please check once again");
		}
		finally
		{
			System.out.println("End Of the Program...");
		}
	}

}
