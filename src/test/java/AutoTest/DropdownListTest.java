package AutoTest;

import Pages.DropDownList;
import config.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DropdownListTest extends TestBase {
    private DropDownList dropDownLists;

    @Test
    public void dropdownMenuSelecting() throws InterruptedException {
        dropDownLists = new DropDownList(driver);

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        dropDownLists.getDropDownMenu().click();

        dropDownLists.getOptionOne().click();

        Thread.sleep(5000, 0);

        dropDownLists.getOptionTwo().click();

        dropDownLists.getTextElement().click();


    }

}
