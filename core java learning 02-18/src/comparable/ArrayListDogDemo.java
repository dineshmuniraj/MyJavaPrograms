import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDogDemo {

	public static void main(String[] args) {
		 
		 List<Dog> dogs=new ArrayList<Dog>();
		 
		 dogs.add(new Dog("Mocha", "Red", 100));
		 dogs.add(new Dog("Jacks", "White", 90));
		 dogs.add(new Dog("Pops", "Black", 80));
		 dogs.add(new Dog("Jebara", "Yellow", 500));
		 dogs.add(new Dog("Moto", "Green", 200));
		 dogs.add(new Dog("Pops", "Green", 20));
		 dogs.add(new Dog("Tommy", "Purple", 300));
		 dogs.add(new Dog("Rocket", "Brown", 10));
		 dogs.add(new Dog("Pops", "Magneta", 344));
		
		 
		 for(Dog d:dogs) {
			 //toString - give dogs information into string representation
			 System.out.println(d);
		 }
		 
		 Collections.sort(dogs);
		 System.out.println("@@(@(@(@(After Sorting....");
		 for(Dog d:dogs) {
			 //toString - give dogs information into string representation
			 System.out.println(d);
		 }
		 
		 Collections.sort(dogs,new SortByColor());
		 System.out.println("@@(@(@(@(Sorting by color....");
		 for(Dog d:dogs) {
			 //toString - give dogs information into string representation
			 System.out.println(d);
		 }
		 
	}
}
