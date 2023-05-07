package io.cucumber.awesomenow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;


public class StepDefinitionsServiceNow {
	ServiceNowUtils login = new ServiceNowUtils();
    @Given("I open login page")
    public void I_have_username_password() {
       // Login login = new Login();
        login.openLoginPage();
    }
    @When("I enter username and password")
    public void i_enter_credentials() {
        // Write code here that turns the phrase above into concrete actions
    	//Login login = new Login();
        try {
			login.enterCreds();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       // throw new io.cucumber.java.PendingException();
    }
    @Then("I open incidentlist")
    public void i_open_target_page() {
    	//Login login = new Login();
        login.openIncidentList();
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    
   
    @After()
    public void closeBrowser()
    {
    	//Login login = new Login();
        login.closeBrowser();
    }
}