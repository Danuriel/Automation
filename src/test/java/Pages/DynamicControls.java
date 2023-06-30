package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControls {

    @FindBy(xpath = "//div[@id = 'checkbox']")
    private WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"checkbox-example\"]/button")
    private WebElement removeCheckbox;

    @FindBy(xpath = "//*[@id=\"loading\"]")
    private WebElement textMessage;
}
