package cucumberpack.Cucumberproj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepscoutline {
	@Given("user must be in the login page")
	public void user_must_be_in_the_login_page() {
		System.out.println("user is in login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		System.out.println("login using"+string+"and"+string2);
	   
	}

	@When("performs login")
	public void performs_login() {
		System.out.println("click on the login button");
	}

	@Then("user must be in home page")
	public void user_must_be_in_home_page() {
		System.out.println("user is in the home page");
		System.out.println("***************************************");
	}
}
