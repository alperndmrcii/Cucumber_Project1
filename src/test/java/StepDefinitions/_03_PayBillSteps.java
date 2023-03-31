package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_PayBillSteps {
    DialogContent dc=new DialogContent();

    @When("user click on the billpay button")
    public void userClickOnTheBillpayButton() {
        dc.clickFunction(dc.billPay);

    }
    @And("user should fill the payee informations")
    public void userShouldFillThePayeeInformations(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));}

   /*     dc.sendKeysFunction(dc.payeeName,"Elektrik");
        dc.sendKeysFunction(dc.adressStreet,"asdasasd");
        dc.sendKeysFunction(dc.adressCity, "asdasd");
        dc.sendKeysFunction(dc.adressState,"asdasda");
        dc.sendKeysFunction(dc.zipCode,"54534");
        dc.sendKeysFunction(dc.payeePhoneNumber,"0555555555");
        dc.sendKeysFunction(dc.payeeAccount,"5435435");
        dc.sendKeysFunction(dc.payeeVerifyAccount,"5435435");
        dc.sendKeysFunction(dc.payeeAmount,"85$");*/
    }

    @Then("user click on the send payment button")
    public void userClickOnTheSendPaymentButton() {
        dc.clickFunction(dc.payeeSendPaymentBtn);
    }

   @Then("success message should displayed")
   public void successMessageShouldDisplayed() {
       dc.verifyContainsTextFunction(dc.paymentComplete,"success");
   }
}
