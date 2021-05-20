package co.com.laika.pages.user.register;

import co.com.laika.pages.user.login.LoginPage;
import co.com.laika.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase {

    @FindBy(id = "layout_createAccount")
    WebElement OpenModalRegister;

    @FindBy(xpath = "//*[@id=\"form_create\"]/div[1]/a[1]/div[1]/div[1]/input")
    WebElement InputFullName;

    @FindBy(xpath = "//*[@id=\"form_create\"]/div[1]/a[1]/div[1]/div[2]/input")
    WebElement InputEmail;

    @FindBy(id = "pass-create")
    WebElement InputPassword;

    @FindBy(xpath = "//input[@id='check_dog' and @type='checkbox']")
    WebElement CheckDog;

    @FindBy(xpath = "//input[@id='check_cat' and @type='checkbox']")
    WebElement CheckCat;

    @FindBy(xpath = "//input[@id='check_terms_condition_policie_register' and @type='checkbox']")
    WebElement CheckConditionsAndTerms;

    @FindBy(xpath = "/html/body/div[7]/div/div/div/form/div[1]/a[2]/div[1]/button")
    WebElement ButtonRegister;

    @FindBy(xpath = "/html/body/div[7]/div/div/div/form/div[1]/a[2]/div[1]/button")
    WebElement ButtonRedirectModalLogin;

    @FindBy(xpath = "//*[@id=\"form_create\"]/a[2]/div/div/div/input")
    WebElement InputCel;

    @FindBy(xpath = "//*[@id=\"form_create\"]/a[2]/div/label")
    WebElement ButtonContinueCel;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public RegisterPage OpenModalRegister() {
        OpenModalRegister.click();
        return new RegisterPage();
    }

    public RegisterPage SendInputFullName(String fullName) {
        InputFullName.sendKeys(fullName);
        return new RegisterPage();
    }

    public RegisterPage SendInputEmail(String email) {
        InputEmail.sendKeys(email);
        return new RegisterPage();
    }

    public RegisterPage SendInputPassword(String password) {
        InputPassword.sendKeys(password);
        return new RegisterPage();
    }

    public RegisterPage ClickCheckDog() {
        Actions act= new Actions(driver);
        act.moveToElement(CheckDog).click().build().perform();
        return new RegisterPage();
    }

    public RegisterPage ClickCheckCat() {
        Actions act= new Actions(driver);
        act.moveToElement(CheckCat).click().build().perform();
        return new RegisterPage();
    }

    public RegisterPage ClickCheck() {
        Actions act= new Actions(driver);
        act.moveToElement(CheckConditionsAndTerms).click().build().perform();
        return new RegisterPage();
    }

    public RegisterPage ClickButtonRegister() throws InterruptedException {
        ButtonRegister.click();
        Thread.sleep(3000);
        return new RegisterPage();
    }

    public RegisterPage SendInputCel(String cel) throws InterruptedException {
        InputCel.sendKeys(cel);
        ButtonContinueCel.click();
        Thread.sleep(3000);
        return new RegisterPage();
    }
}
