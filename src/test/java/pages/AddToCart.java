package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver ;	
	
	public AddToCart(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt=\"Men's Chocolate Brown Oversized Joggers\"]")
	WebElement clickOnProduct;
	
	public void clickOnProduct() {
		clickOnProduct.click();
	}
//	                ("//img[@title=\"bewakoof logo\"][1]")
	@FindBy(xpath = ("//div[@class=\"sc-9d458f08-14 fIRGUP\"][1]"))
	WebElement changeTheSizeOfProduct;
	//label[@class='sc-dd7c066a-2 sc-dd7c066a-5 eNIdhK Uegqu']
	public void changeTheSizeOfProduct() {
		changeTheSizeOfProduct.click();
	}

	
	@FindBy(xpath = ("/html[1]/body[1]/div[1]/main[1]/main[1]/header[1]/div[1]/div[2]/div[2]/ul[1]/a[3]/div[1]/span[1]"))
	WebElement clickOnMyBagBtn;
	
	public void clickOnMyBagBtn() {
		clickOnMyBagBtn.click();
	}
	
//	@FindBy(xpath = ("//*[text()='TOP']"))

	@FindBy(xpath = "//*[text()='MEN']")
	WebElement clickOnOneProduct;
	
	public void clickOnOneProduct() {
		clickOnOneProduct.click();
	}
	
	
	@FindBy(xpath = "//label[normalize-space()='M']")
	WebElement clickOnSmallSizeBtn;
	
	public void clickOnSmallSizeBtn() {
		clickOnSmallSizeBtn.click();
	}
	
	
	@FindBy(xpath = "//div[@class='relative']//img[@alt='Slide 4']")
	WebElement clickOnFullFacedImage;
	
	public void clickOnFullFacedImage() {
		clickOnFullFacedImage.click();
	}
	
	@FindBy(xpath = "//input[@placeholder='Enter Pincode']")
	WebElement providePinCode;
	
	public void providePinCode(CharSequence[] pin) {
		providePinCode.click();
		 providePinCode.sendKeys(pin);
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Round Neck']")
	WebElement checkTxt;
	
	public String checkTxt() {
		String txt = checkTxt.getText();
		return txt;
	}
	
	@FindBy(xpath = "//button[@class='sc-f2340ec2-0 sc-f2340ec2-1 sc-f2340ec2-2 bSueBr jnETsH false']//*[name()='svg']")
	WebElement clickOnAddToCart;
	
	public void clickOnAddToCart() {
		clickOnAddToCart.click();
	}
	
	@FindBy(xpath = ("//div[@class=\"header_cart_link_wrapper__VPytb\"]"))
	WebElement seeAddToCartProducts;
	
	public void seeAddToCartProducts() {
		seeAddToCartProducts.click();
	}
	
	
	@FindBy(xpath = ("//button[@class=\"product-line-item_size_quantity_button__5glgB\"][2]"))
	WebElement changeTheQuantityUpto10;
	
	public void changeTheQuantityUpto10() {
		changeTheQuantityUpto10.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='10']")
	WebElement changedQuantityFor10;
	
	public void changedQuantityFor10() {
		changedQuantityFor10.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='CONFIRM']")
	WebElement clickOnConfirmBtn;
	
	public void clickOnConfirmBtn() {
		clickOnConfirmBtn.click();
	}

	
//	@FindBy(xpath = "//*[text()='MEN']")

	@FindBy(xpath = "//div[@class=\"order-summary_summary_footer__J1Y_f\"]")
	WebElement clickOnProceedBotton1;
	
	public void clickOnProceedBotton1() {
		clickOnProceedBotton1.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
