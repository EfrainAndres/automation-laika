package co.com.laika.pages.user.login;

import co.com.laika.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id = "dropdown_options")
    WebElement OpenMenu;

    @FindBy(id = "layout_login")
    WebElement OpenModalLogin;

    @FindBy(id = "email-login")
    WebElement InputEmail;

    @FindBy(id = "pass-login")
    WebElement InputPassword;

    @FindBy(xpath = "//input[@id='check_terms_condition_policie_login' and @type='checkbox']")
    WebElement CheckConditionsAndTerms;

    @FindBy(id = "log")
    WebElement ButtonSignIn;

    @FindBy(xpath = "/html/body/nav/div[1]/div/div[1]/div[3]/span/span/span")
    WebElement LabelUserName;

    @FindBy(xpath = "/html/body/div[19]/div/div[3]")
    WebElement AlertErrorEmail;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage openMenuLink() {
        OpenMenu.click();
        return new LoginPage();
    }

    public LoginPage OpenModalLogin() {
        OpenModalLogin.click();
        return new LoginPage();
    }

    public LoginPage SendEmailInput(String email) {
        InputEmail.sendKeys(email);
        return new LoginPage();
    }

    public LoginPage SendPasswordInput(String password) {
        InputPassword.sendKeys(password);
        return new LoginPage();
    }

    public LoginPage ClickCheck() {
        Actions act= new Actions(driver);
        act.moveToElement(CheckConditionsAndTerms).click().build().perform();
        return new LoginPage();
    }

    public LoginPage ClickButtonSignIn() {
        ButtonSignIn.click();
        return new LoginPage();
    }

    public String GetLabelUserName() {
        return LabelUserName.getText();
    }

    public String GetAlertErrorEmail() {
        return AlertErrorEmail.getText();
    }
}
