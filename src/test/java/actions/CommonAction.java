package actions;

import org.openqa.selenium.WebDriver;

import StepDefinition.Hooks;

public class CommonAction {
	
	WebDriver driver;
	
	public CommonAction(Hooks hooks) {
		
		this.driver = hooks.getDriver();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

}
