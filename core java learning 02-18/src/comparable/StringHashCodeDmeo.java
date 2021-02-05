
public class StringHashCodeDmeo {

	
	public static void main(String[] args) {
		String str1=new String("India");
		String str2="India";
		String str3=new String("India");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
	
}
