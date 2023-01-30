package Com.Adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Adactin.runner.Runnerclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
public static WebDriver driver= Runnerclass.driver;

@Given("^user launch the Adactin application$")
public void user_launch_the_Adactin_application() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
}

@When("^user enter the username in user field$")
public void user_enter_the_username_in_user_field() throws Throwable {
	driver.findElement(By.id("username")).sendKeys("Shalini");
	
}

@When("^user enter the password in the password field$")
public void user_enter_the_password_in_the_password_field() throws Throwable {
	driver.findElement(By.id("password")).sendKeys("Sha@123");
}

@Then("^user enter the login button and navigate to the search hotel page$")
public void user_enter_the_login_button_and_navigate_to_the_search_hotel_page() throws Throwable {
	driver.findElement(By.id("login")).click();
}

@When("^user select the location in location field$")
public void user_select_the_location_in_location_field() throws Throwable {
	WebElement Location = driver.findElement(By.xpath("//option[@value='Sydney']"));
	Location.click();
}

@When("^And user select the hotel in the Hotel field$")
public void and_user_select_the_hotel_in_the_Hotel_field() throws Throwable {
	WebElement Hotel = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
	Hotel.click();

}

@When("^d user select the room type in rooom field$")
public void d_user_select_the_room_type_in_rooom_field() throws Throwable {
	WebElement Room_type = driver.findElement(By.xpath("//option[@value='Deluxe']"));
	Room_type.click();
}

@When("^user select the no of available in the no of room field$")
public void user_select_the_no_of_available_in_the_no_of_room_field() throws Throwable {
WebElement no_of_rooms = driver.findElement(By.xpath("//option[@value='3']"));
no_of_rooms.click();

}

@When("^user enter the Check In Date And clear the default check in date$")
public void user_enter_the_Check_In_Date() throws Throwable {
	WebElement Date_in = driver.findElement(By.id("datepick_in"));
	Date_in.clear();
	Date_in.sendKeys("20/01/2013");
}

@When("^user clear the default check out date Given user enter the out date in Check out date box$")
public void clear_the_default_check_in_date() throws Throwable {
	WebElement Date_out = driver.findElement(By.id("datepick_out"));
	Date_out.clear();
	Date_out.sendKeys("30/02/2013");
}

@When("^user select the Adults per Room in Adaults per room check box$")
public void user_select_the_Adults_per_Room_in_Adaults_per_room_check_box() throws Throwable {
WebElement Adults_room  = driver.findElement(By.xpath("(//option[@value='4'])[2]"));
Adults_room.click();
}

@When("^user select the Children per Room  in Children per Room box$")
public void user_select_the_Children_per_Room_in_Children_per_Room_box() throws Throwable {
WebElement Children_Room = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
Children_Room.click();

}

@Then("^user enter the search box button and navigate in to the Select Hotel page$")
public void user_enter_the_search_box_button_and_navigate_in_to_the_Select_Hotel_page() throws Throwable {
WebElement submit = driver.findElement(By.id("Submit"));
submit.click();
}

@Given("^user enter the availble hotel in the list$")
public void user_enter_the_availble_hotel_in_the_list() throws Throwable {
WebElement button = driver.findElement(By.id("radiobutton_0"));
button.click();
}

@Then("^user enter the continue button and navigate in to the Book a Hotel page$")
public void user_enter_the_continue_button_and_navigate_in_to_the_Book_a_Hotel_page() throws Throwable {
	WebElement result = driver.findElement(By.id("continue"));
	result.click();
}
}



