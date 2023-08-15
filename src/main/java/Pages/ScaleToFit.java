package Pages;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFit {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    public ScaleToFit(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getScaleToFitPageText = AppiumBy.xpath("//android.widget.TextView[@text ='Graphics/ScaleToFit']");

    public ScaleToFit assertScaleToFitPageIsOpened() {
        SHAFT.Validations.assertThat().object(driver.element().getText(getScaleToFitPageText)).equals("Graphics/ScaleToFit");
        return this;
    }


}
