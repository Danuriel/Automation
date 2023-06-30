package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class Checkboxes {
    @FindBy(xpath = "//html/body/div[2]/div/div/form/input[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[2]")
    private WebElement secondCheckbox;

    public Checkboxes(WebDriver driver) {PageFactory.initElements(driver, this); }

    public WebElement getFirstCheckbox() {return firstCheckbox;}

    public WebElement getSecondCheckbox() {return secondCheckbox;}
}
