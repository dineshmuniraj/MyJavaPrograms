package oops;

public class ZeeJug extends Jug{
	int capacity=4;
	String color="red";
	
	public ZeeJug() {
		super();
	}
	
	public void info() {
		System.out.println("Capacity is  = "+capacity);
		System.out.println("Color is  = "+color);
	}
	
	public void display() {
		String color="yellow"; //this is local variable
		System.out.println("Color - "+color);
		System.out.println("this.color - "+this.color);
		System.out.println("super.color - "+super.color);
		info();
		this.info();//current class ->>super class
		super.info(); //Hey go to directly super class 
	}
	
	public static void main(String[] args) {
		ZeeJug sbs=new ZeeJug();
		sbs.display();
		new ZeeJug().display();
	}

}
