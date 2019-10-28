package Pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='Forgot your password?']")
    WebElement passWordForgot;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userName;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement passWord;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement loginButton;

    public void clickForgotPass() {
        sleepFor(2);
        passWordForgot.click();
    }

    public void fillUsernamePass(String usName, String password) {
        sleepFor(2);
        userName.sendKeys(usName);
        System.out.println("UserName:");
        passWord.sendKeys(password);
        System.out.println("PassWord is");
    }

    public void clickOnLogin() {
        String loginn = loginButton.getText();
        loginButton.click();
        System.out.println(loginn + "login button clicked");
    }

}
