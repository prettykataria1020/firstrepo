package cucumberpack.Cucumberproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class pomvalid {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User should be on the login page")
	public void user_is_on_the_home_page() throws Throwable {
		driver = utilclass.openBrowser("chrome");
		driver.get("http://demoaut.com/");
	}

	@When("User logs in using the valid credentials")
	public void user_enter_the_valid_credentials() throws Throwable {
		pomidentify page = new pomidentify(driver);
		page.do_login("tutorial", "tutorial");
	}

	@Then("User should be in home page")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}

}


