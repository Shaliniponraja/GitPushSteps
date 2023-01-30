package Com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//feature", glue = "Com.Adactin.stepdefinition")
// feature file and stepdefiniion package name.

public class Runnerclass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Success");

	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}
}
