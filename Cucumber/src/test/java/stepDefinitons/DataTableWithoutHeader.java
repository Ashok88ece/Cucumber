package stepDefinitons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeader {
	WebDriver driver;
	@Given("^User is on the Login$")
	public void user_is_on_the_Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}

	@When("^the user enter the valid below credentials to login$")
	public void the_user_enter_the_valid_below_credentials_to_login(DataTable dataTable) throws Throwable {
	    
		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
	}

	@Then("^then user should see HRM Home page$")
	public void then_user_should_see_HRM_Home_page() throws Throwable {
		boolean status = driver.findElement(By.linkText("Employee List")).isDisplayed();
		
		if (status==true) {
			System.out.println("Orange HRM Home Page Loaded");
		}
		else {
			System.out.println("Login Failed");
		}
		
		driver.quit();
	}



}
