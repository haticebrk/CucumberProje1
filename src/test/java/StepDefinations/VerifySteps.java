package StepDefinations;

import Pages.Address;
import Pages.Formcontent;
import Pages.Order;
import Utilities.WD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class VerifySteps {


    Formcontent fc = new Formcontent();
    Order or=new Order();
    Address ad=new Address();


    @Given("Navigate to Luna")
    public void navigateToLuna() {
        WD.getDriver().get("https://magento.softwaretestingboard.com/");
        WD.getDriver().manage().window().maximize();
    }

    @Then("User Should login successfully")
    public void userShouldLoginSuccessfully() {
        fc.findAndContainsText("message", "Welcome");
    }


    @Then("Invalid message should be displayed")
    public void invalidMessageShouldBeDisplayed() {
        fc.findAndContainsText("Messageinvalid", "incorrect");

    }

    @Then("User should be able to successfully get an account")
    public void userShouldBeAbleToSuccessfullyGetAnAccount() {

        fc.findAndContainsText("messageAccount", "My Account");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        or.findAndContainsText("messageShoppingCart", "shopping");

    }

    @Then("Order message should be displayed")
    public void orderMessageShouldBeDisplayed() {
        ad.waitUntilVisibleUrl("success");
        ad.findAndContainsText("orderMessage","Thank");
    }

    @Then("User delete item successfully")
    public void userDeleteItemSuccessfully() {

        List<WebElement> list=WD.getDriver().findElements(By.xpath("//strong[@class='product-item-name']/a"));
        for(WebElement e :list)

            Assert.assertFalse(e.getText().contains("Olivia 1/4 Zip"));
    }

    @Then("User change quantity item successfully")
    public void userChangeQuantityItemSuccessfully() {
       or.findAndAssert("quantity");
    }


}