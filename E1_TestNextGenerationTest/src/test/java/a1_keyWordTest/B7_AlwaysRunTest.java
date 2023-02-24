package a1_keyWordTest;

import org.testng.annotations.Test;

public class B7_AlwaysRunTest {

	@Test(priority=1)
	public static void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2,dependsOnMethods="loginApp")
	public static void searchProduct(){
		int i=1/0;
		System.out.println("search product success");
	}
	@Test(priority=3,dependsOnMethods="searchProduct",alwaysRun=true)
	public static void addToCart(){
		System.out.println("add to cart success");
	}
	@Test(priority=4,dependsOnMethods="addToCart")
	public static void payment(){
		System.out.println("payment success");
	}
	@Test(priority=5,dependsOnMethods="payment")
	public static void cancelOrder(){
		System.out.println("cancel order success");
	}
	@Test(priority=6,dependsOnMethods="cancelOrder")
	public static void trackOrder(){
		System.out.println("track order success");
	}
}
