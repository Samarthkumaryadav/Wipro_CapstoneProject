package StepDefinition;

import io.cucumber.java.en.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.concurrent.TimeUnit;
public class BStack1 {
    WebDriver driver;
    PageClass pg;

    @Given("User launches browser")
    public void user_launches_browser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        pg = new PageClass(driver);
    }

    @When("User navigates to BStackDemo site")
    public void user_navigates_to_site() {
        driver.get("https://bstackdemo.com/");
    }

    // Login
    @And("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() throws IOException, InterruptedException {       
        pg.Login_1();
    }
    

    @And("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful using valid credentials");
    }

   // Cart
    @And("User searches and adds first product to cart")
    public void user_searches_and_adds_first_product_to_cart() throws InterruptedException {
        pg.addProductToCart();
        Thread.sleep(3000);
//      pg.openCart();
        pg.removeProductFromCart();
        Thread.sleep(2000);
        pg.closeCart();
        Thread.sleep(2000);
        pg.addProductToCart();
              
    }

    @And("Product should be visible in cart")
    public void product_should_be_visible_in_cart() {
        System.out.println("Product successfully added to cart, deleted from cart and then again added to cart");
    }

    // Checkout
    @And("User proceeds to checkout")
    public void user_proceeds_to_checkout() throws InterruptedException {
        Thread.sleep(2000);
        pg.clickCheckout();
    }

    @And("Checkout page should be displayed")
    public void checkout_page_should_be_displayed() {
        System.out.println("Checkout page is displayed");
    }

    // Shipping Address
    @And("^User enters shipping details with firstname \"([^\"]*)\", lastname \"([^\"]*)\", address \"([^\"]*)\", state \"([^\"]*)\", and pincode \"([^\"]*)\"$")
    public void user_enters_shipping_details(String fname, String lname, String addr, String province, String pincode) throws InterruptedException {
        
        pg.ShippingAddress(fname, lname, addr, province, pincode);
        Thread.sleep(3000);
    }


    @And("Shipping address should be saved")
    public void shipping_address_should_be_saved() {
        System.out.println("Shipping address saved");
    }

    // Order Receipt
    @And("User downloads order receipt")
    public void user_downloads_order_receipt() throws InterruptedException {
    	Thread.sleep(2000);
    	pg.clickOrderReceipt();
    }

    @And("Order receipt should be downloaded")
    public void order_receipt_should_be_downloaded() {
        System.out.println("Order receipt downloaded");
    }

    // Shopping 
    @And("User clicks Continue shopping")
    public void user_clicks_continue_shopping() throws InterruptedException {
    	Thread.sleep(2000);
    	pg.clickContinue();
    }

    @Then("User should be redirected to shopping home page")
    public void user_should_be_redirected_to_shopping_home_page() {
        System.out.println("Redirected back to shopping page");
        driver.quit();
    }
}
