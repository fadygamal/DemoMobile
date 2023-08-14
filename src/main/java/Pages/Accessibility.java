package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Accessibility {
     SHAFT.GUI.WebDriver driver;
     SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");


    public Accessibility(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getAccessibilityNodeProvider = AppiumBy.accessibilityId("Accessibility Node Provider");
    private final By getAccessibilityNodeQuerying = AppiumBy.accessibilityId("Accessibility Node Querying");


    public Accessibility assertAccessibilityNodeProvider() {
        SHAFT.Validations.assertThat().object(driver.element().getText(getAccessibilityNodeProvider)).equals(testData.getTestData("AssertAccessibility"));
        return this;
    }

    public Accessibility clickOnAccessibilityNodeQuerying() {
        driver.element().click(getAccessibilityNodeQuerying);
        return this;
    }
}
