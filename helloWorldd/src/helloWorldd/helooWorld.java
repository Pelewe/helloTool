package helloWorldd;

public class helooWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Hello World---------");
		SalesData data =new SalesData();
	
		displayGreeting();
		data.display();
	}
		
	private static void displayGreeting() {
		System.out.println("Hello Happy SALES PEOPLE");
		System.out.println("THIS APP SHOWS SALES DATA");
	}
}
