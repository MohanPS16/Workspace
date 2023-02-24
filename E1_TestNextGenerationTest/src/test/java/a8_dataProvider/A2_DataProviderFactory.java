package a8_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class A2_DataProviderFactory {

	String username;
	String password;
	String mobile;
	String charger;
	
	@Factory(dataProvider="MyMobileData")
	public A2_DataProviderFactory(String username, String password, String mobile, String charger){
		this.username=username;
		this.password=password;
		this.mobile=mobile;
		this.charger=charger;
		
	}
	@Test(priority=1)
	public void loginTest(){
		System.out.println("Enter user Name		:"+username);
		System.out.println("Enter user name		:"+password);
		System.out.println("Click login");
	}
	@Test(priority=2)
	public void addToCart(){
		System.out.println("Add mobile   :"+mobile);
		System.out.println("Add charger  :"+charger);
		System.out.println("Click add to cart");
	}
	@DataProvider(name="MyMobileData")
	public static Object[][] getData(){
		Object [][] data=new Object[3][4];
		
		data[0][0]="User A";
		data[0][1]="pass@1234";
		data[0][2]="samsung";
		data[0][3]="type b - 12w";

		data[1][0]="User B";
		data[1][1]="pass@1234";
		data[1][2]="samsung";
		data[1][3]="type b - 12w";
		
		data[2][0]="User C";
		data[2][1]="pass@1234";
		data[2][2]="samsung";
		data[2][3]="type b - 12w";
		
		
		return null;
		
	}
}
