package testCases;

import io.cucumber.java.en.Given;

public class StepDefinition {

	@Given ("login with valid data")
	public void validLogin(){
		System.out.println("--login with valid data--");
	}

	@Given ("login with invalid data")
	public void invalidLogin(){
		System.out.println("---login with invalid data--");
	}

	@Given ("login with guest data")
	public void guestLogin(){
		System.out.println("----login with guest data----");
	}

	@Given ("login with admin data")
	public void adminLogin(){
		System.out.println("---login with admin data---");
	}

	@Given ("payment with valid data")
	public void validPayment(){
		System.out.println("---payment with valid data---");
	}

	@Given ("payment with invalid data")
	public void invalidPayment(){
		System.out.println("---payment with invalid data---");
	}

	@Given ("payment with guest data")
	public void guestPayment(){
		System.out.println("---payment with guest data---");
	}


	
	@Given ("search app with mobile")
	public void searchMobile(){
		System.out.println("----search app with mobile---");
	}

	
	@Given ("search app with laptop")
	public void searchLaptop(){
		System.out.println("---search app with laptop---");
	}

	
	@Given ("search app with hearphone")
	public void searchHearPhone(){
		System.out.println("---search app with hearphone---");
	}

}
