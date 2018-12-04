package co.magento.stepDef;

import com.magento.pages.impl.Lo‌ginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDef {

	@Given("^user has access the Magento page$")
	public void user_has_access_the_Magento_page() throws Throwable {
		Lo‌ginPage clickAcount = new Lo‌ginPage();
		clickAcount.doLoginPage();
	}

	@When("^user has entered the username and password$")
	public void user_has_entered_the_username_and_password() throws Throwable {

	}

	@Then("^user sees the My Dashboard page$")
	public void user_sees_the_My_Dashboard_page() throws Throwable {

	}
}
