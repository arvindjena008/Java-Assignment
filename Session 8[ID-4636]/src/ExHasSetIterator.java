import java.util.HashSet;
import java.util.Iterator;

public class ExHasSetIterator {

	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();  
		al.add("Arvind"); 
		al.add("Anirudh");
		al.add("Bikas");  
		al.add("Diwakar");  
		al.add("Rahul"); 
		al.add("Arvind"); 
		al.add("Anirudh");
		al.add("Diwakar");  
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
