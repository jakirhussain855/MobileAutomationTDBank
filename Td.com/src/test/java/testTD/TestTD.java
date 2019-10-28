package testTD;

import Pages.HomePage;
import Pages.LoginPage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTD extends MobileAPI {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        loginPage = PageFactory.initElements(appiumDriver, LoginPage.class);
    }


    //@Test
    public void uiTestCases() {
        homePage.UIvalidations();
    }

    //@Test
    public void forgotPassFunctionality() {
        homePage.clickOnAccountt();
        loginPage.clickForgotPass();
    }

    @Test
    public void swipe() {
        homePage.swipeDown();
    }

    //@Test
    public void checkAccountBalance() {
        homePage.clickOnAccountt();
        loginPage.fillUsernamePass("user", "pass");
    }
}
