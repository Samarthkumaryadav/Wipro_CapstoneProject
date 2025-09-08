package StepDefinition;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PageClass {
    WebDriver driver;

    // Constructor
    public PageClass(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for Login 
    By signin = By.id("signin");
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.id("login-btn");
    By logoutBtn = By.xpath("//span[text()='Logout']");
    By lockedstatus = By.xpath("//h3[text()='Your account has been locked.']");
    
   // Locators for Filter,offers,OderReceipt,Privacy policy, ContinueBtn,Search,Orders
    By select = By.partialLinkText("Select");
    By filterlowtohigh = By.xpath("//option[text()='Lowest to highest']");
    By filterhightolow = By.xpath("//option[text()='Highest to lowest']");
    By offersBtn = By.cssSelector("a#offers");
    By offerspage = By.cssSelector("div.p-6");
    By privacyPolicyReadMore = By.xpath("//a[text()='Read More']");
    By orderReceiptBtn = By.id("downloadpdf");
    By continueBtn = By.xpath("//button[text()='Continue Shopping »']");
    By searchField = By.cssSelector("input[placeholder=\"Search\"]");	
    By searchBtn = 	By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]");
    By orders = By.cssSelector("a[id='orders'][class='Navbar_link__3Blki menu-item']");

    // Locators for Cart and Checkout
    By AddToCart = By.xpath("//*[@id=\"1\"]/div[4]");
    By opcartBtn = By.xpath("//span[@class='bag bag--float-cart-closed']"); 
    By clscartBtn = By.xpath("//div[@class='float-cart__close-btn']");
    By deleteFromCart = By.cssSelector("div[class=\"shelf-item__del\"]");
    By checkout = By.xpath("//div[@class='buy-btn']");
    
    //Locators for Shipping Address
    By FirstName = By.id("firstNameInput");
    By LastName = By.id("lastNameInput");
    By addressline = By.id("addressLine1Input");
    By state = By.id("provinceInput");
    By postalCode = By.id("postCodeInput"); 
    By submit = By.id("checkout-shipping-continue");
    
    // Locators for Favourites
    By ProductFavIcon = By.cssSelector("div[id='6'] svg[class='MuiSvgIcon-root Icon']");
    By favMenuBtn = By.xpath("//strong[text()='Favourites']"); 
    By favRemoveBtn = By.cssSelector("div[id='1'] svg[class='MuiSvgIcon-root Icon']");
    
    //Locators for Shop By Brand and Shop By all Brands
    By apple = By.xpath("//span[@class='checkmark'][1]");
    By samsung = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[2]/label/span");
    By google = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[3]/label/span");
    By oneplus = By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[4]/label/span");
    

    
    //Different users Login Methods
    public void Login_1() throws InterruptedException {      
                driver.findElement(signin).click();
                Thread.sleep(2000);
                driver.findElement(usernameField).click();
                driver.findElement(By.xpath("//div[text()='demouser']")).click();
                driver.findElement(passwordField).click();
                driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
                driver.findElement(loginBtn).click();
            }
    public void Login_2() throws InterruptedException {      
        driver.findElement(signin).click();
        Thread.sleep(2000);
        driver.findElement(usernameField).click();
        driver.findElement(By.xpath("//div[text()='image_not_loading_user']")).click();
        driver.findElement(passwordField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void Login_3() throws InterruptedException {      
        driver.findElement(signin).click();
        Thread.sleep(2000);
        driver.findElement(usernameField).click();
        driver.findElement(By.xpath("//div[text()='existing_orders_user']")).click();
        driver.findElement(passwordField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void Login_4() throws InterruptedException {      
        driver.findElement(signin).click();
        Thread.sleep(2000);
        driver.findElement(usernameField).click();
        driver.findElement(By.xpath("//div[text()='fav_user']")).click();
        driver.findElement(passwordField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    public void Login_5() throws InterruptedException {      
        driver.findElement(signin).click();
        Thread.sleep(2000);
        driver.findElement(usernameField).click();
        driver.findElement(By.xpath("//div[text()='locked_user']")).click();
        driver.findElement(passwordField).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(loginBtn).click();
    }
    

    public void clickLogout() {
        driver.findElement(logoutBtn).click();
    }

    //Filters Methods
    public void selectlowtohigh() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(filterlowtohigh).click();
        Thread.sleep(2000);
    }
    public void selecthightolow() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(filterhightolow).click();
        Thread.sleep(2000);
    }
    
    
  // Offers,Receipt, Privacy policy, Continue, Search... Methods
    public void clickOffers() {
        driver.findElement(offersBtn).click();
    }

    public void clickPrivacyPolicyReadMore() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(privacyPolicyReadMore).click();
        Thread.sleep(2000);
    }

    public void clickOrderReceipt() {
        driver.findElement(orderReceiptBtn).click();
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }
    public void searchProduct(String string) {
    	WebElement search = driver.findElement(searchField);
		search.sendKeys(string);
		driver.findElement(searchBtn).click();
    }

    
    // Cart Methods
    public void addProductToCart() {
        driver.findElement(AddToCart).click();
    }

    public void openCart() {
        driver.findElement(opcartBtn).click();
    }
    public void closeCart() {
    	driver.findElement(clscartBtn).click();
    }

    public void removeProductFromCart() {
        driver.findElement(deleteFromCart).click();
    }
    public void clickCheckout() {
        driver.findElement(checkout).click();
    }
    
 // Shipping Address Methods
    public void ShippingAddress(String fname, String lname, String addr, String province, String pincode) {
        driver.findElement(FirstName).clear();
        driver.findElement(FirstName).sendKeys(fname);

        driver.findElement(LastName).clear();
        driver.findElement(LastName).sendKeys(lname);

        driver.findElement(addressline).clear();
        driver.findElement(addressline).sendKeys(addr);

        driver.findElement(state).clear();
        driver.findElement(state).sendKeys(province);

        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(pincode);

        driver.findElement(submit).click();
    }


    // Favourite Methods
    public void addProductToFavourites() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,400);");
        driver.findElement(ProductFavIcon).click();
    }

    public void openFavourites() {
        driver.findElement(favMenuBtn).click();
    }

    public void removeProductFromFavourites() {
        driver.findElement(favRemoveBtn).click();
    }
    
    //Shop by brands Methods
    public void Shopbybrand() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(apple).click();
    	Thread.sleep(2000);
    	driver.findElement(samsung).click();
    	Thread.sleep(2000);
    	driver.findElement(google).click();
    	Thread.sleep(2000);
    	driver.findElement(oneplus).click();
    	Thread.sleep(2000);
    	   	
    }
}

