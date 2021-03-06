package comparable;
import java.util.Comparator;

public class SortByColor implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getColor().compareTo(o2.getColor());
	}

}
