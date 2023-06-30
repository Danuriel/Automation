package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownList {
    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    private WebElement textElement;

    @FindBy(id = "dropdown")
    private WebElement dropDownMenu;

    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[1]")
    private WebElement optionDefault;

    @FindBy(xpath = "//option[@value='1']")
    private WebElement optionOne;

    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[3]")
    private WebElement optionTwo;

    public DropDownList(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getDropDownMenu() {return dropDownMenu;}

    public WebElement getOptionDefault() {return optionDefault;}

    public WebElement getOptionOne() {return optionOne;}

    public WebElement getOptionTwo() {return optionTwo;}

    public WebElement getTextElement() {return textElement;}


}
