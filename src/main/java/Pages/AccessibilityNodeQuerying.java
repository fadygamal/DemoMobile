package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeQuerying {
     SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public AccessibilityNodeQuerying(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getTaskConquerWorldCheckBox = AppiumBy.xpath("//android.widget.TextView[@content-desc='Task Conquer World']//parent::android.widget.LinearLayout/android.widget.CheckBox");

    public AccessibilityNodeQuerying clickOnTaskConquerWorldCheckBox() {
        driver.element().click(getTaskConquerWorldCheckBox);
        return this;
    }

    public AccessibilityNodeQuerying assertTaskConquerWorldCheckBoxIsChecked() {
        SHAFT.Validations.assertThat().object(driver.element().getAttribute(getTaskConquerWorldCheckBox, "checked")).equals("true");
        return this;
    }

}