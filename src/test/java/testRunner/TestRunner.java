package testRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue= {"StepDefinition"},
		plugin= {"pretty", "html:Report"},   	//"json ,junit:Report" //tags="@launch"
		dryRun=false,
		monochrome=true,
		tags="@2String"
		) 							//verify compilation error	//Run only the feature file which doesnt have the step defintiion file		

public class TestRunner {
	
	


}
