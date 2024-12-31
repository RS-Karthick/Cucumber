package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class LoginParamater extends ProjectSpecificMethod {

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
}
