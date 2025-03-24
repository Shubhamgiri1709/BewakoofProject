package stepdefinitions;

//import org.testng.AssertJUnit;
import java.time.Duration;
//import java.util.Set;

import org.junit.After;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCart;
import pages.Homepage;
import pages.LoginPage;
import pages.Logout;
import pages.Search;
import pages.WindowHandle;

public class Login {

	WebDriver driver;
	
	LoginPage login;
	Search search;
	Homepage homepage;
	AddToCart addToCart;
	WindowHandle windowHandle;
	Logout logout;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage	login       = new LoginPage(driver);
		search      = new Search(driver);
		homepage    = new Homepage(driver);
		addToCart   = new AddToCart(driver);
		windowHandle= new WindowHandle(driver);
		logout      = new Logout(driver);
	}
	

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	@Given("I launch browser and navigate to the home page")
	public void i_launch_browser_and_navigate_to_the_home_page() {
	    driver.get("https://www.bewakoof.com/");
	}
	
	@When("I click on Login Button")
	public void i_click_on_login_button() {
	    login.loginClick();
	}
	
	@When("I enter invalid phone number {string} into phone number field")
	public void i_enter_invalid_phone_number_into_phone_number_field(String string) {
	    login.providePhoneNO(string);
	}
	
	
	@Then("warning text message should be {string}")
	public void warning_text_message_should_be(String string) {
		String text = login.checkText();
		AssertJUnit.assertEquals(text, "Enter a valid Mobile Number");
	}
	
	
	@Then("button should not be enabled")
	public void button_should_not_be_enabled() {
	    boolean a = login.checkEnabled2();
	    Assert.assertEquals(a, false);
	}
	
	
	@When("I clicked on search button")
	public void i_clicked_on_search_button() {
	    search.ClickOnSearchField();
	}
	
	@When("I provided search as {string}")
	public void i_provided_search_as(String string) throws InterruptedException {
	    search.provideSearch(string);
	    Thread.sleep(4000);
	}
	
	
	@When("I cleared the search from search field")
	public void i_cleared_the_search_from_search_field() {
	    search.clearSearch();
	}
	
	
	@When("I clicked on Men button")
	public void i_clicked_on_men_button() {
	    homepage.clickOnMenBtn();
	}
	
	
	@And("I clicked on Female button")
	public void i_clicked_on_female_button() {
	    homepage.clickOnWomenBtn();
	}	
	
	
	@When("I clicked on Mobile Cover button")
	public void i_clicked_on_mobile_cover_button() {
	    homepage.clickOnMobileCover();
	}
	
	
	@When("I clicked on Logo of the website and page got refreshed")
	public void i_clicked_on_logo_of_the_website_and_page_got_refreshed() {
		homepage.clickOnLogo();
	}
	
	
	@When("I clicked on Bewakoof Air")
	public void i_clicked_on_bewakoof_air() {
	    homepage.clickOnBewakoofAirBtn();
	}
	
	
	@When("I clicked on Offer button")
	public void i_clicked_on_offer_button() {
	    homepage.clickOnBewakoofAirBtn();
	}
	
	
	
	
	
	@When("I clicked on T-shirt")
	public void i_clicked_on_t_shirt() throws InterruptedException {
		Thread.sleep(4000);
	    homepage.clickOnT_shirts();
	    
	}
	@When("I clicked on Shirt")
	public void i_clicked_on_shirt() throws InterruptedException {
		Thread.sleep(4000);
		homepage.clickOnShirt();
	}
	@When("I clicked on Joggers")
	public void i_clicked_on_joggers() throws InterruptedException {
		Thread.sleep(4000);
		homepage.clickOnJoggers();
	}
	
	
	
	@When("I tried to scroll down on the home page")
	public void i_tried_to_scroll_down_on_the_home_page() {
	    homepage.scrollToViweCompanyBtn();
	}
	
	
	@When("I tried to scroll down on the bottom of the home page")
	public void i_tried_to_scroll_down_on_the_bottom_of_the_home_page() {
	    homepage.scrollToTheBottomOfHomePage();
	}
	
	@When("I tried to click on heave duty button")
	public void i_tried_to_click_on_heave_duty_button() {
	    homepage.clickOnHeavyDuty();
	}
	
	@Then("I validate the page title as {string}")
	public void i_validate_the_page_title_as(String string) {
		AssertJUnit.assertEquals(string, "Bewakoof Heavy Duty");	
	}
	
	
	@Then("I click on particular product")
	public void i_click_on_particular_product() {
	    addToCart.clickOnProduct();
	}
	
	
	@Then("I tried to change the product size as Small")
	public void i_tried_to_change_the_product_size_as_small() {
	    addToCart.changeTheSizeOfProduct();
	}
	
	
	@When("I clickd on favourite button")
	public void i_clickd_on_favourite_button() {
	    homepage.clickOnFavouriteBtn();
	}
	
	@Then("I redirected to login page")
	public void i_redirected_to_login_page() {
	    String st = homepage.checkTheText();
	    AssertJUnit.assertTrue(st.contains("Login"));
	}
	
	
	@Then("I validate it with the URL {string}")
	public void i_validate_it_with_the_url(String string) {
	    AssertJUnit.assertEquals(string, "https://www.bewakoof.com/login?src=/");
	}
	
	
	@When("I clicked on Choose your brand")
	public void i_clicked_on_choose_your_brand() {
	    homepage.clickOnDropdownBtn();
	}
	
	@When("I clicked on Apple button")
	public void i_clicked_on_apple_button() {
	    homepage.clickOnAppleBtn();
	}
	
	
	@Then("I clicked on Choose Your Model button")
	public void i_clicked_on_choose_your_model_button() {
	    homepage.clickOnChooseYourModel();
	}
	
	@When("I provided email as {string}")
	public void i_provided_email_as(String string) throws InterruptedException {
		Thread.sleep(3000);
	    homepage.provideEmail(string);
	    Thread.sleep(3000);
	}
	
	
	@When("I clicked on Subscribe button")
	public void i_clicked_on_subscribe_button() throws InterruptedException {
	    WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
		al.click();
		Thread.sleep(10000);
	    homepage.clickOnSubscribeBtn();
	}
	
	
	
	
	@When("I clicked on Site Map")
	public void i_clicked_on_site_map() throws InterruptedException {
		  WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
			al.click();
			Thread.sleep(10000);
	    homepage.clickOnSiteMap();
	}
	
	@When("I clicked on Google Play store button")
	public void i_clicked_on_google_play_store_button() {
		
	    windowHandle.clickOnPlayStoreBtn();
	}
	
	
	@When("I clicked on Games button")
	public void i_clicked_on_games_button() {
		System.out.println(driver.getCurrentUrl());

	    String setOfWindowID = driver.getWindowHandle();
		System.out.println(setOfWindowID);
		driver.switchTo().window(setOfWindowID);
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Given("I found out all URL and printed it")
	public void i_found_out_all_url_and_printed_it() {
	    windowHandle.getAllURL();
	}
	
	
	@Given("I clicked on My Bag")
	public void i_clicked_on_my_bag() throws InterruptedException {
		  WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
			al.click();
			Thread.sleep(10000);
	    addToCart.clickOnMyBagBtn();
	}
	
	@When("I clicked on Sort by")
	public void i_clicked_on_sort_by() {
		
	    homepage.clickOnSortBtn();
	}
	
	
	@When("I clicked on New Arrival")
	public void i_clicked_on_new_arrival() {
	    homepage.clickOnNewArrivalChkBox();
	}
	
	@When("I scroll down to the bottom of page")
	public void i_scroll_down_to_the_bottom_of_page() {
	    homepage.scrollToBottom();
	}
	
	@When("I clicked on Go To Top button")
	public void i_clicked_on_go_to_top_button() {
	    homepage.clickOnTopBtn();
	}
	
	@When("I clicked on first product")
	public void i_clicked_on_first_product() {
	    homepage.clickOnFirstProduct();
	}
	

	@When("I clicked on second  Men button")
	public void i_clicked_on_second_men_button() {
	    homepage.clickOnSecondMenBtn();
	}
	
	
	
	@Given("I Clicked on Swiper button")
	public void i_clicked_on_swiper_button() {
	    homepage.clickOnSwiperBtn();
	}

	

//	@Given("I clicked on FANBOOK button")
//	public void i_clicked_on_fanbook_button() throws InterruptedException {
//		WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
//		al.click();
//		Thread.sleep(10000);
//	    homepage.clickOnFANBOOKBtn();
//	}
	
	
	
	@Given("I clicked on FANBOOK buttonnnn")
	public void i_clicked_on_fanbook_buttonnnn() throws InterruptedException {
		WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
		al.click();
		Thread.sleep(10000);
	    homepage.clickOnFANBOOKBtnn();
	}
	
	
	
	
	
	
	
	
	
	
	@And("I click on profile icon")
	public void i_click_on_profile_icon() throws InterruptedException {
//		WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
//		al.click();
//		Thread.sleep(10000);
//	    logout.mouseHoverOnProfile();
	}
	
	
	@Given("I launch browser and navigate to the home page3")
	public void i_launch_browser_and_navigate_to_the_home_page3() {
		driver.get("https://www.bewakoof.com/?gad_source=1");

	}
	
	
	
	@Given("I launch browser and navigate to the home page2")
	public void i_launch_browser_and_navigate_to_the_home_page2() {
		driver.get("https://www.bewakoof.com/p/mens-green-move-on-graphic-printed-t-shirt");
	}
	
	
	
	@Given("I Selected shirt size as Small")
	public void i_selected_shirt_size_as_small() {
	    addToCart.changeTheSizeOfProduct();
	}
	
	
	
	
	@Given("I selected image that is facing front side and a full human image")
	public void i_selected_image_that_is_facing_front_side_and_a_full_human_image() {
	    addToCart.clickOnFullFacedImage();
	}

	
//	@Given("I Provided pincode as {string}")
//	public void i_provided_pincode_as(String string) {
//		
//		addToCart.providePinCode(null);
//	}
	
	
	@Given("I Provided pincode as {int}")
	public void i_provided_pincode_as(Integer int1) {
		addToCart.providePinCode(null);
	}
	
	@Then("I checked the type of neck as {string}")
	public void i_checked_the_type_of_neck_as(String string) {
	    String txt1 = addToCart.checkTxt();
	    Assert.assertEquals(string, txt1);
	}
	
	@Then("I clicked on Add To Bag")
	public void i_clicked_on_add_to_bag() {
	    addToCart.clickOnAddToCart();
	}

	@Then("I clicked on see Add to cart")
	public void i_clicked_on_see_add_to_cart() {
	    addToCart.seeAddToCartProducts();
	}

	
	@Then("I wanted to change the quantity for ten")
	public void i_wanted_to_change_the_quantity_for_ten() throws InterruptedException {
		WebElement al = driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]"));
		al.click();
		Thread.sleep(10000);
	    addToCart.changeTheQuantityUpto10();
	}
	
	
	@Then("I changed quantity for the ten")
	public void i_changed_quantity_for_the_ten() {
	    addToCart.changedQuantityFor10();
	}
	
	
	
	@Then("I confirmed the changes")
	public void i_confirmed_the_changes() {
	    addToCart.clickOnConfirmBtn();
	}

	
	@Then("I clicked on proceed button")
	public void i_clicked_on_proceed_button() throws InterruptedException {
		Thread.sleep(10000);
	    addToCart.clickOnProceedBotton1();
	    Thread.sleep(10000);
	}
	
	
	@Given("I checked whether swpier button is enabled or not")
	public void i_checked_whether_swpier_button_is_enabled_or_not() {
	    boolean a =  homepage.clickOnLeftFacedSwiperBtn();
	    Assert.assertEquals(false, a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}