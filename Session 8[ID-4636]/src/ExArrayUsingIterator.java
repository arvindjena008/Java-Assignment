import java.util.*;

public class ExArrayUsingIterator {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Arvind"); 
		al.add("Anirudh");
		al.add("Bikas");  
		al.add("Diwakar");  
		al.add("Rahul");  
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
