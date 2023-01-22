package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Address extends Parent {

    public Address() {
        PageFactory.initElements(WD.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='input-text'])[6]")
    private WebElement streetAddress;

    @FindBy(xpath = "(//input[@class='input-text'])[9]")
    private WebElement city;
    @FindBy(xpath = "(//input[@class='input-text'])[11]")
    private WebElement zipcode;

    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    private WebElement phone;

//    @FindBy(xpath = "(//input[@class='input-text'])[10]")
//    private WebElement stateProvince;

    @FindBy(xpath = "(//select[@class='select'])[2]")
    private WebElement country;

    @FindBy(xpath = "//option[@data-title='Turkey']")
    private WebElement selectTurkey;


    @FindBy(xpath = "//div[@id=\"shipping-method-buttons-container\"]//button")
    private WebElement next;

//    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
//    private WebElement sameAddressBtn;

    @FindBy(css = "[class='action primary checkout']>span")
    private WebElement placeOrder;

    @FindBy(css = "[data-ui-id='page-title-wrapper']")
    private WebElement orderMessage;


    @FindBy(xpath = " //div[@class='new-address-popup']/button/span")
    private WebElement newAddress;
    @FindBy(css = "li[class='opc-progress-bar-item _active']")
    public WebElement shipping;



    WebElement myElement;

    public void findAndSend(String element, String value) {

        switch (element) {

//            case "streetAddress": myElement = streetAddress;break;
//            case "city": myElement = city;break;
//            case "zipcode": myElement = zipcode;break;
//            case "phone": myElement = phone;break;
            //     case "stateProvince": myElement = stateProvince;break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strlement) {
        switch (strlement) {
//            case "country": myElement = country;break;
//            case "selectTurkey": myElement = selectTurkey;break;
              case "next": myElement = next;break;

          //  case "sameAddressBtn": myElement = sameAddressBtn;break;
            case "placeOrder": myElement = placeOrder;break;

}

        clickFunction(myElement);
    }





    public void findAndContainsText(String strlement, String text)
    {
        switch (strlement)
        {
            case "orderMessage" : myElement=orderMessage;break;

        }

        verifyContainsTextFunction(myElement, text);
    }



//    public void findAndClick(String strlement) {
//        switch (strlement) {
////            case "country": myElement = country;break;
////            case "selectTurkey": myElement = selectTurkey;break;
//            case "next": myElement = next;break;
//
//            //  case "sameAddressBtn": myElement = sameAddressBtn;break;
//            case "placeOrder": myElement = placeOrder;break;
//
//        }
//
//        actionClick(myElement);
//    }


   }