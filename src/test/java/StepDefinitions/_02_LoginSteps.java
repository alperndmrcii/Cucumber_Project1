package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {
    DialogContent dc=new DialogContent();
    @When("user enter username as {string} and {string}")
    public void userEnterUsernameAsAnd(String username, String password) {
        dc.sendKeysFunction(dc.username1, username);
        dc.sendKeysFunction(dc.password1, password);
    }

    @And("user Click on the login button")
    public void userClickOnTheLoginButton() {
        dc.clickFunction(dc.loginBtn);
    }

    @Then("User should logged in")
    public void userShouldLoggedIn() {
        GWD.getDriver().getCurrentUrl().toLowerCase().contains("overview");
    }

    @Then("login shoul fail")
    public void loginShoulFail() {
       dc.verifyContainsTextFunction(dc.Error,"verified");
    }

    @And("click on the logout button")
    public void clickOnTheLogoutButton() {
        dc.clickFunction(dc.logOut);
    }
}
