package a4_assertTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A1_HardAssertTest {

	@Test
	public void performAssert(){
		System.out.println("Open Browser");
		System.out.println("Load URL");
		System.out.println("Get Title");
		
		String expected="Google";
		String actual="Google";
		Assert.assertEquals(actual, expected,"Msg - Please stop test case if wrong");
		System.err.println("Fill forms");
		
	}
}
