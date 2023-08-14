package Pages;

import Actions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vertices {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public Vertices(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getTheSwipeElement = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']//android.view.View");

    public Vertices swipeRight() {
        new MobileActions(driver.getDriver()).swipeRightOnElement(getTheSwipeElement, (WebDriver) driver);
        return this;
    }

    public Vertices swipeLeft() {
        new MobileActions(driver.getDriver()).swipeLeftOnElement(getTheSwipeElement);
        return this;
    }
}
