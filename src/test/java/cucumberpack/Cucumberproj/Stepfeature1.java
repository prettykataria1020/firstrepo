package cucumberpack.Cucumberproj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepfeature1 {
	String str;
	
	@Given("type something")
	public void precondition() throws Throwable {
	    str="Hello world";
	   
	}

	@When("execute the code")
	public void execute() throws Throwable {
		System.out.println(str);
		
}

	@Then("content must be displayed")
	public void postcondition() throws Throwable {
	   
	  System.out.println("displayed successfully");
	}
}
