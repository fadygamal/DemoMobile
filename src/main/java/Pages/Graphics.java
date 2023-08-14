package Pages;

import Actions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphics {
    private SHAFT.GUI.WebDriver driver;

    public Graphics(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getScaleToFit = AppiumBy.accessibilityId("ScaleToFit");
    private final By getVertices = AppiumBy.accessibilityId("Vertices");

    public Graphics scrollDownToScaleToFit() {
        new MobileActions(driver.getDriver()).scrollDownToSpecificText("ScaleToFit");
        return this;
    }

    public Graphics clickOnScaleToFit() {
        driver.element().click(getScaleToFit);
        return this;
    }

    public Graphics scrollDownToVertices() {
        new MobileActions(driver.getDriver()).scrollDownToSpecificText("Vertices");
        return this;
    }

    public Graphics clickOnVertices() {
        driver.element().click(getVertices);
        return this;
    }


}
