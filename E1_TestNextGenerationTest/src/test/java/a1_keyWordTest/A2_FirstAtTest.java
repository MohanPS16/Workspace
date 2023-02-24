package a1_keyWordTest;

import org.testng.annotations.Test;

public class A2_FirstAtTest {

	@Test
	public static void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test
	public static void searchProduct(){
		System.out.println("search product success");
	}
	@Test
	public static void addToCart(){
		System.out.println("add to cart success");
	}
	@Test
	public static void payment(){
		System.out.println("payment success");
	}
	@Test
	public static void cancleOrder(){
		System.out.println("cancel order success");
	}
	@Test
	public static void trackOrder(){
		System.out.println("track order success");
	}
}
