import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
		Set<String> sets=new TreeSet<String>();
		sets.add("Nagendra");
		sets.add("Michal");
		sets.add("Jhon");
		sets.add("Rometa");
		sets.add("Ameya");
		sets.add("Maks");
		sets.add("Maks");
		sets.add("Maks");
		sets.add("Maks");
		
		for(String str:sets) {
			System.out.println(str);
		}
		System.out.println("Accessing elements using Iterator");
		Iterator<String> it=sets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
