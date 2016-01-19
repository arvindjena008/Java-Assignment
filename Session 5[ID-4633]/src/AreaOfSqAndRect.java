
public class AreaOfSqAndRect 
{
  	double len,bre,side,rect,square;

	@Override
	public String toString() {
		return "AreaOfSqAndRect [len=" + len + ", bre=" + bre + ", side=" + side + ", rect=" + rect + ", square="
				+ square + "]";
	}

	public AreaOfSqAndRect(double len, double bre) {
		this.len = len;
		this.bre = bre;
		rect=len*bre;
		System.out.println("length = "+len);
  		System.out.println("breadth = "+bre);
  		System.out.println("Area of a rectangle = "+rect);
	}

	public AreaOfSqAndRect(double side) 
	{
		this.side = side;
		square=Math.pow(side, 2);
		System.out.println("side = "+side);
  		System.out.println("Area of a square = "+square);
	}
}
