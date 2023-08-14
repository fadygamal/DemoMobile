package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity {
    private SHAFT.GUI.WebDriver driver;

    public Activity(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getCustomTitleButton = AppiumBy.accessibilityId("Custom Title");

    public Activity clickOnCustomTitleButton() {
        driver.element().click(getCustomTitleButton);
        return this;
    }

}
