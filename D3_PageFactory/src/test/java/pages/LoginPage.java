package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(how=How.ID,using="id_username")
	private WebElement username;
	public void enterUserName(String username){
		//wd.findElement(By.id("id_username")).sendKeys(username);
		this.username.sendKeys(username);
	}
	@FindBy(how=How.ID,using="id_password")
	private WebElement password;
	public void enterPassword(String password){
		//wd.findElement(By.id("id_password")).sendKeys(password);
		this.password.sendKeys(password);
	}
	public void clickLoginButton(){
		//wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		this.password.click();
	}
	@FindBy(how=How.ID,using="Sign Up Now")
	private WebElement signup;
	public void clickSignUpLink(){
		//wd.findElement(By.linkText("Sign Up Now")).click();
		signup.click();
	}

}
