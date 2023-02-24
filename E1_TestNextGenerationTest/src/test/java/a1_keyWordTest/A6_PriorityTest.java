package a1_keyWordTest;

import org.testng.annotations.Test;

public class A6_PriorityTest {

	@Test(priority=-1)
	public static void loginDB(){
		System.out.println("login Db");
	}
	
	@Test(priority=0)
	public static void openBrowser(){
		System.out.println("open browser");
	}
	
	@Test(priority=1)
	public static void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2)
	public static void searchProduct(){
		System.out.println("search product success");
	}
	@Test(priority=3)
	public static void addToCart(){
		System.out.println("add to cart success");
	}
	@Test(priority=4)
	public static void a_cashPayment(){
		System.out.println("payment success");
	}
	@Test(priority=4)
	public static void b_onlinePayment(){
		System.out.println("payment success");
	}
	@Test(priority=5)
	public static void cancleOrder(){
		System.out.println("cancel order success");
	}
	@Test(priority=6)
	public static void trackOrder(){
		System.out.println("track order success");
	}
}
