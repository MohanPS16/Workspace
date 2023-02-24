package a1_keyWordTest;

import org.testng.annotations.Test;

public class B2_TimeOutTest {

	@Test(priority=1, invocationTimeOut=4000)//maximum timeout is 4secs
	public static void loginApp() throws InterruptedException{
		Thread.sleep(5000);//thread.sleep is higher than the maximum timeout limit
		System.out.println("login e-com app success");
	}
}
