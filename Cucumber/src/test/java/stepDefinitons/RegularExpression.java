package stepDefinitons;

import cucumber.api.java.en.Given;

public class RegularExpression {
	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int count) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Laptop Count:" +count);
	  
	}

	@Given("^I have scored (\\d+\\.\\d+) CGPA$")
	public void i_have_scored_CGPA(float value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Marks Scored:"+value);
	    
	}

	@Given("^\"([^\"]*)\" elder than \"([^\"]*)\" and \"([^\"]*)\"$")
	public void elder_than_and(String name1, String name2, String name3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(name1+" elder than"+ name2 +" and "+name3);
	}


}
