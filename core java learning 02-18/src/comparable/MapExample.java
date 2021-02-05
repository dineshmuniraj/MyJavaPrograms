import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Nagendra");
		names.add("Sunil");
		names.add("Nagendra");
		names.add("Amog");
		names.add("Nagendra");
		names.add("James");
		names.add("Sunil");
		names.add("Nagendra");
		names.add("James");
		names.add("Sunil");
		names.add("Nagendra");
		names.add("James");
		names.add("Sunil");
		names.add("Nagendra");
		
		
		ListIterator<String> list=names.listIterator();
		Map<String,Integer> maps=new HashMap<>();
		while(list.hasNext()) {
			String name=list.next();
			if(maps.containsKey(name)) {
				list.set(name+maps.get(name));
				maps.put(name, maps.get(name)+1);
			}else {
				maps.put(name, 1);
			}
		}
		System.out.println(names);
	}
	
}