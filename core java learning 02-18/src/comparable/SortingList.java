import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
	public static void main(String... main) {
		List<String> list = new ArrayList<String>();
		createElements(list);
		// printing list
		for (String e : list) {
			System.out.println(e);
		}
		
		Collections.sort(list);	

		System.out.println("_______________Elements after sorting_____");
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));
		}
	}

	/**
	 * this method is static since it is called by main method which is already
	 * static
	 * 
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
