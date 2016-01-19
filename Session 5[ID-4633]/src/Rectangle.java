
public class Rectangle extends Area{
  Rectangle(double length, double breadth) {
		super(length, breadth);
		
	}

double DisplayArea()
  {
	System.out.println("length="+length);
	System.out.println("breadth="+breadth);
	System.out.print("The area of Rectangle is:");
	return length*breadth;
  }
}
