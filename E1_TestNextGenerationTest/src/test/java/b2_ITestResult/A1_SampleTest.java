package b2_ITestResult;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A1_SampleTest {

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
	@AfterMethod
	public void tearDown(ITestResult result){
		System.out.println("result.isSuccess()      -  "+result.isSuccess());
		System.out.println("result.getEndMillis()   -  "+result.getEndMillis());
		System.out.println("result.getHost()        -  "+result.getHost());
		System.out.println("result.getInstance()    -  "+result.getInstance());
		System.out.println("result.getInstanceName()-  "+result.getInstanceName());
		System.out.println("result.getName()        -  "+result.getName());
		System.out.println("result.getStartMillis() -  "+result.getStartMillis());
		System.out.println("result.getStatus()      -  "+result.getStatus());
		System.out.println("result.getTestName()    -  "+result.getTestName());
		System.out.println("result.getClass()       -  "+result.getClass());
		System.out.println("result.getMethod()      -  "+result.getMethod());
		System.out.println("result.getParameters()  -  "+result.getParameters());
		System.out.println("result.getTestClass()   -  "+result.getTestClass());
		System.out.println("result.getTestContext() -  "+result.getTestContext());
		System.out.println("result.getThrowable()   -  "+result.getThrowable());
		System.err.println("-----------------------------------------");
	}
}
