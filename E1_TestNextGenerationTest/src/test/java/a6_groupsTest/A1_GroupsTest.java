package a6_groupsTest;

import org.testng.annotations.Test;

public class A1_GroupsTest {

	
	@Test(priority=1,groups={"SEARCH","PAYMENT","TRACK","CANCEL"})
	public void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2,groups={"SEARCH","PAYMENT","TRACK","CANCEL"})
	public void searchProduct(){
		System.out.println("search product success");
	}
	@Test(priority=3,groups={"PAYMENT","TRACK","CANCEL"})
	public void addToCart(){
		System.out.println("add to cart success");
	}
	@Test(priority=4,groups={"PAYMENT","TRACK","CANCEL"})
	public void payment(){
		System.out.println("payment success");
	}
	@Test(priority=5,groups={"CANCEL"})
	public void cancleOrder(){
		System.out.println("cancel order success");
	}
	@Test(priority=6,groups={"TRACK"})
	public void trackOrder(){
		System.out.println("track order success");
	}
}
