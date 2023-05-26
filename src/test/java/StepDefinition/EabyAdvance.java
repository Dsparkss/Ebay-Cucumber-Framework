package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.CommonAction;
import actions.EbayAdvance_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EabyAdvance {

	CommonAction commonAction;
	EbayAdvance_Actions ebayAdvanceAction;
	
	public EabyAdvance(CommonAction commonAction,EbayAdvance_Actions ebayAdvanceAction) {
		this.commonAction = commonAction;
		this.ebayAdvanceAction=ebayAdvanceAction;
		
	}
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Given("User is on the Ebay advance search page")
	public void user_is_on_the_ebay_advance_search_page() {
				//driver.get("https://www.ebay.com/sch/ebayadvsearch");
				commonAction.getUrl("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("User clicks on the Ebay Logo")
	public void user_clicks_on_the_ebay_logo() throws InterruptedException {
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gh\"]/table/tbody/tr/td[1]")));
		//driver.findElement(By.xpath("//*[@id=\"gh\"]/table/tbody/tr/td[1]")).click();
		ebayAdvanceAction.clickOnTheEbayLogo();
	}

	@Then("User will be redirecged to the Ebay Home Page")
	public void user_will_be_redirecged_to_the_ebay_home_page() {
		String act = "https://www.ebay.com/";
		String exp = commonAction.getCurrentUrl();
		if (!act.equals(exp)) {
			System.out.println("The User is not able to click the image");
		}

		System.out.println("User is on the HomePage");

	}

	@When("user advance search an item")
	public void user_advance_search_an_item(DataTable dataTable) {
		
		//driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys(dataTable.cell(1, 0));
		ebayAdvanceAction.enterSearchString(dataTable.cell(1, 0));
		//driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		ebayAdvanceAction.enterexcludeString(dataTable.cell(1, 1));
		//driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
		ebayAdvanceAction.enterMinPrice(dataTable.cell(1, 2));
		//driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
		ebayAdvanceAction.enterMaxPrice(dataTable.cell(1, 3));
		//driver.findElement(By.xpath("/html/body/div[3]/div/main/form/fieldset[1]/div[5]/button")).click();
		ebayAdvanceAction.clickOnSearchBtn();
		
	   
	}




}
