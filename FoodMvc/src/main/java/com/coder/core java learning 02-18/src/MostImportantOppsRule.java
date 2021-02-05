package oops;

class Bottle {
	
	public void foo() {
		System.out.println("@(@(@*@*@&@&@");
	}
	
	public void display() {
		System.out.println("Hey all bottle info is displayed!!!!!!!");
	}
}

class Cello extends Bottle{
	
	public void drink() {
		System.out.println("Please drink water");
	}
	
	@Override
	public void display() {
		System.out.println("Hey all Cello info is displayed!!!!!!!");
	}
}

public class MostImportantOppsRule {
	
	public static void main(String[] args) {
		Bottle ref;
		ref=new Bottle();
		ref.foo();  //"@(@(@*@*@&@&@")
		ref.display();  //Hey all bottle info is displayed!!!!!!!
		Cello cello=new Cello();
		cello.display(); //Hey all Cello info is displayed!!!!!!!
		cello.foo(); //super class foo
		cello.drink(); //"Please drink water
	}

}
