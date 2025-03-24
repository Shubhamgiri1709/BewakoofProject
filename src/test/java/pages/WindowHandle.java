package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle {
	WebDriver driver ;
	public WindowHandle(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"https://play.google.com/store/apps/details?id=com.bewakoof.bewakoof&hl=en\"]")
	WebElement clickOnPlayStoreBtn;
	
	public void clickOnPlayStoreBtn() {
		clickOnPlayStoreBtn.click();		
	}	
	
	@FindBy(xpath = "//div//ul/li/a")
	List<WebElement> links;
	
	public void getAllURL() {
	     for(WebElement ele : links) {
	 		String valueOf_HREF_attribute = ele.getAttribute("href");
	     
	     try {			
				URL linkURL = new URL(valueOf_HREF_attribute);
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect(); // connecting to server
				
				if(conn.getResponseCode() >= 400) {
					System.out.println(valueOf_HREF_attribute);
				}else {
					System.out.println(valueOf_HREF_attribute + "Not a broken link");
				}
//				
//				
//				if(conn.getResponseCode()<400) {
//					System.out.println(valueOf_HREF_attribute);
//				}else {
//					System.out.println("------------------Not a broken link");
//				}
				
			}
			catch(Exception e) {
				
			}
		}
	}
	
}















