package StepDefinition;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class Locked_User {
    WebDriver driver;
    PageClass pg;

    @Given("User launches their Browser")
    public void user_launches_their_Browser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @When("User navigates to the BStackDEMO site")
    public void user_navigates_to_the_BStackDEMO_site() {
        driver.get("https://bstackdemo.com/");
        pg = new PageClass(driver);
    }

    @And("User logs in with locked_user")
    public void user_logs_in_with_locked_user() throws InterruptedException {
        pg.Login_5();
    }

    @Then("Validate locked account message")
    public void validate_locked_message() throws InterruptedException {
    	Thread.sleep(2000);
        String msg = driver.findElement(pg.lockedstatus).getText();
        Assert.assertEquals("Your account has been locked.", msg);
        System.out.println("✅ Locked user message validated.");
        driver.quit();
    }
}
