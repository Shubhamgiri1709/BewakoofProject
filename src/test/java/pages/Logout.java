package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	
	
WebDriver driver ;
	
	public Logout(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//svg[@xmlns=\"http://www.w3.org/2000/svg\"][8]"))
	WebElement mouseHoverOnProfile;
	
	public void mouseHoverOnProfile() {
		Actions act = new Actions(driver);
//		act.moveToElement(mouseHoverOnProfile).click().perform();
		act.moveToElement(mouseHoverOnProfile).perform();
	}
	
	
	
	
}
