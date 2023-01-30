package Com.Orange.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Orange.runner.Orangerunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Orangestepdefinition {
	
	public static WebDriver driver=Orangerunner.driver;
	
	@Given("^user enter the Orange application$")
	public void user_enter_the_Orange_application() throws Throwable {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}

	@Given("^user enter the username in username box$")
	public void user_enter_the_username_in_username_box() throws Throwable {
	driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@Then("^user enter the password in password box$")
	public void user_enter_the_password_in_password_box() throws Throwable {
	driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("^user enter the login button for login box$")
	public void user_enter_the_login_button_for_login_box() throws Throwable {
	driver.findElement(By.xpath("// button[@type='submit']")).click();
	}}

