package stepDefinitions;

import config.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.DropdownPage;

public class DropdownStepDefinition extends TestBase {
    private DropdownPage dropdownPage = new DropdownPage();

    @Given("The user accesses the dropdown page")
    public void userOpensPage() {
            dropdownPage.getTheDriver().navigate().to("https://the-internet.herokuapp.com/dropdown");
        }
    @When("The user opens the dropdown menu")
    public void userSelectsMenu() throws InterruptedException {
        dropdownPage.getDropDownDefault().click();
        Thread.sleep(3000);
    }
    @And("The user selects the first option in the dropdown")
    public void userSelectsFirstOption() throws InterruptedException {
        dropdownPage.getDropDownOne().click();
        Thread.sleep(3000);
    }
    @And("The user selects the second option in the dropdown")
    public void userSelectsSecondOption() {
        dropdownPage.getDropDownTwo().click();
    }
    @Then("The second option remains selected")
    public void secondOptionIsSelected() {
        Assertions.assertTrue(dropdownPage.getDropDownTwo().isSelected());

    }

}
