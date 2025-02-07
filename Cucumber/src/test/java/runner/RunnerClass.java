package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features="featureFiles/HRMLoginWithData.feature",glue="stepDefinitons"

)

public class RunnerClass {
	
	//It should combine the feature file and step definition
	//Runner 

}
