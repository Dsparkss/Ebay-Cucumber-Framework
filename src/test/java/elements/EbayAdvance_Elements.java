package elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvance_Elements {
	
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"gh\"]/table/tbody/tr/td[1]") public WebElement ebayLogo;
	@FindBy(xpath = "//*[@id=\"_nkw\"]") public WebElement searchString;
	@FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeString;
	@FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice;
	@FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice;
	@FindBy(xpath = "/html/body/div[3]/div/main/form/fieldset[1]/div[5]/button") public WebElement searchBtn;

	
	public EbayAdvance_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
