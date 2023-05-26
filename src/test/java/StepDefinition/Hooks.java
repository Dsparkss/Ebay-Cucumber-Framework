package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;

	
	//Global Hooks
	
	@Before(order=1)
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("I am execute at the last before hooks");
		
	}
	
	
	@After(order=1)
	public void quitChrome() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I am executed First");
		driver.close();
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
