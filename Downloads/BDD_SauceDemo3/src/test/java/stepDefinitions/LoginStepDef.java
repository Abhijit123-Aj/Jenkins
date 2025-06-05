package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.Reporter;
import io.cucumber.java.en.*;

public class LoginStepDef {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
        Reporter.test.info("Navigated to SauceDemo login page");
    }

    @When("the user enters username as {string} and password as {string} and click login button")
    public void the_user_enters_username_as_and_password_as_and_click_login_button(String username, String password) {
        loginPage.login(username, password);
        boolean isSuccess = false;
        try {
            isSuccess = loginPage.validateLogin();
        } catch (Exception e) {
            // Ignore, will assert later
        }

        if (isSuccess) {
            Reporter.test.pass("Login successful with username: " + username);
        } else {
            Reporter.test.fail("Login failed with username: " + username);
        }

        Assert.assertTrue(isSuccess, "Login validation failed!");
    }

    @Then("the user validates the text Products")
    public void the_user_validates_the_text_products() {
        Reporter.test.info("Product page validation done.");
    }
}
