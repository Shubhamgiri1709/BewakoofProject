package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver ;
	public Homepage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//li[@class=\"oxd-main-menu-item-wrapper\"]//span[.=\"PIM\"]")
//	WebElement pimloc;
//	
//	public void clickonPim() {
//		pimloc.click();
//	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Men']")
	WebElement clickOnMenBtn;
	
	public void clickOnMenBtn() {
		clickOnMenBtn.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Women']")
	WebElement clickOnWomenBtn;
	
	public void clickOnWomenBtn() {
		clickOnWomenBtn.click();
	}
	
	@FindBy(xpath = "//a[@href='/mobile-covers-india'][normalize-space()='Mobile Covers']")
	WebElement clickOnMobileCover;
	
	public void clickOnMobileCover() {
		clickOnMobileCover.click();
	}
	
	
	@FindBy(xpath = ("//img[@title=\"bewakoof logo\"][1]"))
	WebElement clickOnLogo;
	
	public void clickOnLogo() {
		clickOnLogo.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Bewakoof Air']")
	WebElement clickOnBewakoofAirBtn;
	
	public void clickOnBewakoofAirBtn() {
		clickOnBewakoofAirBtn.click();
	}
	
	@FindBy(xpath = "//span[@type='3xs'][normalize-space()='Offers']")
	WebElement clickOnOfferBtn;
	
	public void clickOnOfferBtn() {
		clickOnOfferBtn.click();
	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//div//div//div//div//div//div[1]//div[2]//div[1]//ul[1]//label[1]//div[1]//div[1]//*[name()='svg']//*[name()='rect' and contains(@width,'18')]")
	WebElement clickOnT_shirts;
	
	public void clickOnT_shirts() {
		Actions act = new Actions(driver);
		act.moveToElement(clickOnT_shirts);
		clickOnT_shirts.click();
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/main[1]/div[2]/div[1]/main[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/label[2]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement clickOnShirt;
	
	public void clickOnShirt() {		
		clickOnShirt.click();
	}
	
	@FindBy(xpath = "//div//div//div//div//div//div[1]//div[2]//div[1]//ul[1]//label[3]//div[1]//div[1]//*[name()='svg']//*[name()='rect' and contains(@width,'18')]")
	WebElement clickOnJoggers;
	
	public void clickOnJoggers() {
		clickOnJoggers.click();
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='COMPANY']")
	WebElement scrollToViweCompanyBtn;
	public void scrollToViweCompanyBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  scrollToViweCompanyBtn);
	}
	
	public void scrollToTheBottomOfHomePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Heavy Duty']")
	WebElement clickOnHeavyDuty;
	
	public void clickOnHeavyDuty() {
		clickOnHeavyDuty.click();
	}
	
	
	@FindBy(xpath = "//h1[@class='sc-df740a4c-0 deZFys text-[22px]']")
	WebElement checkText;
	
	public String checkTextAsHeavyDuety() {
		String accText = checkText.getText();
		return accText;
	}
	
	
	@FindBy(xpath = "//a[@href='/wishlist']//*[name()='svg']")
	WebElement clickOnFavouriteBtn;
	
	public void clickOnFavouriteBtn() {
		clickOnFavouriteBtn.click();
	}
	
	@FindBy(xpath = "//span[normalize-space()='Login / Signup']")
	WebElement checkTheText;
	
	public String checkTheText() {
		String str1 = checkTheText.getText();
		return str1;
	}
	
	@FindBy(xpath = ("//div[@class=\"sc-1c3fbb7f-1 gGRDmy\"][1]"))
	WebElement clickOnDropdownBtn;
	
	public void clickOnDropdownBtn() {
		clickOnDropdownBtn.click();
	}
	
	@FindBy(xpath = ("//div[@class=\"sc-1c3fbb7f-3 dhtfWj\"][1]"))
	WebElement clickOnAppleBtn;
	
	public void clickOnAppleBtn() {
		clickOnAppleBtn.click();
	}
	
	@FindBy(xpath = ("//*[text()='Choose your Model']"))
	WebElement clickOnChooseYourModel;
	
	public void clickOnChooseYourModel() {
		clickOnChooseYourModel.click();
	}
	
//	@FindBy(xpath = "//div[normalize-space()='iPhone 16 Pro Max']")
//	WebElement clickOnIPhone16ProMax;
//	
//	public void clickOnIPhone16ProMax() {
//		clickOnIPhone16ProMax.click();
//	}
	
	
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Email Id:']")
	WebElement provideEmail;
	
	public void provideEmail(String str) {
		provideEmail.sendKeys(str);
	}
	
	@FindBy(xpath = ("/html[1]/body[1]/div[1]/main[1]/main[1]/section[1]/div[1]/div[1]/div[4]/div[2]/button[1]"))
	WebElement clickOnSubscribeBtn;
	
	public void clickOnSubscribeBtn() {
		clickOnSubscribeBtn.click();
		
	}
	
	@FindBy(xpath = ("//*[text()='Sitemap']"))
	WebElement clickOnSiteMap;
	
	public void clickOnSiteMap() {
		clickOnSiteMap.click();
	}
	
	@FindBy(xpath = ("//div[@class=\"sc-e3d24b13-2 ffFWTi\"][1]"))
	WebElement clickOnSortBtn;
	
	public void clickOnSortBtn() {
		clickOnSortBtn.click();
	}
	
	@FindBy(xpath = ("//*[text()='New Arrival']"))
	WebElement clickOnNewArrivalChkBox;
	
	public void clickOnNewArrivalChkBox() {
		clickOnNewArrivalChkBox.click();
	}
	
	public void scrollToBottom() {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

	}
	
	
	@FindBy(xpath = ("//*[text()='TOP']"))
	WebElement clickOnTopBtn;
	
	public void clickOnTopBtn() {
		clickOnTopBtn.click();
	}
	
	

	@FindBy(xpath = "//body/div/main/main/div/div/main/div/section/div/form/div[4]/div[2]/div[1]/ul[1]/label[1]/div[1]/div[1]//*[name()='svg']//*[name()='rect' and contains(@width,'18')]")
	WebElement clickOnFirstProduct;
	
	public void clickOnFirstProduct() {
		clickOnFirstProduct.click();
	}
	
	
	@FindBy(xpath = ("//path[@stroke-linecap=\"round\"][8]"))
	WebElement clickOnSwiperBtn;
	
	public void clickOnSwiperBtn() {
		clickOnSwiperBtn.click();
	}
	
	
	@FindBy(xpath = "//span[@normalize-space()='Men']")
	WebElement clickOnSecondMenBtn;
	
	public void clickOnSecondMenBtn() {
		clickOnSecondMenBtn.click();
	}
	
	
	@FindBy(xpath = "//span[@type='base'][normalize-space()='Fanbook']")
	WebElement clickOnFANBOOKBtn;
	
	public void clickOnFANBOOKBtn() {
		clickOnFANBOOKBtn.click();
	}
	
		
	@FindBy(xpath = "//span[@type='base'][normalize-space()='Fanbook']")
	WebElement clickOnFANBOOKBtnn;
	
	public void clickOnFANBOOKBtnn() {
		clickOnFANBOOKBtnn.click();
	}
	
	
	
	@FindBy(xpath = ("//button[@class=\"sc-c7ac6ddf-2 sc-c7ac6ddf-3 gGwtka lOPoD swiper-button-prev\"][1]"))
	WebElement clickOnLeftFacedSwiperBtn;
	
	public boolean clickOnLeftFacedSwiperBtn() {
		boolean status = clickOnLeftFacedSwiperBtn.isEnabled();
				return status;
	}
	
	
	
	
	
	
	
	
	
	

		
}