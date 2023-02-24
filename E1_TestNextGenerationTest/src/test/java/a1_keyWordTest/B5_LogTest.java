package a1_keyWordTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B5_LogTest {

	@Test(priority=1, description="login as admin to place order")
	public static void loginApp(){
		//System.out.println("login e-com app success");
		Reporter.log("login e-com app success");
	}
	@Test(priority=2, description="searching mobile products")
	public static void searchProduct(){
		//System.out.println("search product success");
		Reporter.log("search product success");
	}
	@Test(priority=3, description="add to cart mobile products")
	public static void addToCart(){
		//System.out.println("add to cart success");
		Reporter.log("add to cart success");
	}
	@Test(priority=4, description="online payment")
	public static void payment(){
		//System.out.println("payment success");
		Reporter.log("Payment success");
	}
	@Test(priority=5, description="cancel mobile products")
	public static void cancleOrder(){
//		System.out.println("cancel order success");
		Reporter.log("cancel order success");
	}
	@Test(priority=6, description="track order")
	public static void trackOrder(){
//		System.out.println("track order success");
		Reporter.log("track order success");
	}
}
