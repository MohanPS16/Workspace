package a1_keyWordTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B6_ExpectedException {

	@Test(priority=1, expectedExceptions={ArithmeticException.class})
	public static void loginApp(){
		
		System.out.println("Open browser");
		System.out.println("Enter url");
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click login button");
		System.out.println("Verify welcome meassage");
		
		
		System.out.println("Click Logout");//Element Not Intractable Exception
		int i=1/0;//Arithmetic Exception
	
	
	}
}
