package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroup {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public RadioGroup(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getSnackRadioButton = AppiumBy.id("io.appium.android.apis:id/snack");

    public RadioGroup clickOnSnackRadioButton() {
        driver.element().click(getSnackRadioButton);
        return this;
    }

    public RadioGroup assertSnackRadioButton() {
        SHAFT.Validations.assertThat().object(driver.element().getAttribute(getSnackRadioButton, "checked")).equals("true");
        return this;
    }
}
