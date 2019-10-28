package Pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement accountsDeatils;
    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    WebElement transferOrder;
    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    WebElement depositAmmount;
    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoneyToAccount;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;


    public void UIvalidations() {
        sleepFor(10);
        if (accountsDeatils.isDisplayed()) {
            System.out.println(accountsDeatils.getText() + " : is displayed");
        }
        if (transferOrder.isDisplayed()) {
            System.out.println(transferOrder.getText() + " : is displayed");
        }
        if (depositAmmount.isDisplayed()) {
            System.out.println(depositAmmount.getText() + " : is displayed");
        }
        if (sendMoneyToAccount.isDisplayed()) {
            System.out.println(sendMoneyToAccount.getText() + " : is displayed");
        }
    }

    public void clickOnAccountt() {
        sleepFor(10);
        //ad.findElement(By.xpath("abcd")).click();
        String account = accountsDeatils.getText();
        accountsDeatils.click();
        TestLogger.log(" message ");
        System.out.println(account + ": has been clicked");
    }

    public void clickOnLogin() {
        sleepFor(1);
        String account = accountsDeatils.getText();
        accountsDeatils.click();
        System.out.println(account + ": has been clicked");
        sleepFor(1);

    }

    public void swipeDown() {
        sleepFor(1);
        MobileAPI.functionSwipe("up", 200, 200);

    }
}
