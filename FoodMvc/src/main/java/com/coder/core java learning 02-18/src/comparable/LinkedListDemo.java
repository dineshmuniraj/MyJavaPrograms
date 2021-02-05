import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String... main) {
	   List<String> list=new LinkedList<String>();
	   createElements(list);
	 
	   //printing list
	   for(String e : list) {
		   System.out.println(e);
	   }
	   System.out.println("_______________@&@@--------------------------");
	   for(int x=0;x<list.size();x++) {
		   System.out.println(list.get(x));
	   }
	   
	   System.out.println("Using iterator interface!!");
	   Iterator<String> it=list.iterator();
	   while(it.hasNext()) {
		   String e=it.next();
		   System.out.println(e);
	   }
	   
	   System.out.println("Using iterator interface!!");
	   ListIterator<String> lit=list.listIterator();
	   while(lit.hasNext()) {
		   String e=lit.next();
		   System.out.println(e);
	   }
	   
	}
	
	/**
	 * this method is static since it is called by main method which is already static
	 * @param list
	 */
	public static void createElements(List<String> list) {
			list.add("Apple");
			list.add("Guava");
			list.add("PineApple");
			list.add("Mango");
			list.add("Banana");
			list.add("PineApple");
			list.add("Guava");
			list.add("Grapes");
	}
}
