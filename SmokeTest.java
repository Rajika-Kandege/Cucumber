package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {
		
		//ChromeDriverManager.getInstance().setup();
	    
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://gmail.com");
	}

	@When("^I enter valid username and password$")
	public void I_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("champoru32@gmail.com");
	
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		  driver.findElements(By.id("Create account")).sendKeys(text);
	   
	   
	    
	}
}
