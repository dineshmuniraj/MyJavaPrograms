import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample2 {

	public static void main(String[] args) {
		Map<String,Integer>  maps=new LinkedHashMap<String,Integer>();
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
		
	}
}
