package stepDefinitons;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeader {
	WebDriver driver;
	@Given("^Admin is on the Login page$")
	public void admin_is_on_the_Login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    
	}

	@When("^Admin user enter the valid below credentials to logged in$")
	public void admin_user_enter_the_valid_below_credentials_to_logged_in(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String,String>> KeyValuePair =dataTable.asMaps(String.class, String.class);
		String userName = KeyValuePair.get(0).get("Username");
		String passWord = KeyValuePair.get(0).get("Password");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		Thread.sleep(5000);
	    
	}

	@Then("^Admin user clicks the login button$")
	public void admin_user_clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		 driver.quit();
	}



}
