package Test;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckboxPage;

public class CheckboxTest extends TestBase {
    public CheckboxPage checkboxPage = new CheckboxPage();
    public WebDriver getDriver;

    @Test
    public void tickCheckboxes() {
        checkboxPage.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");

//        checkboxPage.isChecked(checkboxPage.getCheckBoxOne());
        if (checkboxPage.getCheckBoxOne().getAttribute("checked") == null) {
            checkboxPage.getCheckBoxOne().click();
        }
        Assertions.assertTrue(checkboxPage.getCheckBoxOne().isSelected());
        Assertions.assertTrue(checkboxPage.getCheckBoxTwo().isSelected());
    }

    @Test
    public void tickCheckboxes2() {
        checkboxPage.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");

//        checkboxPage.isChecked(checkboxPage.getCheckBoxOne());
        if (checkboxPage.getCheckBoxOne().getAttribute("checked") == null) {
            checkboxPage.getCheckBoxOne().click();
        }
        Assertions.assertTrue(checkboxPage.getCheckBoxOne().isSelected());
        Assertions.assertTrue(checkboxPage.getCheckBoxTwo().isSelected());
    }

    @Test
    public void tickCheckboxes3() {
        checkboxPage.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");

//        checkboxPage.isChecked(checkboxPage.getCheckBoxOne());
        if (checkboxPage.getCheckBoxOne().getAttribute("checked") == null) {
            checkboxPage.getCheckBoxOne().click();
        }
        Assertions.assertTrue(checkboxPage.getCheckBoxOne().isSelected());
        Assertions.assertTrue(checkboxPage.getCheckBoxTwo().isSelected());
    }
}
