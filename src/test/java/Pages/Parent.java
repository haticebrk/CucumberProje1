package Pages;

import Utilities.WD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(WD.getDriver(), Duration.ofSeconds(30));
    public void sendKeysFunction(WebElement element, String value)
    {
        WebDriverWait wait = new WebDriverWait(WD.getDriver(), Duration.ofSeconds(30));
        waitUntilVisible(element);
        scrollToelement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToelement(element);
       // wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToelement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) WD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void verifyContainsTextFunction(WebElement element, String value)
    {

        // waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you searched could'nt be find");
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }


    public void waitUntilLoading()
    {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    public void waitUntilVisibleUrl(String text){
        wait.until(ExpectedConditions.urlContains(text));
    }



    public void changeValueQuantity(WebElement element) {
        Assert.assertNotEquals(element.getAttribute("value"), "1", "urun eklemnedi");

//        if(!element.getAttribute("value").equals("1")) { 2.yol
//
//            System.out.println("urun eklendi");
//
//
//        }else System.out.println("urun eklenmedi");
    }

public  void actionClick(WebElement element){
    waitUntilClickable(element);
    scrollToelement(element);

    new Actions(WD.getDriver()).moveToElement(element).click().perform();

}




}
