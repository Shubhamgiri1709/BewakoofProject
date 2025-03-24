package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	WebDriver driver ;
	public Search(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@placeholder='Search by products']")
	WebElement ClickOnSearchField;
	
	public void ClickOnSearchField() {
		ClickOnSearchField.click();
	}
	
	public void provideSearch(String string) {
		ClickOnSearchField.sendKeys(string);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search by products']")
	WebElement clearSearch;
	
	public void clearSearch() {
		clearSearch.clear();
	}
	
	
	
	
	
	
}





