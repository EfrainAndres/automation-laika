package co.com.laika.stepDefinitions;

import co.com.laika.pages.AppPage;
import co.com.laika.pages.LoginPage;
import co.com.laika.util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppSteps extends TestBase {

    LoginPage loginpage;
    AppPage homepage;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        TestBase.initialization();
    }

    @When("I login with valid credentials")
    public void i_login_with_valid_crendentials() {
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));
    }

    @Then("I Order T-Shirts")
    public void i_order_TShirts() {
        homepage.ClickTShirtsLink();
    }

    @Then("I Verify the T-Shirt order in order history")
    public void i_verify_the_TShirt_order_in_order_history() {
        boolean flag = homepage.verifyOrderHistory();
        Assert.assertTrue(flag);
        driver.close();
    }

    @Then("I update {string}")
    public void i_update(String FName) {
        homepage.MyPersonalInfo(prop.getProperty("firstname"), prop.getProperty("password"));
    }

    @Then("I Verify the updated {string}")
    public void i_verify_the_the_updated(String FName) {
        String UsrName = homepage.GetUserName();
        assertThat(UsrName, containsString(prop.getProperty("firstname")));
        driver.close();
    }

}
