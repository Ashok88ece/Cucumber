package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepWithData {

	WebDriver driver;

@Given("^User is on the Login page$")
public void user_is_on_the_Login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
}

@When("^the user enter the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
public void the_user_enter_the_valid_credentials_and(String username, String password) throws Throwable {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(5000);
}

@When("^clicks  the login button$")
public void clicks_the_login_button() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(5000);
	driver.quit();
}
}

	
	
    

