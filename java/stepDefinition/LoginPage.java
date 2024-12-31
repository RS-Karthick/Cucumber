package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{
	
//	ChromeDriver driver;
	
	@Given("Set the Environment")
	public void the_set_environment() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the username as demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verify_the_login_is_successful() {
	System.out.println(driver.getTitle());
	}
}
