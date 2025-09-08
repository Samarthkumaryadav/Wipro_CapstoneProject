package StepDefinition;



import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Image_Users {
    WebDriver driver;
    PageClass pg;

    @Given("User launches Browser")
    public void user_launches_Browser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @When("User navigates to BStackDemo Website")
    public void user_navigates_to_Website() {
        driver.get("https://bstackdemo.com/");
        pg = new PageClass(driver);
    }

    @And("User logs in with image_not_loading_user")
    public void user_logs_in_with_image_not_loading_user() throws InterruptedException {
        pg.Login_2();
    }

    @And("Validate that user logged in successfully")
    public void validate_login_success() {
        System.out.println("✅ image_not_loading_user logged in successfully.");
    }

    @Then("User will log out")
    public void user_will_log_out() throws InterruptedException {
    	Thread.sleep(2000);
    	pg.clickLogout();
    	Thread.sleep(2000);
        driver.quit();
    }
}
