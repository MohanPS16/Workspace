package a3_annotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A3_BeforeTest {
	
	@BeforeTest
	public void loginNetwork(){
		System.err.println("=====Login Network=====");
	}
	@AfterTest
	public void logoutNetwork(){
		System.err.println("=====Logout Network=====");
	}
	@BeforeClass
	public void loginDB(){
		System.out.println("*****Login Db*****");
	}
	@AfterClass
	public void logoutDB(){
		System.out.println("*****Logout Db*****");
	}
	@BeforeMethod
	public void openBrowser(){
		System.err.println("---->Open Browser<----");
	}
	@AfterMethod
	public void closeBrowser(){
		System.err.println("---->Close Browser<----");
	}
	@Test(priority=1)
	public void loginApp(){
		System.out.println("login e-com app success");
	}
	@Test(priority=2)
	public void searchProduct(){
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
