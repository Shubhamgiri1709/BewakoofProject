package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver ;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//span[normalize-space()='LOGIN']")
	WebElement loginClick;
	
	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement providePhoneNO;
	
	@FindBy(xpath = "//span[normalize-space()='Enter a valid Mobile Number']")
	WebElement checkText;
	
	public void loginClick() {
		loginClick.click();
	}
	
	public void providePhoneNO(String phone) {
		providePhoneNO.sendKeys(phone);
	}
	
	public String checkText() {
		return checkText.getText();
	}
	
	
	
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement checkEnabled;
	
	public boolean checkEnabled() {
		return checkEnabled.isEnabled();
	}
	
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement checkEnabled2;
	
	public boolean checkEnabled2() {
		return checkEnabled.isEnabled();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy (xpath = "//input[@name='username']")
//	WebElement usernameLoc;
//	
//	@FindBy (xpath = "//input[@name='password']")
//	WebElement passwordLoc;
//	
//	@FindBy (xpath = "//button[@type='submit']")
//	WebElement loginBtnLoc;
//	
//	
//	public void setUsername(String str) {
//		usernameLoc.sendKeys(str);
//	}
//	public void setPassword(String str) {
//		passwordLoc.sendKeys(str);
//	}
//	public void clickOnLogin() {
//		loginBtnLoc.click();
//	}
//	
}