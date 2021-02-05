
public class HashCodeDemo {

	public static void main(String[] args) {
		Dog  dog1=new Dog("OAie", "white", 12);
		Dog  dog2=new Dog("OAie", "white", 12);
		Dog  dog3=new Dog("OAie", "white", 12);
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());
		System.out.println(dog3.hashCode());
	}
}
