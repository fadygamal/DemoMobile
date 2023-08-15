package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CustomTitle {
    private SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public CustomTitle(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getLeftText = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private final By getChangeLeftButton = AppiumBy.accessibilityId("Change Left");

    public CustomTitle clearLeftText() {
        driver.element().clear(getLeftText);
        return this;
    }

    public CustomTitle typeLeftText(String text) {
        driver.element().type(getLeftText, text);
        return this;
    }

    public CustomTitle clickOnChangeLeftButton() {
        driver.element().click(getChangeLeftButton);
        return this;
    }

    public CustomTitle assertLeftText() {
        SHAFT.Validations.assertThat().object(driver.element().getText(getLeftText)).equals(testData.getTestData("AssertLeftText"));
        return this;
    }

}
