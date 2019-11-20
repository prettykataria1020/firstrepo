package cucumberpack.Cucumberproj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepcucu2 {
int a,b,s,p;
@Given("User must enter input values")
public void user_must_enter_input_values() {
   System.out.println("user enters input");
  a=10;
  b=20;
}

@Then("assign values to variable a and b")
public void assign_values_to_variable_a_and_b() {
	System.out.println(a+" "+b);
}

@When("add two input")
public void add_two_input() {
    s=a+b;
}

@Then("display the sum")
public void display_the_sum() {
	System.out.println("SUM IS "+s);
}

@When("multiply two numbers")
public void multiply_two_numbers() {
	p=a*b;
}

@Then("display the product")
public void display_the_product() {
	System.out.println("product is"+p);
}


}
