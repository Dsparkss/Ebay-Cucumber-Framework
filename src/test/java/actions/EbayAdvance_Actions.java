package actions;

import org.openqa.selenium.WebDriver;

import StepDefinition.Hooks;
import elements.EbayAdvance_Elements;

public class EbayAdvance_Actions {
	
	WebDriver driver;
	EbayAdvance_Elements ebayadvance_elements;
	
	public EbayAdvance_Actions(Hooks hooks) {
		
		this.driver = hooks.getDriver();
		ebayadvance_elements = new EbayAdvance_Elements(driver);
	
	}
	
	public void clickOnTheEbayLogo() {
		ebayadvance_elements.ebayLogo.click();
	}
	
	public void enterSearchString(String string) {
		ebayadvance_elements.searchString.sendKeys(string);
	}
	
	public void enterexcludeString(String string) {
		ebayadvance_elements.excludeString.sendKeys(string);
	}
	public void enterMaxPrice(String string) {
		ebayadvance_elements.maxPrice.sendKeys(string);
	}
	public void enterMinPrice(String string) {
		ebayadvance_elements.minPrice.sendKeys(string);
	}
	public void clickOnSearchBtn() {
		ebayadvance_elements.searchBtn.click();
	}

}
