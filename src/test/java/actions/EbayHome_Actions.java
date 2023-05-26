package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinition.Hooks;
import elements.EbayHome_Elements;

public class EbayHome_Actions {
	
	WebDriver driver;
	EbayHome_Elements ebayhome_elements;
	
	public EbayHome_Actions(Hooks hooks) {
		this.driver = hooks.getDriver();
		 ebayhome_elements = new EbayHome_Elements(driver);
		
	}
	public void clickAdvanceLink() {
		ebayhome_elements.advanceSearch.click();
		
	}
	
	public void searchAnItem(String searchString) {
		ebayhome_elements.searchBox.sendKeys(searchString);
	}
	
	public void clickSearchButton() {
		ebayhome_elements.searchButton.click();
	}
	
	public int getSearchItemsCount() {
		String itemcount = ebayhome_elements.numOfItems.getText().trim();
		String itemcount2 = itemcount.replace(",", "");
		int itemCountInt = Integer.parseInt(itemcount2);
		return itemCountInt;
	}
	
	public void selectCategoryOption(String option) {
		ebayhome_elements.dropDownArrow.click();
		List<WebElement> elements = ebayhome_elements.catOption;
		for(WebElement element : elements){
			
			if(element.getText().trim().toLowerCase().equals(option.toLowerCase())){
				element.click();
				break;
				
			}
			
		}
	}
	
	public void clickOnLinkByText(String text) {
		driver.findElement(By.linkText(text)).click();
	}
}
