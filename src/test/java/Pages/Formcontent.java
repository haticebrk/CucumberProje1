package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Formcontent extends Parent {

    public Formcontent() {

        PageFactory.initElements(WD.getDriver(), this);
    }


    @FindBy(linkText = "Create an Account")
    private WebElement createAnAccount;
    @FindBy(css = "input[id='firstname']")
    private WebElement firstName;
    @FindBy(css = "input[id='lastname']")
    private WebElement lastname;
    @FindBy(name = "email")
    private WebElement email;

    @FindBy(xpath = "(//div[@class='control']/input)[5]")
    private WebElement password;

    @FindBy(xpath = "(//div[@class='control']/input)[6]")
    private WebElement confirmPassword;


    @FindBy(xpath = "//div//button[@title='Create an Account']")
    private WebElement CreateAccountButton;


    @FindBy(xpath = "(//ul[@class='header links']/li/a)[1]")
    private WebElement sigIn;

    @FindBy(css = "#email")
    private WebElement email1;

    @FindBy(name = "login[password]")
    private WebElement password1;

@FindBy(xpath ="(//div[@class='primary']//button)[1]")
  private WebElement sigIn1;
@FindBy(xpath = "(//li[@class='greet welcome']/span)[1]")
        private WebElement message;

@FindBy(xpath = "((//ul[@class='header links'])[2]/li/a)[3]")
    private WebElement SignOut;

@FindBy(xpath= "(//div[@role='alert']//div)[2]")
        private WebElement Messageinvalid;

@FindBy(xpath = "//span[text()='My Account']")
        private WebElement messageAccount;


    WebElement myElement;

    public void findAndSend(String element, String value) {

        switch (element) {
            case "firstName": myElement = firstName;break;
            case "lastname": myElement = lastname;break;
            case "email": myElement = email;break;
            case "password": myElement = password;break;
            case "confirmPassword": myElement = confirmPassword;break;
            case "CreateAccountButton": myElement = CreateAccountButton;break;
            case "email1": myElement = email1;break;
            case "password1": myElement = password1;break;

        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strlement) {

        switch (strlement) {
            case "createAnAccount": myElement = createAnAccount;break;
            case "CreateAccountButton": myElement = CreateAccountButton;break;
            case "sigIn": myElement = sigIn;break;
            case "sigIn1": myElement = sigIn1;break;
            case "SignOut": myElement = SignOut;break;

        }

        clickFunction(myElement);
    }
    public void findAndContainsText(String strlement, String text)
    {
        switch (strlement)
        {
            case "message" : myElement=message;break;
            case "Messageinvalid" : myElement=Messageinvalid;break;
            case "messageAccount" : myElement=messageAccount;break;

        }

        verifyContainsTextFunction(myElement, text);
    }

}
