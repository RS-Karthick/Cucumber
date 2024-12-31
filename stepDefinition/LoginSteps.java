package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;

	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {
	   driver = new ChromeDriver();
	   driver.get("https://bookcart.azurewebsites.net/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Given("User clicks on the login link")
	public void userClicksOnTheLoginLink() {
	   
	   driver.findElement(By.xpath("//span[contains(., 'Login')]")).click();
	}
	@Given("User enter the username as ortoni")
	public void userEnterTheUsernameAsOrtoni() {
	   driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("ortoni");	   
	}
	@Given("user enter the password as pass1234")
	public void userEnterThePasswordAsPass1234() {
	   driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("pass1234");
	   
	}
	@When("User click the login button")
	public void userClickTheLoginButton() {
	   driver.findElement(By.xpath("//span[.='Login']")).click();
	   
	}
	@Then("login should be success")
	public void loginShouldBeSuccess() {
	   driver.quit();
	   
	}
	
	
	
//	@Given("User should navigate to the application")
//	public void userShouldNavigateToTheApplication() {
//	   
//	   
//	}
//	@Given("User clicks on the login link")
//	public void userClicksOnTheLoginLink() {
//	   
//	   
//	}
//	@Given("User enter the username as karthick")
//	public void userEnterTheUsernameAsKarthick() {
//	   
//	   
//	}
//	@Given("user enter the password as passkarthi")
//	public void userEnterThePasswordAsPasskarthi() {
//	   
//	   
//	}
//	@When("User click the login button")
//	public void userClickTheLoginButton() {
//	   
//	   
//	}
//	@When("login should fail")
//	public void loginShouldFail() {
//	   
//	   
//	}
	
}
