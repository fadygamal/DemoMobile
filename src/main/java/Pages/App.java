package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class App {
    private SHAFT.GUI.WebDriver driver;

    public App(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getActivityButton = AppiumBy.accessibilityId("Activity");

    public App clickOnCustomActivityButton() {
        driver.element().click(getActivityButton);
        return this;
    }


}
