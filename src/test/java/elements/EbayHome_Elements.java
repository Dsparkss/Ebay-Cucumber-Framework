package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath ="//a[@title ='Advanced Search']") public WebElement advanceSearch;
	@FindBy(xpath ="//input[@class='gh-tb ui-autocomplete-input']") public WebElement searchBox;
	@FindBy(xpath ="//input[@class='btn btn-prim gh-spr']") public WebElement searchButton;
	@FindBy(xpath ="//*[@id=\\\"mainContent\\\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]") public WebElement numOfItems;
	@FindBy(xpath ="//select[@id='gh-cat']") public WebElement dropDownArrow;
	@FindBy(xpath ="//select[@id='gh-cat']/option") public List<WebElement> catOption;
	
	
	public EbayHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
}
