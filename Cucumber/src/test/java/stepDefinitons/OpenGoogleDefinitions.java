package stepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	@Given("^User entering google\\.co\\.in$")
	public void user_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("^User typing at Search term \"([^\"]*)\"$")
	public void user_typing_at_Search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}


	@When("^Enter return key$")
	public void enter_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	   
	}

	@Then("^Envirocal pages were open$")
	public void ipigs_pages_were_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status = driver.findElement(By.partialLinkText("envirocal")).isDisplayed();
		if (status) {
			System.out.println("Return Displayed");
		}
		else {
			System.out.println("Results Failed");
		}
		
		driver.quit();
	    
	}



}
