package AutoTest;
import java.util.concurrent.TimeUnit;
import Pages.Checkboxes;
import config.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CheckboxTest extends TestBase {
    private Checkboxes checkboxes;

    @Test
    public void checkboxClicking() throws InterruptedException {
        checkboxes = new Checkboxes(driver);
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        checkboxes.getFirstCheckbox().click();
        Thread.sleep(5000);
        checkboxes.getSecondCheckbox().click();
    }
}
