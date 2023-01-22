package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu extends Parent{

    public TopMenu(){
        PageFactory.initElements(WD.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@role='menu']/li)[2]/a")
    private WebElement women;


WebElement myElement;
    public void findAndClick(String strlement) {

        switch (strlement) {
            case "women": myElement = women;break;

        }

        clickFunction(myElement);
    }

}
