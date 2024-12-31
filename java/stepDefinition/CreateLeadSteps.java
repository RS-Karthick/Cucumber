package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends ProjectSpecificMethod {

	@When("Click on the crmsfa link")
	public void click_on_the_crmsfa_link() {
	    
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}

	@When("Click on the leads tab")
	public void click_on_the_leads_tab() {
	    driver.findElement(By.partialLinkText("Leads")).click();
	    
	}

	@When("Click on the create lead link")
	public void click_on_the_create_lead_link() {
	    driver.findElement(By.partialLinkText("Create Lead")).click();
	    
	}

	@Given("Enter the company name as {string}")
	public void enter_the_company_name_as(String cname) {
//	    driver.findElement(By.name("companyName")).sendKeys(cname);
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	    
	}

	@Given("Enter the first name as {string}")
	public void enter_the_first_name_as(String fname) {
//	    driver.findElement(By.name("firstName")).sendKeys(fname);
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	    
	}

	@Given("Enter the last name as {string}")
	public void enter_the_last_name_as(String lname) {
//	    driver.findElement(By.name("lastName")).sendKeys(lname);
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	    
	}

	@Given("Enter the phone number as {string}")
	public void enter_the_phone_number_as(String phno) {
//	   driver.findElement(By.name("primaryPhoneNumber")).sendKeys(phno);
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	    
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
	    driver.findElement(By.name("submitButton")).click();
	    
	}

	@Then("Retrive and print the lead id and verify the company name as {string} and fist name as {string} and last name as {string}")
	public void retrive_and_print_the_lead_id_and_verify_the_company_name_as_and_fist_name_as_and_last_name_as(String string, String string2, String string3) {
	    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    System.out.println("The Lead ID is : "+text);
	    
	    System.out.println(string);
	    System.out.println(string2);
	    System.out.println(string3);
	}

}
