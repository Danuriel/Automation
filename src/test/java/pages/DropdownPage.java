package pages;

import config.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage extends TestBase {
    @FindBy(xpath = "//*[@id='dropdown']")
    private WebElement dropDownMenu;

    @FindBy(xpath = "//select[@id='dropdown']/option[1]")
    private WebElement dropDownDefault;

    @FindBy(xpath ="//select[@id='dropdown']/option[2]" )
    private WebElement dropDownOne;

    @FindBy(xpath = "//select[@id='dropdown']/option[3]")
    private WebElement dropDownTwo;

    public DropdownPage() {
        driver = TestBase.getOrCreateDriver();
        PageFactory.initElements(driver, this);
    }
    public WebElement getDropDownMenu() {
        return dropDownMenu;
    }
    public WebElement getDropDownDefault() {
        return dropDownDefault;
    }
    public WebElement getDropDownOne() {
        return dropDownOne;
    }
    public WebElement getDropDownTwo() {
        return dropDownTwo;
    }
    public WebDriver getTheDriver() {
        return driver;
    }


}
