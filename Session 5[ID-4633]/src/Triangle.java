
public class Triangle extends Area {
    double s;
	Triangle(double a, double b, double c) {
		super(a, b, c);		
	}
	double DisplayArea()
	  {
		System.out.println("Side 1="+a);
		System.out.println("Side 2="+b);
		System.out.println("Side 3="+c);
		System.out.print("The area of Triangle is:");
		s=(a+b+c)/2;
		double a1=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return a1;
	  }

}
