import java.util.Set;
import java.util.TreeSet;

public class TreeSetCustomerDemo {
	public static void main(String[] args) {
		
		Set<Customer> customers=new TreeSet<Customer>();
		Customer customer1=new Customer(1234, "Jhon", "jhon@gmail.com");
		Customer customer2=new Customer(1235, "Jhon", "jhon12@gmail.com");
		Customer customer3=new Customer(1236, "Ameya", "ameya@gmail.com");
		Customer customer4=new Customer(1237, "Rober", "Robert@gmail.com");
		Customer customer5=new Customer(1236, "Ameya", "ameya@gmail.com");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		
		for(Customer customer : customers) {
			System.out.println(customer);
		}

	}
}
