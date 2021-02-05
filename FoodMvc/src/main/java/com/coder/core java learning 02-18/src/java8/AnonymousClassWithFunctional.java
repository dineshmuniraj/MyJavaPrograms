package java8;


interface DataPusher{
	public void accept(String str);
}

public class AnonymousClassWithFunctional {
	public static void main(String[] args) {
		/*DataPusher  dataPusher =new DataPusher() {
			@Override
			public void accept(String str) {
				System.out.println("Hey I have received this message  "+str);	
			}
		};
		
		/*DataPusher  dataPusher =(String str)-> {
				System.out.println("Hey I have received this message  "+str);	
			};*/
		
//		DataPusher  dataPusher =(String str)->System.out.println("Hey I have received this message  "+str);
		/*DataPusher  dataPusher =(str)->System.out.println("Hey I have received this message  "+str);*/
		//Lambda expression ->> lambda expression is short form of anonymous class implementing functional interface  
		DataPusher  dataPusher =str->System.out.println("Hey I have received this message  "+str);
		dataPusher.accept("Nagendra");
		
	}
}
