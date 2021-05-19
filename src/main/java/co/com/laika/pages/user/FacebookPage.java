package co.com.laika.pages.user;

import co.com.laika.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends TestBase {

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/table/tbody/tr[2]/td[1]/span")
    WebElement ButtonFacebook;

    @FindBy(id = "email")
    WebElement InputEmail;

    @FindBy(id = "pass")
    WebElement InputPassword;

    @FindBy(xpath = "//input[@name='login' and @type='submit']")
    WebElement ButtonSignIn;

    public FacebookPage() {
        PageFactory.initElements(driver, this);
    }

    public FacebookPage ClicButtonFacebook() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[6]/div/div/div/form/a/div[4]/div/div/span/iframe")));
        //WebElement fb = driver.findElement(By.css("_8jan"));//fb Like button
        Thread.sleep(10000);
        ButtonFacebook.click();
        driver.switchTo().defaultContent();
        return new FacebookPage();
    }

}
