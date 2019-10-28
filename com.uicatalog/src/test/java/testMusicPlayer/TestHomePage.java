package testMusicPlayer;

import Pages.HomePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI {
    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }


    @Test
    public void uiTestCases() {
        homePage.clickAlert();
        sleepFor(20);
    }
}