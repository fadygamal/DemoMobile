package Pages;


import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;


public class HomePage {
     SHAFT.GUI.WebDriver driver;


    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getAccessibilityButton = AppiumBy.accessibilityId("Access'ibility");
    private final By getAppButton = AppiumBy.accessibilityId("App");
    private final By getGraphicButton = AppiumBy.accessibilityId("Graphics");
    private final By getViewsButton = AppiumBy.accessibilityId("Views");


    public HomePage clickOnAccessibilityButton() {
        driver.element().click(getAccessibilityButton);
        return this;
    }

    public HomePage clickOnAppButton() {
        driver.element().click(getAppButton);
        return this;
    }

    public HomePage clickOnGraphicButton() {
        driver.element().click(getGraphicButton);
        return this;
    }

    public HomePage clickOnViewsButton() {
        driver.element().click(getViewsButton);
        return this;
    }


}
