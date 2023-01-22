package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Order extends Parent{

    public Order(){
        PageFactory.initElements(WD.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class='item']/a)[4]")
    private WebElement jackets;

    @FindBy(xpath = "(//strong[@class='product name product-item-name']/a)[1]")
    private  WebElement  oliviaZiplight;

    @FindBy (xpath = "(//div[@class='fieldset']/div/div/div/div[3])[1]")
    private WebElement SizeMedium;

    @FindBy (xpath = "((//div[@role='listbox'])/div[1])[2]")
    private WebElement colorItem;

    @FindBy (xpath = "(//div[@class='product-options-bottom']//div)[5]/button/span")
    private WebElement addToCart;

    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    private WebElement messageShoppingCart;

    @FindBy (xpath = "(//div[@class='product-addto-links']/a/span)[1]")
    private WebElement addToWishlist;

    @FindBy (xpath ="//div[@class='minicart-wrapper']/a")
    private WebElement clickBasket;

    @FindBy (xpath = "//*[@id='top-cart-btn-checkout']")
    private WebElement checkOut;

    @FindBy (xpath = "(//*[@class='action viewcart'])/span")
    private WebElement viewAndEditBtn;

    @FindBy (xpath = "//a[@class='action action-edit']")
    private WebElement editItem;

    @FindBy (xpath = "(//div[@role='listbox']/div)[4]")
    private WebElement sizeLarge;

    @FindBy (xpath = "((//div[@role='listbox'])[2]/div)[3]")
    private WebElement purple;

    @FindBy (xpath = "(//*[@title='Update Cart'])/span")
    private WebElement updateCart;

    @FindBy (xpath = "(//div[@class='control qty'])/label/input")
    private WebElement quantity;

    @FindBy (xpath = "(//button[@name='update_cart_action'])[2]")
    private WebElement updateShoppingCart;


    @FindBy (xpath = "(//a[@title='Remove item'])[2]")
    private WebElement delete;

    @FindBy (xpath = "//strong[@class='product-item-name']/a")
    public List<WebElement> deleteConfirm;
    WebElement myElement;

    List<WebElement> myList;

    public void findAndClick(String strlement) {

        switch (strlement) {
            case "jackets": myElement = jackets;break;
            case "oliviaZiplight": myElement = oliviaZiplight;break;
            case "SizeMedium": myElement = SizeMedium;break;
            case "colorItem": myElement = colorItem;break;
            case "addToCart": myElement = addToCart;break;
            case "messageShoppingCart": myElement = messageShoppingCart;break;
            case "addToWishlist": myElement = addToWishlist;break;
            case "clickBasket": myElement = clickBasket;break;
            case "checkOut": myElement = checkOut;break;
            case "viewAndEditBtn": myElement = viewAndEditBtn;break;
            case "editItem": myElement = editItem;break;
            case "sizeLarge": myElement = sizeLarge;break;
            case "purple": myElement = purple;break;
            case "updateCart": myElement = updateCart;break;
            case "updateShoppingCart": myElement = updateShoppingCart;break;
            case "delete": myElement = delete;break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text)
    {
        switch (strlement)
        {
            case "messageShoppingCart" : myElement=messageShoppingCart;break;
        }

        verifyContainsTextFunction(myElement, text);
    }
    public void FindAndClear(){
        quantity.clear();
    }
    public void findAndSend(String element, String value) {

        switch (element) {
            case "quantity": myElement = quantity;break;

        }

        sendKeysFunction(myElement, value);
    }


   public void findAndAssert(String str){

        switch (str){
            case "quantity":myElement=quantity;break;
        }
        changeValueQuantity(myElement);

   }






}
