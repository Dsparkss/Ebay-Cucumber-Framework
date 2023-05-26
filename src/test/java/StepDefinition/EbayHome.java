package StepDefinition;

import static org.junit.Assert.fail;
import actions.CommonAction;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EbayHome{
	
	CommonAction commonAction;
	EbayHome_Actions ebayHomeAction;
	
	public EbayHome(CommonAction commonAction,EbayHome_Actions ebayHomeAction) {
		this.commonAction= commonAction;
		this.ebayHomeAction = ebayHomeAction;
	}
	
	@Given("I am on the Ebay Home Page")
	public void i_am_on_the_ebay_home_page() {
		
		//driver.get("https://www.ebay.com/");
		commonAction.getUrl("https://www.ebay.com/");
		System.out.println("I am on the Ebay Home Page");
	   
	}

	@When("I click on Advance Link")
	public void i_click_on_advance_link() {
		
		//driver.findElement(By.xpath("//a[@title ='Advanced Search']")).click();
		ebayHomeAction.clickAdvanceLink();
		System.out.println("I am able to click the advanced search");
	   
	}

	
	@Then("I will be navigated to the advance search page")
	public void i_will_be_navigated_to_the_advance_search_page() {
		
	String act = "https://www.ebay.com/sch/ebayadvsearch";
	String exp = commonAction.getCurrentUrl();
	if(!act.equals(exp)) {
		fail("I failed ");
		
}
	
	System.out.println("I have Navigated to the advance page");
	    
	}
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		
		//driver.get("https://www.ebay.com/");
		commonAction.getUrl("https://www.ebay.com/");
	}

	@When("User search for {string}")
	public void user_search_for(String string) {
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys(string);
		ebayHomeAction.searchAnItem(string);
		//driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		ebayHomeAction.clickSearchButton();
	   
	}

	@Then("user validate atleast {int}  search items are present")
	public void user_validate_atleast_search_items_are_present(Integer int1) {
		 //driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]")).getText();
	int count =	ebayHomeAction.getSearchItemsCount();
		if(count >int1) {
			System.out.println("The search list is fine");
		}
		
		System.out.println("Executed successfully");
	    
	}
	
	
	@When("User search for {string} in {string} category")
	public void user_search_for_in_category(String string, String string2) throws InterruptedException {
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys(string);
		ebayHomeAction.searchAnItem(string);
		ebayHomeAction.selectCategoryOption(string2);
//		driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
//		List <WebElement> elements = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
//		for(WebElement element : elements){
//			
//			if(element.getText().trim().toLowerCase().equals(string2.toLowerCase())){
//				element.click();
//				break;
//				
//			}
//			
//		}
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		ebayHomeAction.clickSearchButton();
		Thread.sleep(1000);
	   
	}
	

	@When("user clicks on the {string}")
	public void user_clicks_on_the(String string) throws Exception {
		
		//driver.findElement(By.linkText(string)).click();
		ebayHomeAction.clickOnLinkByText(string);
		Thread.sleep(2000);
	    
	}
	@Then("validate that page navigates to the {string} and title contains {string}")
	public void validate_that_page_navigates_to_the_and_title_contains(String url, String title) {
		if(commonAction.getCurrentUrl().contains(url)) {
			System.out.println("The url matches :" + " "+ url);
		}
		if(commonAction.getCurrentPageTitle().contains(title)) {
			
			System.out.println("The title matches :" + " " + title);
			
		}
	   
	}






	
	
	
	

}
