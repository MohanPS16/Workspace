package a1_keyWordTest;

import org.testng.annotations.Test;

public class B4_DescriptionTest {

	@Test(priority=1, description="login as admin to place order")
	public static void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2, description="searching mobile products")
	public static void searchProduct(){
		System.out.println("search product success");
	}
	@Test(priority=3, description="add to cart mobile products")
	public static void addToCart(){
		System.out.println("add to cart success");
	}
	@Test(priority=4, description="online payment")
	public static void payment(){
		System.out.println("payment success");
	}
	@Test(priority=5, description="cancel mobile products")
	public static void cancleOrder(){
		System.out.println("cancel order success");
	}
	@Test(priority=6, description="track order")
	public static void trackOrder(){
		System.out.println("track order success");
	}
}
