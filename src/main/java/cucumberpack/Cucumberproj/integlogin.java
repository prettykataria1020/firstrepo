package cucumberpack.Cucumberproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class integlogin {
	static WebDriver driver;
	@Given("user has launched test me")
	public void user_has_launched_test_me() {
		  
		  driver = utilclass.openBrowser("chrome");
	      driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user enters {string} & {string}")
	public void user_enters(String string, String string2) {
		 driver.findElement(By.name("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("string");
		driver.findElement(By.name("password")).sendKeys("string2");
	  

	}

	@When("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.name("Login")).click();
	}

	@Then("user must be login successfully")
	public void user_must_be_login_successfully() {
		Assert.assertEquals("Home", driver.getTitle());

	}


}
