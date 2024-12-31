package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class LoginPage2 extends ProjectSpecificMethod {

@Given("Enter the username as KarthickRS")
public void enter_the_username_as_karthick_rs() {
	driver.findElement(By.id("username")).sendKeys("KarthickRS");
    
}

@Given("Enter the password as karthick123")
public void enter_the_password_as_karthick123() {
	driver.findElement(By.id("password")).sendKeys("karthick123");
    
}
}
