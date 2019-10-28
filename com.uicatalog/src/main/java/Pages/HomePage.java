package Pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]\n")
    WebElement alertView;


    public void clickAlert() {
        alertView.click();
    }

}
