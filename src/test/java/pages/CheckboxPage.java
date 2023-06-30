package pages;

import config.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement checkBoxOne;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement checkBoxTwo;

    public void tickEmptyBox(WebElement checkBox) {
        if (checkBox.isSelected() == false) {
            checkBox.click();
        }
    }

    public CheckboxPage() {
//        driver = TestBase.getOrCreateDriver();
        PageFactory.initElements(driver, this);
    }



    public WebElement getCheckBoxOne() {
        return checkBoxOne;
    }
    public WebElement getCheckBoxTwo() {
        return checkBoxTwo;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void isChecked() {
    }
}
