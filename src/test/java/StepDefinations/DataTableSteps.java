package StepDefinations;

import Pages.Address;
import Pages.Formcontent;
import Pages.Order;
import Pages.TopMenu;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {
     Formcontent fc=new Formcontent();
    Order or=new Order();
     TopMenu tm=new TopMenu();
    Address ad=new Address();

    @And("User  sending the keys in the Form Content")
    public void userSendingTheKeysInTheFormContent(DataTable elemanlar) {
        List<List<String>> listElemanlar= elemanlar.asLists(String.class);

        for(int i=0;i< listElemanlar.size() ; i++ )
            fc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1) );


    }

    @And("Click on the element in the Form")
    public void clickOnTheElementInTheForm(DataTable elemanlar) {
        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar)
            fc.findAndClick(eleman);

    }


    @And("Click on the element in the Top Menu")
    public void clickOnTheElementInTheTopMenu(DataTable elemanlar) {

        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar)
          tm.findAndClick(eleman);

    }

    @And("Click on the element in the Order")
    public void clickOnTheElementInTheOrder(DataTable elemanlar){

        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar)
            or.findAndClick(eleman);

    }

    @When("User send the keys in the shipping address")
    public void userSendTheKeysInTheShippingAddress(DataTable elemanlar) {
        List<List<String>> listElemanlar= elemanlar.asLists(String.class);

        for(int i=0;i< listElemanlar.size() ; i++ )
            ad.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1) );

    }

    @And("User clear the quantity")
    public void userClearTheQuantity() {
        or.FindAndClear();
    }

    @When("User sending the keys in the Order")
    public void userSendingTheKeysInTheOrder(DataTable elemanlar) {
        List<List<String>> listElemanlar= elemanlar.asLists(String.class);

        for(int i=0;i< listElemanlar.size() ; i++ )
            or.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1) );

    }

    @And("Click on the element in the addres lines")
    public void clickOnTheElementInTheAddresLines(DataTable elemanlar) throws InterruptedException {

        List<String> listElemanlar=elemanlar.asList(String.class);
        for(String eleman:listElemanlar) {
            Thread.sleep(3000);
           ad.findAndClick(eleman);
        }

    }
}
