import java.util.Scanner;

public class AreaOfRect implements Shape
{
	public static void main(String[] args) 
	{
		AreaOfRect obj1 = new AreaOfRect();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the shape name to be drawn : ");
		String figure = in.nextLine();
		System.out.print("Enter the Area of the shape : ");
		double AreaOfFig = in.nextDouble();
		obj1.draw(figure);
		System.out.println(" with an area of "+obj1.getArea(AreaOfFig)+" cm sq units");
		in.close();
	}

	@Override
	public void draw(String fig) 
	{
		System.out.print("Draw a shape "+fig);
	}

	@Override
	public double getArea(double area)
	{
		return area;
	}

}
