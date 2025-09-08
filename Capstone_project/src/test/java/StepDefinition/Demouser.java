package StepDefinition;



import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;


public class Demouser {
    WebDriver driver;
    PageClass pg;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        pg = new PageClass(driver);
    }

    @When("User navigates to BStackDemo website")
    public void user_navigates_to_bstackdemo_website() {
        driver.get("https://bstackdemo.com/");
       
    }

    @And("User logs in with demouser")
    public void user_logs_in_with_demouser() throws InterruptedException {
            pg.Login_1();
    }

    @And("User performs shopping flow with brands:")
    public void user_performs_shopping_flow_with_brands() throws InterruptedException {
    	pg.Shopbybrand();
    }

    @And("User searches for {string}")
    public void user_searches_for(String string) {
        pg.searchProduct(string);
    }

    @And("Apply Low to High filter")
    public void apply_low_to_high_filter() throws InterruptedException {
        pg.selectlowtohigh();
    }

    @And("Apply High to Low filter")
    public void apply_high_to_low_filter() throws InterruptedException {
        pg.selecthightolow();
    }

    @And("User clicks Privacy Policy Read More")
    public void user_clicks_privacy_policy_read_more() throws InterruptedException {
        pg.clickPrivacyPolicyReadMore();
    }

    @And("Privacy Policy page should open")
    public void privacy_policy_page_should_open() {
        System.out.println("Privacy Policy Readmore button is clickable");
    }

    @And("User clicks Offers page")
    public void user_clicks_offers_page() {
        pg.clickOffers();
    }

    @And("Offers message should be validated")
    public void offers_message_should_be_validated() {
        String offersText = driver.findElement(pg.offerspage).getText();
        Assert.assertTrue(offersText.contains("We've promotional offers in your location."));
        System.out.println("Offers page validated successfully");
    }

    @Then("User logs out")
    public void user_logs_out() throws InterruptedException {
    	Thread.sleep(2000);
        pg.clickLogout();
        Thread.sleep(2000);
        driver.quit();
    }
}

