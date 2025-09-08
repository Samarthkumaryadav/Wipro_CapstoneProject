package StepDefinition;



import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FavouriteUser {
    WebDriver driver;
    PageClass pg;

    @Given("User launches the Browser")
    public void user_launches_the_Browser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @When("User navigates to the BStackDemo site")
    public void user_navigates_to_the_BStackDemo_site() {
        driver.get("https://bstackdemo.com/");
        pg = new PageClass(driver);
    }

    @And("User logs in with fav_user")
    public void user_logs_in_with_fav_user() throws InterruptedException {
        pg.Login_4();
    }

    @And("Open Favourites and see items")
    public void Open_Favourites_and_see_items() throws InterruptedException {
    	Thread.sleep(2000);
    	pg.addProductToFavourites();
    	Thread.sleep(2000);
        pg.openFavourites();
        Thread.sleep(2000);
        pg.removeProductFromFavourites();
        
        System.out.println("✅ Favourites checked for fav_user.");
    }

    @Then("User logs out of site")
    public void user_logs_out_of_site() throws InterruptedException {
        pg.clickLogout();
        Thread.sleep(2000);
        driver.quit();
    }
}
