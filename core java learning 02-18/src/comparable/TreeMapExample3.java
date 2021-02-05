import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		Map<String,Integer>  maps=new TreeMap<String,Integer>();
		maps.put("Nagendra",123);
		maps.put("Ameya",432);
		maps.put("Robert",3);
		maps.put("James",342);
		maps.put("Kushal",45);
		
		Set<String> keys=maps.keySet();
		for(String key:keys) {
			Integer value=maps.get(key);
			System.out.println("Key = "+key+" and value = "+value);
		}
		System.out.println("@))@@)");
		Set<Map.Entry<String,Integer>> entries=maps.entrySet();
		for(Map.Entry<String,Integer> entry:entries) {
			System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
		}
		
	}
}
