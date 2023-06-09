package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

// POM : Page Object Model
public class DialogContent extends Parent{
    // kullanıcı ile dialogla veri alan bölümler

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement Register;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement adressStreet;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement adressCity;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement adressState;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement repeatPassword;
    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerBtn;
    @FindBy(xpath = "//*[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMessage;
    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logOut;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username1;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password1;
    @FindBy(xpath = "//*[text()='The username and password could not be verified.']")
    public WebElement failMessage;
    @FindBy(xpath = "//*[text()='Bill Pay']")
    public WebElement billPay;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement payeeSendPaymentBtn;
    @FindBy(xpath = "//input[@ng-model='amount']")
    public WebElement payeeAmount;
    @FindBy(xpath = "//input[@ng-model='verifyAccount']")
    public WebElement payeeVerifyAccount;
    @FindBy(xpath = "//input[@ng-model='payee.name']")
    public WebElement payeeName;
    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payeeAdressStreet;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payeeZipCode;
    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payeeAdressCity;
    @FindBy(xpath = "//input[@ng-model='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payeeState;
    @FindBy(xpath = "//input[@ng-model='payee.phoneNumber']")
    public WebElement payeePhoneNumber;
    @FindBy(xpath = "//p[text()='The username and password could not be verified.']")
    public WebElement Error;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[@ng-show='showResult']")
    public WebElement paymentComplete;



    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "payeeName" : return payeeName;
            case "payeeAdressStreet" : return payeeAdressStreet;
            case "payeeAdressCity" : return payeeAdressCity;
            case "payeeState" : return payeeState;
            case "payeeZipCode" : return payeeZipCode;
            case "payeePhoneNumber" : return payeePhoneNumber;
            case "payeeAccount" : return payeeAccount;
            case "payeeVerifyAccount" : return payeeVerifyAccount;
            case "payeeAmount" : return payeeAmount;
        }
        return null;
    }

}