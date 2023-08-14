import Configurations.TestConfigurations;
import Pages.*;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;


public class Test_MobileActions{
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("Data.json");

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
       new TestConfigurations(driver).setupDevice();
       driver = new SHAFT.GUI.WebDriver();

    }


    @Test
    public void testClickAction() {
        new HomePage(driver)        .clickOnAccessibilityButton();
        new Accessibility(driver)   .assertAccessibilityNodeProvider();
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver)    .clickOnAppButton();
        new App(driver)         .clickOnCustomActivityButton();
        new Activity(driver)    .clickOnCustomTitleButton();
        new CustomTitle(driver) .clearLeftText()
                                .typeLeftText(testData.getTestData("LeftText"))
                                .clickOnChangeLeftButton()
                                .assertLeftText();


    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver)                    .clickOnAccessibilityButton();
        new Accessibility(driver)               .clickOnAccessibilityNodeQuerying();
        new AccessibilityNodeQuerying(driver)   .clickOnTaskConquerWorldCheckBox();
        new AccessibilityNodeQuerying(driver)   .assertTaskConquerWorldCheckBoxIsChecked();
    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver)    .clickOnGraphicButton();
        new Graphics(driver)    .scrollDownToScaleToFit()
                                .clickOnScaleToFit();
        new ScaleToFit(driver)  .assertScaleToFitPageIsOpened();
    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)    .clickOnGraphicButton();
        new Graphics(driver)    .scrollDownToVertices()
                                .clickOnVertices();
        new Vertices(driver)    .swipeRight()
                                .swipeLeft();

    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver)    .clickOnViewsButton();
        new Views(driver)       .scrollDownToSRadioGroup()
                                .clickOnRadioGroup();
        new RadioGroup(driver)  .clickOnSnackRadioButton()
                                .assertSnackRadioButton();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
