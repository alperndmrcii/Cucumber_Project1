package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_RegisterSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click on Register button")
    public void clickOnRegisterButton() {
        dc.clickFunction(dc.Register);
    }

    @And("Fill the necessary informations")
    public void fillTheNecessaryInformations() {
        dc.sendKeysFunction(dc.firstName,"ahmet");
        dc.sendKeysFunction(dc.lastName,"mehmet");
        dc.sendKeysFunction(dc.adressStreet,"Kazimdirik");
        dc.sendKeysFunction(dc.adressCity,"Aasdasd");
        dc.sendKeysFunction(dc.adressState, "Bornova");
        dc.sendKeysFunction(dc.zipCode,"56308");
        dc.sendKeysFunction(dc.phoneNumber,"05555555555");
        dc.sendKeysFunction(dc.ssn,"305302");
        dc.sendKeysFunction(dc.username,"ahmet123");
        dc.sendKeysFunction(dc.password,"ahmet321");
        dc.sendKeysFunction(dc.repeatPassword,"ahmet321");
    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
        dc.clickFunction(dc.registerBtn);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage,"successfully");
    }
}
