package inHeritance;

public class FlipKart extends EcommerceTemplate{
	public static void main(String[] args) {
		paymentgateway();
		searchbar();
		sort();
		supercoins();
	}
	public static void supercoins(){
		System.out.println("Free Super coins for every purchase Above Rs.1000/-");
	}
}
