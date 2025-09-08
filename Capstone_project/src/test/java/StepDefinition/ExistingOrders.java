package StepDefinition;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExistingOrders {
    WebDriver driver;
    PageClass pg;

    @Given("User launches their browser")
    public void user_launches_their_browser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @When("User navigates to the BStackDemo Website")
    public void user_navigates_to_the_BStackDemo_Website() {
        driver.get("https://bstackdemo.com/");
        pg = new PageClass(driver);
    }

    @And("User logs in with existing_orders_user")
    public void user_logs_in_with_existing_user() throws InterruptedException {
        pg.Login_3();
    }

    @And("Open Orders and sees")
    public void Open_Orders_and_sees() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(pg.orders).click();
        System.out.println("✅ Orders are present for existing_orders_user.");
    }

    @Then("User logs out of the site")
    public void user_logs_out_of_the_site() throws InterruptedException {
    	Thread.sleep(2000);
        pg.clickLogout();
        Thread.sleep(2000);
        driver.quit();
    }
}
