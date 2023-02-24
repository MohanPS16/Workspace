package a5_failedTestRun;

import org.testng.annotations.Test;

public class A1_FailedTestRun {

	
	@Test(priority=1)
	public void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2)
	public void searchProduct(){
//		int i=1/0;
		System.out.println("search product success");
	}
	@Test(priority=3)
	public void addToCart(){
		System.out.println("add to cart success");
	}
	@Test(priority=4)
	public void payment(){
		System.out.println("payment success");
	}
	@Test(priority=5)
	public void cancleOrder(){
		System.out.println("cancel order success");
	}
	@Test(priority=6)
	public void trackOrder(){
		System.out.println("track order success");
	}
}
