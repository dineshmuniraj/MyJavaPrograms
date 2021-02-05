package oops;

public class SamsungMain {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.ringtone();
		mobile.call();
		System.out.println("@(@(@*@&@@@@@@^%%%%");
		Samsung samsung=new Samsung();
		samsung.bluetooth();
		samsung.ringtone(); //calling overriden method
		mobile.call();
	}
}
