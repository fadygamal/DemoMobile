package Pages;

import Actions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Views {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public Views(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getRadioGroup = AppiumBy.accessibilityId("Radio Group");

    public Views scrollDownToSRadioGroup() {
        new MobileActions(driver.getDriver()).scrollDownToSpecificText("Radio Group");
        return this;
    }

    public Views clickOnRadioGroup() {
        driver.element().click(getRadioGroup);
        return this;
    }
}
