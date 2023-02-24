package a1_keyWordTest;

import org.testng.annotations.Test;

@Test
public class A3_ClassLevelTest {

	public static void loginApp(){
		System.out.println("login e-com app success");
	}
	public static void searchProduct(){
		System.out.println("search product success");
	}
	public static void addToCart(){
		System.out.println("add to cart success");
	}
	public static void payment(){
		System.out.println("payment success");
	}
	public static void cancleOrder(){
		System.out.println("cancel order success");
	}
	public static void trackOrder(){
		System.out.println("track order success");
	}
}
