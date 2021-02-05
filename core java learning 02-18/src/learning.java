

interface DataPush {
	public void accept(String str);
}

public class learning{
	public static void main(String[] args) {
		DataPush datapusher= new DataPush(){
		public void accept(String str) {
			System.out.println("hello" +str);
			}
		
		};
		datapusher.accept("Dinesh");
 }
}


