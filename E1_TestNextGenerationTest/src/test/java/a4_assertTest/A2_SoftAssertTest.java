package a4_assertTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A2_SoftAssertTest {

	@Test
	public void performAssert(){
		System.out.println("Open Browser");
		System.out.println("Load URL");
		System.out.println("Get Title");
		
		String expected="Google";
		String actual="Googl";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected, "Test Case failed but ignored");
		System.err.println("Fill Forms");
		s.assertAll();
		
	}
}
