package stepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ERPUserRoleLogin {
	WebDriver driver;
	@Given("^Various User Role is on the Login page$")
	public void various_User_Role_is_on_the_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("http://localhost:64237");
		Thread.sleep(5000);
	}

	@When("^User Enter the  Valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_the_Valid_and(String Username, String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(Username);

 		 driver.findElement(By.id("identifierNext")).click();
		
		 Thread.sleep(5000);

		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000); 
	}

	@When("^User Clicks the login button$")
	public void user_Clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Role Successfully Logged into ERP");
		Thread.sleep(5000);
		driver.quit();
	}


}
