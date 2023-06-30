package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.CheckboxPage;

public class CheckboxStepDefinition {
    private CheckboxPage checkboxPage = new CheckboxPage();

    @Given("The user opens the checkbox page")
    public void theUserOpensCheckboxApp() {
        checkboxPage.getDriver().navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }
    @When("The user ticks the BoxNumber {int} if not ticked")
    public void theUserTicksBox(int checkboxnumber) {
        if (checkboxnumber == 1) {
            checkboxPage.tickEmptyBox(checkboxPage.getCheckBoxOne());
        }
        if (checkboxnumber == 2) {
            checkboxPage.tickEmptyBox(checkboxPage.getCheckBoxTwo());
        }

    }


    @Then("Both boxes are ticked")
    public void bothBoxesTicked() {
        Assertions.assertTrue(checkboxPage.getCheckBoxOne().isSelected());
        Assertions.assertTrue(checkboxPage.getCheckBoxTwo().isSelected());
    }
}
