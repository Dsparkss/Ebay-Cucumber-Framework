package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	
	WebDriver driver;
	
	public Tagged_Hooks(Hooks hooks) {
		
		this.driver = hooks.getDriver();
		
	}
	
	
	@After(value ="@search" , order =0)
	public void afterHooksSc(){
		System.out.println("I am executed the last after hooks");
	}
	
	@Before(value = "@search", order =0)
	public void setCookies() {
		System.out.println("I am exectued before the secanrio which has the tag name Search in it ");
	}

}
